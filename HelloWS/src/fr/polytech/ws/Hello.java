package fr.polytech.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello
{
	@WebMethod
	public String sayHello(String s)
	{
		return "Hello " + s;
	}
	
}