package HighTunes;

import java.util.HashMap;
import java.util.Map.Entry;
import javax.jws.WebMethod;
import javax.jws.WebService;
import Panier.ErreurPanier;
import Panier.Panier;

@WebService
public class HighTunes
{
	private static HighTunes instance = new HighTunes();
	private Catalogue cat;
	private HashMap<Integer, Panier> listePaniers;
	private static int currentID = 0;
	
	private HighTunes()
	{
		cat = Catalogue.getInstance();
		listePaniers = new HashMap<Integer, Panier>();
	}
	
	public static HighTunes getInstance()
	{
		return instance;
	}
	
	private static int getNewID()
	{
		return currentID++;
	}
	
	@WebMethod
	public int connexion()
	{
		int id = getNewID();
		Panier pan = new Panier();
		pan.setIdUtilisateur(id);
		listePaniers.put(id, pan);
		return id;
	}
	
	@WebMethod
	public void deconnexion(int id)
	{
		listePaniers.get(id).viderPanier();
		listePaniers.remove(id);
	}
	
	@WebMethod
	public Article getArticle(int cle) throws ArticleInexistant
	{
		return cat.getArticle(cle);
	}
	
	@WebMethod
	public int getNbTotalArticle()
	{
		return cat.getNbTotalArticle();
	}
	
	@WebMethod
	public void addToPanier(int idUser, Article art, int quantite) throws ArticleInexistant
	{
		listePaniers.get(idUser).addToPanier(art, quantite);
	}
	
	@WebMethod
	public float calculCoutPanier(int idUser)
	{
		return listePaniers.get(idUser).calculCoutPanier();
	}
	
	@WebMethod
	public String commander(int idUser) throws ErreurPanier
	{
		return listePaniers.get(idUser).commander();
	}
	
	@WebMethod
	public void modifierQuantite(int idUser, Article art, int nb) throws ErreurPanier
	{
		listePaniers.get(idUser).modifierQuantite(art, nb);
	}
	
	@WebMethod
	public void suppressionArticle(int idUser, Article art)
	{
		listePaniers.get(idUser).suppressionArticle(art);
	}
	
	public void viderPanier(int idUser)
	{
		listePaniers.get(idUser).viderPanier();
	}
	
	@WebMethod
	public String catalogueToString()
	{
		return cat.toString();
	}
	
	@WebMethod
	public String panierToString(int idUtilisateur)
	{
		return listePaniers.get(idUtilisateur).toString();
	}
	
	@WebMethod
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
	
	public Catalogue getCat()
	{
		return cat;
	}
	
	public static int getCurrentID()
	{
		return currentID;
	}
	
	public HashMap<Integer, Panier> getListePaniers()
	{
		return listePaniers;
	}
	
	public static void setInstance(HighTunes instance)
	{
		HighTunes.instance = instance;
	}
	
	public void setCat(Catalogue cat)
	{
		this.cat = cat;
	}
	
	public static void setCurrentID(int currentID)
	{
		HighTunes.currentID = currentID;
	}
	
	public void setListePaniers(HashMap<Integer, Panier> listePaniers)
	{
		this.listePaniers = listePaniers;
	}
	
}
