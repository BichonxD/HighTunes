package Pool;

import java.rmi.RemoteException;

public class ErreurPool extends RemoteException
{
	private static final long serialVersionUID = 1L;
	
	public ErreurPool()
	{
		super();
	}
	
	public ErreurPool(String s)
	{
		super(s);
	}
	
}
