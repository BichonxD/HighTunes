package Pool;

import java.rmi.RemoteException;

public class HelloImpl implements Hello
{
	private String name;
	
	public HelloImpl()
	{
		this.name = null;
	}
	
	public String ditBonjour() throws RemoteException
	{
		return "Bonjour, je suis " + name + ".";
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		
		try
		{
			HelloImpl h = (HelloImpl) obj;
			if(h.name.equals(this.name))
				return true;
			else
				return false;
		} catch(ClassCastException e)
		{
			return false;
		}
	}

	public void init()
	{
		name = null;
	}
	
	public void setName(String name) throws RemoteException
	{
		this.name = name;
	}
}
