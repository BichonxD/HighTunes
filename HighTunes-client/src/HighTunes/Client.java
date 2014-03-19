package HighTunes;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import HighTunes.HighTunes;
import Pool.Hello;

public class Client
{
	private static int idUser;
	private static Hello hell;
	
	public static void main(String[] args)
	{
		try
		{
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			HighTunes hT = (HighTunes) registry.lookup("HighTunes");
			
			//testClient(hT);
			testPool(hT);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void testClient(HighTunes hT) throws RemoteException
	{
		idUser = hT.connexion();
		hT.addToPanier(idUser, hT.getArticle(0), 8);
		System.out.println(hT.panierToString(idUser));
		hT.modifierQuantite(idUser, hT.getArticle(0), 1);
		System.out.println(hT.panierToString(idUser));
		System.out.println(hT.commander(idUser));
		System.out.println(hT.panierToString(idUser));
		hT.deconnexion(idUser);
	}
	
	public static void testPool(HighTunes hT) throws RemoteException
	{
		hell = hT.connexionV2("Toto");
		System.out.println(hell);
		hell.setName("Toto");
		System.out.println(hell.ditBonjour());
		
		/*
		pan.addToPanier(hT.getArticle(0), 8);
		System.out.println(pan.toString());
		
		pan.modifierQuantite(hT.getArticle(0), 1);
		System.out.println(pan.toString());
		System.out.println(pan.commander());
		System.out.println(pan.toString());
		*/
		hT.deconnexionV2(hell);
	}
	
}
