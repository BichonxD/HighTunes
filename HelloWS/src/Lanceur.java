
import java.util.Scanner;
import javax.xml.ws.Endpoint;
import fr.polytech.ws.Hello;

public class Lanceur
{
	public static void main(String args[])
	{
		Hello impl = new Hello();
		Endpoint endpoint1 = Endpoint.create(impl);
		
		endpoint1.publish("http://localhost:1664/truc");
		
		System.err.println("Saisir (car + return) pour arrêter le endpoint.");
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		endpoint1.stop();
		System.out.println("Endpoint stoppé !");
	}
	
}
