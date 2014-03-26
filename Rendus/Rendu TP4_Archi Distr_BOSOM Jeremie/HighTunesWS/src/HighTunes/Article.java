package HighTunes;

import java.util.Date;

public class Article
{	
	private int cle;
	private static int currentCle = 0;
	private String description;
	private float prix;
	private Date dateDisponibilite;
	
	public Article()
	{
		cle = getnewCle();
		this.description = "Produit Non Initialisé";
		this.prix = 0;
		this.dateDisponibilite = null;
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
		if (obj == null)
			return false;
		
		try
		{
			Article art = (Article) obj;
			if (art.cle == this.cle)
				return true;
			else
				return false;
		} catch (ClassCastException e)
		{
			return false;
		}
	}
	
	public void setCle(int cle)
	{
		this.cle = cle;
	}
	
	public static void setCurrentCle(int currentCle)
	{
		Article.currentCle = currentCle;
	}
	
	public void setDateDisponibilite(Date dateDisponibilite)
	{
		this.dateDisponibilite = dateDisponibilite;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setPrix(float prix)
	{
		this.prix = prix;
	}
	
}
