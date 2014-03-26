package HighTunes;
import java.util.HashMap;
import java.util.Map.Entry;

import Serveur.Serveur;

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
		
		sgbd.put(key++, new Article("DelaDap - Crazy Swing", 1, null));
		sgbd.put(key++, new Article("Alice Francis - Shoot Him Down", 1, null));
		sgbd.put(key++, new Article("Black Cat Zoot - Dirty Dance", 1, null));
		sgbd.put(key++, new Article("DelaDap - Georgian Lesson", 2, Serveur.getnewDate(2015, 04, 01)));
		
		return sgbd;
	}
	
	public String toString()
	{
		String ret = "Catalogue\n----------\n";
		for(Entry<Integer, Article> ent : listeArticle.entrySet())
		{
			ret += ent.getValue().toString() + "\n";
		}
		
		return ret;
	}
	
}
