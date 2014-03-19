package HighTunes;

import java.rmi.*;
import Panier.*;
import Pool.*;

public class HighTunesImpl implements HighTunes
{
	private static HighTunesImpl instance = new HighTunesImpl();
	private Catalogue cat;
	private static int currentID = 0;
	private Pool<Panier, PanierImpl> poolPanier;
	
	private HighTunesImpl()
	{
		cat = Catalogue.getInstance();
		
		try
		{
			poolPanier = new Pool<Panier, PanierImpl>(10, PanierImpl.class);
		} catch (ErreurPool e)
		{
			e.printStackTrace();
		}
	}
	
	public static HighTunesImpl getInstance() throws RemoteException
	{
		return instance;
	}
	
	private static int getNewID()
	{
		return currentID++;
	}
	
	public int connexion() throws RemoteException
	{
		return getNewID();
	}
	
	public Article getArticle(int cle) throws RemoteException, ArticleInexistant
	{
		return cat.getArticle(cle);
	}
	
	public int getNbTotalArticle() throws RemoteException
	{
		return cat.getNbTotalArticle();
	}

	public Panier getPanier() throws RemoteException
	{
		try
		{
			return poolPanier.getNewElt();
		}
		catch (ErreurPool e)
		{
			return null;
		}
	}

	public void libererPanier(Panier h) throws RemoteException
	{
		poolPanier.libereElt(h);
	}
	
	public String toString()
	{
		String ret = "Catalogue de HighTunes\n--------------------\n";
		cat.toString();
		return ret;
	}
	
}
