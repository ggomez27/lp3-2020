package py.ed.uc.lp3.tp.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class ReviewSite implements Serializable{
	/*
	 * Esta clase representa un sitio de Reviews de forma general.
	 * Como varios sitios pueden tener reviews de películas, series, libros y más,
	 * la lista contentType permite almacenar diferentes tipos de contenidos
	 * que el sitio puede revisar.
	 * Finalmente usa un mapeo del ID de un contenido, y un valor Float
	 * para almacenar los diferentes puntajes que cada sitio tiene
	 * de los diferentes contenidos. El mapeo permite que al agregar un puntaje
	 * de una película que ya tenía un puntaje anterior, se actualice ya que no
	 * pueden haber keys repetidas.
	 * La clase Content recupera una lista de todos los puntajes que refieren
	 * a un contenido particular desde una lista de sitios.
	 */
	
	private static final long serialVersionUID = 3632312968566371283L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;												// El Nombre del Sitio
	private String url;													// El URL del Sitio
	@ElementCollection
	private List<String> contentType = new ArrayList<String>(1);	/* Una Lista de tipos de contenidos que este sitio abarca.
																		 * Ej: Películas, Libros, etc. 
																		 * Un sitio puede abarcar varios tipos de contenido
																		 */
	@ElementCollection
	private Map<Long,Float> scores = new HashMap<Long,Float>(); 			/* Una lista de los puntajes que el sitio tiene sobre cada contenido.
																		 * El indice a este ArrayList corresponde al id de un contenido.
																		 */
	
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getContentType() {
		return contentType;
	}
	public void setContentType(List<String> contentType) {
		this.contentType = contentType;
	}
	public Map<Long,Float> getScores() {
		return scores;
	}
	public void setScores(HashMap<Long,Float> scores) {
		this.scores = scores;
	}
	
}
