package py.ed.uc.lp3.tp.service;

import py.ed.uc.lp3.tp.domain.Promo;
import java.util.List;

public interface PromoService {
	
	/*
	 * Función para buscar una promo por su identificador.
	 * Argumento:
	 * ->Long id: identificador a buscar
	 * Retorna:
	 * ->Un objeto de clase promo que coincida con el identificador
	 */
	Promo findById(Long id);
	
	/*
	 * Función para buscar una promo por el nombre de promo.
	 * Argumento:
	 * ->String name: nombre o fragmento del nombre de la promo a buscar
	 * Retorna:
	 * ->Una lista de promos cuyos nombres coincidan con el criterio de busqueda.
	 */
	List<Promo> findByName(String name);
	
	/*
	 * Función para buscar una promo por el tipo de promo.
	 * Argumento:
	 * ->String type: tipo de promo a buscar
	 * Retorna:
	 * ->Una lista de promos cuyos tipos coincidan con el criterio de busqueda.
	 */
	List<Promo> findByType(String type);
	
	/*
	 * Función para listar todas las promos disponibles.
	 * Retorna:
	 * ->Una lista de todas las promos
	 */
	List<Promo> findAll();
	
	/*
	 * Función para buscar servicios adheridos a la promo.
	 * Argumento:
	 * ->String adhered: nombre o fragmento de nombre de un servicio potencialmente adherido
	 * Retorna:
	 * ->Una lista de promos cuyas listas de servicios adheridos coincida con el criterio de busqueda.
	 */
	List<Promo> findByAdhered(String adhered);
}
