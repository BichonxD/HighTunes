package Pool;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote, Poolable
{
	public String ditBonjour() throws RemoteException;
	public void setName(String name) throws RemoteException;
}
