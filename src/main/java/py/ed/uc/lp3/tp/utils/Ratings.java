package py.ed.uc.lp3.tp.utils;

import py.ed.uc.lp3.tp.domain.ReviewSite;
import java.util.List;
import java.util.Iterator;

public final class Ratings {
	/*
	 * Utilidad para reunir los ratings de un contenido específico.
	 * Argumentos:
	 * ->List reviewSiteList: una lista de todos los sitios de reviews
	 * ->Long id: el identificador del contenido a evaluar sus ratings.
	 * Retorna:
	 * ->Un String que reune todos los sitios y sus puntajes del contenido solicitado.
	 * El string tiene el formato:
	 * (id1) Name1= value1, (id2) Name2= value2, ...
	 * donde id es el identificador del sitio de reviews, Name el nombre
	 * del sitio, y value su puntaje.
	 */
	public static String getRatings(List<ReviewSite> reviewSiteList, Long id)
	{
		Iterator<ReviewSite> iterator = reviewSiteList.iterator();
		String ratings = new String();
		while(iterator.hasNext()) {
			ReviewSite reviewSite = iterator.next();
			if(reviewSite.getScores().containsKey(id)) {
				for(Long key : reviewSite.getScores().keySet())
					if(key==id)
			    	ratings=ratings+"("+reviewSite.getId()+") " + reviewSite.getName()+"= "+reviewSite.getScores().get(key)+", ";
			}
	    }

		return ratings;
	}
	public static void addReview(ReviewSite reviewSite, Long id, Float score)
	{
		reviewSite.getScores().put(id, score);
	}
	
	public static void removeReview(ReviewSite reviewSite, Long id)
	{
		reviewSite.getScores().remove(id);
	}
}
