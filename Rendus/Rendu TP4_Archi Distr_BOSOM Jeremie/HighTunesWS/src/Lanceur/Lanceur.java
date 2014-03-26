package Lanceur;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import javax.xml.ws.Endpoint;
import HighTunes.HighTunes;

public class Lanceur
{
	public static void main(String args[])
	{
		HighTunes impl = HighTunes.getInstance();
		Endpoint endpoint1 = Endpoint.create(impl);
		
		endpoint1.publish("http://localhost:1664/truc");
		
		System.err.println("Saisir (car + return) pour arrêter le endpoint.");
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		endpoint1.stop();
		System.out.println("Endpoint stoppé !");
	}
	
	public static Date getnewDate(int jour, int mois, int annee)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(annee, mois-1, jour-1);
		return cal.getTime();
	}
	
}
