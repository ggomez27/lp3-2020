package py.ed.uc.lp3.tp.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Content implements Serializable{
	/*
	 * La clase Content representa cualquier tipo de contenido disponible para consumir.
	 * La idea es generalizar la clase para que sirva para representar películas, series,
	 * libros y demás.
	 * Esta clase de por sí NO almacena los puntajes, sino que los recibe de la clase
	 * ReviewSite cada vez que se busca un contenido específico, actualizando la lista
	 * de puntajes recibidos cada vez que se solicita.
	 * Almacena los puntajes en un string con el formato:
	 * (id1) Name1= value1, (id2) Name2= value2, ...
	 * donde id es el identificador del sitio de reviews, Name el nombre
	 * del sitio, y value su puntaje.
	 */
	private static final long serialVersionUID = 2185877638392307699L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String type;										//El tipo de contenido. EJ: película, libro, etc.
	private String title;										//El título del contenido. EJ: Star Wars Episodio 5, el título de un libro, etc.
	private String subtitle;									//El subtítulo del contenido. Ej: El Imperio Contraataca
	private String language;									//Idioma original del contenido.
	private String description;									//Breve descripción del contenido.
	private String category;									//Categoría del contenido. Ej: Acción, Aventura, etc.
	private LocalDate releaseDate;
	private int ageRating;										//Para que edad mínima esta rateada el contenido.
	private String score = new String();						//Una cadena vacía para los puntajes de este contenido.
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getAgeRating() {
		return ageRating;
	}
	public void setAgeRating(int ageRating) {
		this.ageRating = ageRating;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	
	
}
