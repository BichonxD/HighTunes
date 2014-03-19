package HighTunes;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import HighTunes.HighTunes;
import Pool.Hello;

public class Client
{
	private static Panier pan;
	
	public static void main(String[] args)
	{
		try
		{
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			HighTunes hT = (HighTunes) registry.lookup("HighTunes");
			
			pan = hT.getPanier();
			
			pan.addToPanier(hT.getArticle(0), 8);
			System.out.println(pan.toString());
			
			pan.modifierQuantite(hT.getArticle(0), 1);
			System.out.println(pan.toString());
			System.out.println(pan.commander());
			System.out.println(pan.toString());
			
			hT.libererPanier(pan);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
