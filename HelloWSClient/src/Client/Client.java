package Client;

import hightunes.ArticleInexistant_Exception;
import hightunes.ErreurPanier_Exception;
import hightunes.HighTunes;
import hightunes.HighTunesService;

public class Client
{
	private static int idUser;
	
	public static void main(String[] args)
	{
		HighTunesService s = new HighTunesService();
		HighTunes hT = s.getHighTunesPort();
		
		idUser = hT.connexion();
		
		System.out.println("On essaie d'ajouter un article au panier.");
		try
		{
			hT.addToPanier(idUser, hT.getArticle(0), 8);
		} catch (ArticleInexistant_Exception e)
		{
			System.out.println("L'article demandé n'existe pas.");
		}
		System.out.println(hT.panierToString(idUser));
		
		System.out.println("\nOn essaie de modifier la quantité de l'article.");
		try
		{
			hT.modifierQuantite(idUser, hT.getArticle(0), 1);
		} catch (ErreurPanier_Exception e)
		{
			System.out.println("L'article que vous voulez enlever n'est pas présent dans le panier.");
		} catch (ArticleInexistant_Exception e)
		{
			System.out.println("L'article demandé n'existe pas.");
		}
		
		System.out.println("Etat du panier après modification.\n" + hT.panierToString(idUser));
		
		System.out.println("\nOn essaie de finaliser notre commande.");
		try
		{
			System.out.println(hT.commander(idUser));
		} catch (ErreurPanier_Exception e)
		{
			
			System.out.println("Impossible de commander le panier est vide.");
		}
		
		System.out.println("Etat du panier après commande.\n" + hT.panierToString(idUser));
		
		System.out.println("\nOn réessaie de finaliser notre commande avec un panier vide pour vérifier la levée d'exception.");
		try
		{
			System.out.println(hT.commander(idUser) + "Erreur, la commande n'a pas levée d'exception.");
		} catch (ErreurPanier_Exception e)
		{
			System.out.println("Comme attendu, la commande n'a pas pu être effectuée.");
		}
		
		hT.deconnexion(idUser);
		System.out.println("\n\nDéconnexion réussie.\n\n");
		
		System.out.println("Affichage de la description d'un article pour essayer.");
		try
		{
			System.out.println(hT.getArticle(0).getDescription() + "\n");
		} catch (ArticleInexistant_Exception e)
		{
			System.out.println("L'article demandé n'existe pas.");
		}
		
		System.out.println("Essai de demande d'un article inexistant.");
		try
		{
			System.out.println(hT.getArticle(20).getDescription() + ". Erreur, la fonction aurait du lever une exception.\n");
		} catch (ArticleInexistant_Exception e)
		{
			System.out.println("Comme attendu, l'article demandé n'existe pas.");
		}
		
	}
	
}
