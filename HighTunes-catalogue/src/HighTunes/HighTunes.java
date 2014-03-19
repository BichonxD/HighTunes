package HighTunes;
import java.rmi.Remote;
import java.rmi.RemoteException;

import Pool.Hello;

public interface HighTunes extends Remote
{
	public int getNbTotalArticle() throws RemoteException;
	public Article getArticle(int cle) throws RemoteException, ArticleInexistant;
	public void addToPanier(int idUser, Article art, int quantite) throws RemoteException, ArticleInexistant;
	public void addToPanier(int idUser, Article art) throws RemoteException, ArticleInexistant;
	public void modifierQuantite(int idUser, Article art, int nb) throws RemoteException, ErreurPanier;
	public void suppressionArticle(int idUser, Article art) throws RemoteException;
	public void viderPanier(int idUser) throws RemoteException;
	public float calculCoutPanier(int idUser) throws RemoteException;
	public String commander(int idUser) throws RemoteException, ErreurPanier;
	public int connexion() throws RemoteException;
	public void deconnexion(int id) throws RemoteException;
	public String catalogueToString() throws RemoteException;
	public String panierToString(int idUtilisateur) throws RemoteException;
	
	public Hello connexionV2(String name) throws RemoteException;
	public void deconnexionV2(Hello h) throws RemoteException;
	
}
