package HighTunes;

import java.rmi.Remote;
import java.rmi.RemoteException;
import Panier.Panier;

public interface HighTunes extends Remote
{
	public int connexion() throws RemoteException;
	public Article getArticle(int cle) throws RemoteException, ArticleInexistant;
	public int getNbTotalArticle() throws RemoteException;
	public Panier getPanier() throws RemoteException;
	public void libererPanier(Panier h) throws RemoteException;
	public String contenuToString() throws RemoteException;
}
