package HighTunes;
import java.util.ArrayList;
import java.util.HashMap;

public class Panier
{
	private int idUtilisateur;
	private ArrayList<Article> articlePanier;
	// HashMap contenant la cle d'un article et le nombre de cet article dans le panier.
	private HashMap<Integer, Integer> nbArticle;
	private static int currentNbCommande = 0;
	
	public Panier(int idUtilisateur)
	{
		this.idUtilisateur = idUtilisateur;
		articlePanier = new ArrayList<Article>();
		nbArticle = new HashMap<Integer, Integer>();
	}
	
	public void addToPanier(Article art, int quantite) throws ArticleInexistant
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
	public void addToPanier(Article art) throws ArticleInexistant
	{
		addToPanier(art, 1);
	}
	
	/**
	 * Si l'article n'est pas dans le panier remonte une ErreurPanier.
	 * 
	 * @param art
	 * @param nb
	 */
	public void modifierQuantite(Article art, int nb) throws ErreurPanier
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
	public void suppressionArticle(Article art)
	{
		if (articlePanier.contains(art) && nbArticle.containsKey(art.getCle()))
		{
			articlePanier.remove(art);
			nbArticle.remove(art.getCle());
		}
	}
	
	public void viderPanier()
	{
		articlePanier.removeAll(articlePanier);
		nbArticle.clear();
	}
	
	public float calculCoutPanier()
	{
		float result = 0;
		
		for (Article art : articlePanier)
		{
			result += art.getPrix() * (float) nbArticle.get(art.getCle());
		}
		
		return result;
	}
	
	public String commander() throws ErreurPanier
	{
		if (!articlePanier.isEmpty())
		{
			String ret = "Commande " + getnewNbCommande() + " passée avec les articles :\n" + this.toString();
			viderPanier();
			return ret;
		} else
			throw new ErreurPanier();
	}
	
	private static int getnewNbCommande()
	{
		return currentNbCommande++;
	}
	
	public int getIdUtilisateur()
	{
		return idUtilisateur;
	}
	
	public String toString()
	{
		String ret = "Panier de l'utilisateur " + idUtilisateur + "\nListe des articles\n----------\n";
		for (Article art : articlePanier)
		{
			ret += art.toString() + " Quantité : " + nbArticle.get(art.getCle()) + "\n";
		}
		
		return ret;
	}
	
}
