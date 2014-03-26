package Panier;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import HighTunes.Article;
import HighTunes.ArticleInexistant;

public class PanierImpl implements Panier
{
	private ArrayList<Article> articlePanier;
	// HashMap contenant la cle d'un article et le nombre de cet article dans le panier.
	private HashMap<Integer, Integer> nbArticle;
	private static int currentNbCommande = 0;
	
	public PanierImpl()
	{
		articlePanier = new ArrayList<Article>();
		nbArticle = new HashMap<Integer, Integer>();
	}
	
	public void addToPanier(Article art, int quantite) throws RemoteException, ArticleInexistant
	{
		if (art != null && quantite > 0)
		{
			if(articlePanier.contains(art))
			{
				int qttActuelle = nbArticle.get(art.getCle());
				nbArticle.put(art.getCle(), qttActuelle + quantite);
			}
			else
			{
				articlePanier.add(art);
				nbArticle.put(art.getCle(), quantite);
			}
		} else
			throw new ArticleInexistant();
	}
	
	/**
	 * N'ajoute q'un seul exemplaire de l'article au panier.
	 * 
	 * @param art
	 */
	public void addToPanier(Article art) throws RemoteException, ArticleInexistant
	{
		addToPanier(art, 1);
	}
	
	/**
	 * Si l'article n'est pas dans le panier remonte une ErreurPanier.
	 * 
	 * @param art
	 * @param nb
	 */
	public void modifierQuantite(Article art, int nb) throws RemoteException, ErreurPanier
	{
		if (articlePanier.contains(art) && nbArticle.containsKey(art.getCle()))
			nbArticle.put(art.getCle(), nb);
		else
			throw new ErreurPanier();
	}
	
	/**
	 * Si l'article n'est pas dans le panier il ne se passe rien.
	 * 
	 * @param art
	 */
	public void suppressionArticle(Article art) throws RemoteException
	{
		if (articlePanier.contains(art) && nbArticle.containsKey(art.getCle()))
		{
			articlePanier.remove(art);
			nbArticle.remove(art.getCle());
		}
	}
	
	public void viderPanier() throws RemoteException
	{
		articlePanier.removeAll(articlePanier);
		nbArticle.clear();
	}
	
	public float calculCoutPanier() throws RemoteException
	{
		float result = 0;
		
		for (Article art : articlePanier)
		{
			result += art.getPrix() * (float) nbArticle.get(art.getCle());
		}
		
		return result;
	}
	
	public String commander() throws RemoteException, ErreurPanier
	{
		if (!articlePanier.isEmpty())
		{
			String ret = "Commande " + getnewNbCommande() + " passée avec les articles :\n" + this.contenuToString();
			viderPanier();
			return ret;
		} else
			throw new ErreurPanier();
	}
	
	private static int getnewNbCommande()
	{
		return currentNbCommande++;
	}
	
	public String contenuToString()throws RemoteException
	{
		String ret = "\nListe des articles\n----------\n";
		for (Article art : articlePanier)
		{
			ret += art.toString() + " Quantité : " + nbArticle.get(art.getCle()) + "\n";
		}
		
		return ret;
	}

	public void reInit() throws RemoteException
	{
		viderPanier();
	}
	
}
