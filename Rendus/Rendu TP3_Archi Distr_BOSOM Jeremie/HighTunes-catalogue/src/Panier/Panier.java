package Panier;

import java.rmi.Remote;
import java.rmi.RemoteException;
import HighTunes.Article;
import HighTunes.ArticleInexistant;
import Pool.Poolable;

public interface Panier extends Remote, Poolable
{
	public void addToPanier(Article art, int quantite) throws RemoteException, ArticleInexistant;
	public void addToPanier(Article art) throws RemoteException, ArticleInexistant;
	public void modifierQuantite(Article art, int nb) throws RemoteException, ErreurPanier;
	public void suppressionArticle(Article art) throws RemoteException;
	public void viderPanier() throws RemoteException;
	public float calculCoutPanier() throws RemoteException;
	public String commander() throws RemoteException, ErreurPanier;
	public String contenuToString() throws RemoteException;
}
