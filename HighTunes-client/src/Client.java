import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client
{
	private static int idUser;
	
	public static void main(String[] args)
	{
		try
		{
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			HighTunes hT = (HighTunes) registry.lookup("HighTunes");
			
			idUser = hT.connexion();
			hT.addToPanier(idUser, hT.getArticle(0), 8);
			System.out.println(hT.panierToString(idUser));
			hT.modifierQuantite(idUser, hT.getArticle(0), 1);
			System.out.println(hT.panierToString(idUser));
			System.out.println(hT.commander(idUser));
			System.out.println(hT.panierToString(idUser));
			hT.deconnexion(idUser);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
