import fr.polytech.ws.Hello;
import fr.polytech.ws.HelloService;

public class Client
{
	public static void main(String[] args)
	{
		HelloService s = new HelloService();
		Hello port = s.getHelloPort();
		
		System.out.println(port.sayHello(" Toto"));
	}
	
}
