import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int cle;
	private static int currentCle = 0;
	private String description;
	private float prix;
	private Date dateDisponibilite;
	
	/**
	 * @param description
	 * @param prix
	 * @param dateDisponibilite
	 *            , est nulle si le produit est immediatement disponible
	 */
	public Article(String description, float prix, Date dateDisponibilite)
	{
		cle = getnewCle();
		this.description = description;
		this.prix = prix;
		this.dateDisponibilite = dateDisponibilite;
	}
	
	private int getnewCle()
	{
		return currentCle++;
	}
	
	public int getCle()
	{
		return cle;
	}
	
	public static int getCurrentCle()
	{
		return currentCle;
	}
	
	/**
	 * @return null si le produit est disponible
	 */
	public Date getDateDisponibilite()
	{
		return dateDisponibilite;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public float getPrix()
	{
		return prix;
	}
	
	public String toString()
	{
		return "\"" + description + "\", prix : " + prix + ((dateDisponibilite == null) ? "€, disponible." : "€, disponible au " + dateDisponibilite.toString());
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		
		try
		{
			Article art = (Article) obj;
			if(art.cle == this.cle)
				return true;
			else
				return false;
		} catch(ClassCastException e)
		{
			return false;
		}
	}
}
