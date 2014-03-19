import java.rmi.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class HighTunesImpl implements HighTunes
{
	private static HighTunesImpl instance = new HighTunesImpl();
	private Catalogue cat;
	private HashMap<Integer, Panier> listePaniers;
	private static int currentID = 0;
	
	private HighTunesImpl()
	{
		cat = Catalogue.getInstance();
		listePaniers = new HashMap<Integer, Panier>();
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
		int id = getNewID();
		listePaniers.put(id, new Panier(id));
		return id;
	}
	
	public void deconnexion(int id) throws RemoteException
	{
		listePaniers.get(id).viderPanier();
		listePaniers.remove(id);
	}
	
	public Article getArticle(int cle) throws RemoteException, ArticleInexistant
	{
		return cat.getArticle(cle);
	}
	
	public int getNbTotalArticle() throws RemoteException
	{
		return cat.getNbTotalArticle();
	}
	
	public void addToPanier(int idUser, Article art, int quantite) throws RemoteException, ArticleInexistant
	{
		listePaniers.get(idUser).addToPanier(art, quantite);
	}
	
	public void addToPanier(int idUser, Article art) throws RemoteException, ArticleInexistant
	{
		listePaniers.get(idUser).addToPanier(art);
	}
	
	public float calculCoutPanier(int idUser) throws RemoteException
	{
		return listePaniers.get(idUser).calculCoutPanier();
	}
	
	public String commander(int idUser) throws RemoteException, ErreurPanier
	{
		return listePaniers.get(idUser).commander();
	}
	
	public void modifierQuantite(int idUser, Article art, int nb) throws RemoteException, ErreurPanier
	{
		listePaniers.get(idUser).modifierQuantite(art, nb);
	}
	
	public void suppressionArticle(int idUser, Article art) throws RemoteException
	{
		listePaniers.get(idUser).suppressionArticle(art);
	}
	
	public void viderPanier(int idUser) throws RemoteException
	{
		listePaniers.get(idUser).viderPanier();
	}
	
	public String catalogueToString() throws RemoteException
	{
		return cat.toString();
	}
	
	public String panierToString(int idUtilisateur) throws RemoteException
	{
		return listePaniers.get(idUtilisateur).toString();
	}
	
	public String toString()
	{
		String ret = "HighTunes\n--------------------\n";
		cat.toString();
		for (Entry<Integer, Panier> ent : listePaniers.entrySet())
		{
			ret += ent.getValue().toString() + "\n";
		}
		
		return ret;
	}
	
}
