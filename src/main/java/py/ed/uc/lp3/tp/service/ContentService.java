package py.ed.uc.lp3.tp.service;

import java.util.List;
import py.ed.uc.lp3.tp.domain.Content;

public interface ContentService {
	/*
	 * Función para reunir los puntajes de un contenido de los diferentes sitios.
	 * Argumento:
	 * ->Content content: el contenido del cual se reunirá los puntajes.
	 */
	void rateContent(Content content);
	
	
	/*
	 * Función para buscar un contenido por su identificador
	 * Argumento:
	 * ->Long id: identificador del contenido a buscar
	 * Retorna:
	 * ->Un contenido cuyo identificador coincida.
	 */
	Content findById(Long id);
	
	/*
	 * Función para buscar un contenido por el título de la obra (Ej: Star Wars V)
	 * Argumento:
	 * ->String title: Título del contenido o fragmento del título
	 * Retorna:
	 * ->Una lista de contenidos que coincida con el término de búsqueda.
	 */
	List<Content> findByTitle(String title);
	
	/*
	 * Función para buscar un contenido por el subtítulo de la obra (Ej: Empire Strikes Back)
	 * Argumento:
	 * ->String subtitle: Subtítulo del contenido o fragmento del subtítulo
	 * Retorna:
	 * ->Una lista de contenidos que coincida con el término de búsqueda.
	 */
	List<Content> findBySubtitle(String subtitle);
	
	/*
	 * Función para listar contenidos de una categoría (Ej: Space Opera)
	 * Argumento:
	 * ->String category: Categoría del contenido
	 * Retorna:
	 * ->Una lista de contenidos que coincida con el término de búsqueda.
	 */
	List<Content> findByCategory(String category);
	
	/*
	 * Funcion que agrupa los tres tipos de busqueda anteriores (title, subtitle y category), y utiliza un string para
	 * determinar que método de busqueda aplicar.
	 * Argumento:
	 * ->String field: el campo del contenido a comparar
	 * ->String value: el valor que el campo debe contener
	 * Retorna:
	 * ->Una lista de contenidos que coincida con el término de búsqueda.
	 */
	List<Content> findByField(String field, String value);
	
	/*
	 * Función para listar todos los contenidos.
	 * Retorna:
	 * ->Una lista de todos los contenidos
	 */
	List<Content> findAll();

	void save(Content content);

	void delete(Long id);
	
	//float findReview(Long id);
	
	//float findReview(Long id, String ReviewSite); TODO
	
}
