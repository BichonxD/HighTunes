package Pool;

import java.rmi.RemoteException;

public interface Poolable
{
	public void reInit() throws RemoteException;
}
