package Serveur;

import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.Calendar;
import java.util.Date;

import HighTunes.HighTunes;
import HighTunes.HighTunesImpl;

public class Serveur
{
	public static void main(String[] args)
	{
		try
		{
			HighTunes hT = HighTunesImpl.getInstance();
			HighTunes sHT = (HighTunes) UnicastRemoteObject.exportObject(hT, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("HighTunes", sHT);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Date getnewDate(int jour, int mois, int annee)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(annee, mois-1, jour-1);
		return cal.getTime();
	}
	
}
