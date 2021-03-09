package py.ed.uc.lp3.tp.service;

import java.util.List;
import py.ed.uc.lp3.tp.domain.ReviewSite;

public interface ReviewSiteService {	
	/*
	 * Función que busca un sitio de reviews por su identificador
	 * Argumento:
	 * ->Long id: el identificador para la búsqueda
	 * Retorna:
	 * ->Un sitio cuyo identificador coincida con el criterio de busqueda.
	 */
	ReviewSite findById(Long id);
	
	/*
	 * Función que busca sitios por su nombre
	 * Argumento:
	 * ->String name: nombre o fragmento de nombre a buscar
	 * Retorna:
	 * ->Una lista de sitios cuyos nombres coincidan con el criterio de busqueda.
	 */
	List<ReviewSite> findByName(String name);
	
	/*
	 * Función que lista todas las promos
	 * Retorna:
	 * ->Una lista de todos los sitios.
	 */
	List<ReviewSite> findAll();
	

	void save(ReviewSite institute);

	void delete(Long id);

	
	//Float getRating(Long siteId, Long movieId); TODO check if this is necesary.
	
}
