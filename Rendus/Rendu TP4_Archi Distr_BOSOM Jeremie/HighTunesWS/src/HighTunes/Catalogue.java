package HighTunes;

import java.util.HashMap;
import java.util.Map.Entry;
import Lanceur.Lanceur;

public class Catalogue
{
	private static Catalogue instance = new Catalogue();
	private HashMap<Integer, Article> listeArticle;
	
	private Catalogue()
	{
		listeArticle = getSGBDArticle();
	}
	
	public static Catalogue getInstance()
	{
		return instance;
	}
	
	public Article getArticle(int cle) throws ArticleInexistant
	{
		if (listeArticle.containsKey(cle))
			return listeArticle.get(cle);
		else
			throw new ArticleInexistant();
	}
	
	public int getNbTotalArticle()
	{
		if (listeArticle != null)
			return listeArticle.size();
		else
			return 0;
	}
	
	private HashMap<Integer, Article> getSGBDArticle()
	{
		int key = 0;
		HashMap<Integer, Article> sgbd = new HashMap<Integer, Article>();
		
		Article art = new Article();
		art.setDescription("DelaDap - Crazy Swing");
		art.setPrix(1);
		art.setDateDisponibilite(null);
		sgbd.put(key++, art);
		
		art = new Article();
		art.setDescription("Alice Francis - Shoot Him Down");
		art.setPrix(1);
		art.setDateDisponibilite(null);
		sgbd.put(key++, art);
		
		art = new Article();
		art.setDescription("Black Cat Zoot - Dirty Dance");
		art.setPrix(1);
		art.setDateDisponibilite(null);
		sgbd.put(key++, art);
		
		art = new Article();
		art.setDescription("DelaDap - Georgian Lesson");
		art.setPrix(2);
		art.setDateDisponibilite(Lanceur.getnewDate(2015, 04, 01));
		sgbd.put(key++, art);
		
		return sgbd;
	}
	
	public String toString()
	{
		String ret = "Catalogue\n----------\n";
		for (Entry<Integer, Article> ent : listeArticle.entrySet())
		{
			ret += ent.getValue().toString() + "\n";
		}
		
		return ret;
	}
	
	public HashMap<Integer, Article> getListeArticle()
	{
		return listeArticle;
	}
	
	public static void setInstance(Catalogue instance)
	{
		Catalogue.instance = instance;
	}
	
	public void setListeArticle(HashMap<Integer, Article> listeArticle)
	{
		this.listeArticle = listeArticle;
	}
	
}
