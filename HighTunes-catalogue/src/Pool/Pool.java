package Pool;

import java.rmi.NoSuchObjectException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Stack;

public class Pool<RemoteType extends Remote & Poolable, ImplType extends RemoteType>
{
	private int taille;
	private Stack<ImplType> libre;
	private HashMap<RemoteType, ImplType> utilise;
	
	public Pool(int taille, Class<ImplType> implTypeClass) throws ErreurPool
	{
		this.taille = taille;
		libre = new Stack<ImplType>();
		utilise = new HashMap<RemoteType, ImplType>();
		ImplType t = null;
		
		for (int i = 0; i < taille; i++)
		{
			try
			{
				t = implTypeClass.newInstance();
			} catch (InstantiationException e)
			{
				throw new ErreurPool("Erreur lors de l'instanciation.");
			} catch (IllegalAccessException e)
			{
				throw new ErreurPool("Erreur lors de l'instanciation.");
			}
			
			libre.push(t);
		}
	}
	
	public boolean existeLibre()
	{
		return !libre.isEmpty();
	}
	
	public boolean estLibre(ImplType e)
	{
		return libre.contains(e);
	}
	
	public int size()
	{
		return taille;
	}
	
	public int nbEltRestant()
	{
		return libre.size();
	}
	
	@SuppressWarnings("unchecked")
	public RemoteType getNewElt() throws ErreurPool
	{
		if (!existeLibre())
			throw new PoolPleine();
		else
		{
			ImplType eltADonner = libre.pop();
			RemoteType sEltADonner;
			try
			{
				sEltADonner = (RemoteType) UnicastRemoteObject.exportObject(eltADonner, 0);
			} catch (RemoteException e)
			{
				throw new ErreurPool("RemoteException.");
			}
			utilise.put(sEltADonner, eltADonner);
			System.out.println(sEltADonner);
			return sEltADonner;
		}
	}
	
	public void libereElt(RemoteType elt)
	{
		if (elt != null && utilise.containsKey(elt))
		{
			libre.push(utilise.get(elt));
			utilise.get(elt).init();
			utilise.remove(elt);
			try
			{
				UnicastRemoteObject.unexportObject(elt, true);
			} catch (NoSuchObjectException e)
			{
			}
		}
	}
	
}
