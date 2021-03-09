package py.ed.uc.lp3.tp.service;

import java.util.List;

import py.ed.uc.lp3.tp.domain.BaseUser;
import java.time.LocalDate;

public interface BaseUserService {

	/*
	 * Función para encontrar un usuario por su ID.
	 * Argumentos:
	 * ->Long id: id de un usuario a buscar
	 * Retorna:
	 * ->Un objeto de clase BaseUser
	 */
	BaseUser findById(Long id);
	
	
	/*
	 * Función para listar todos los usuarios del rol Admin
	 * Retorna:
	 * ->Una lista de usuarios cuyo rol es Admin
	 */
	
	List<BaseUser> findAdmins();
	
	
	/*
	 * Función para listar los usuarios del rol Curator o moderador
	 * Retorna:
	 * ->Una lista de usuarios cuyo rol es Curator
	 */
	List<BaseUser> findCurators();
	
	/*
	 * Función para listar los usuarios del rol Spectator o espectador
	 * Retorna:
	 * ->Una lista de usuarios cuyo rol es Spectator
	 */
	List<BaseUser> findSpectators();
	
	/*
	 * Función para listar todos los usuarios.
	 * Retorna:
	 * ->Una lista de todos los usuarios
	 */
	List<BaseUser> findAll();
	
	/*
	 * Función para renombrar un usuario
	 * Argumentos:
	 * ->Long id: identificador del usuario
	 * ->String name: el nuevo nombre de un usuario (actualiza el atributo firstName)
	 */
	void rename(Long id, String name);
	
	/*
	 * Función para cambiar nombre y apellido de un usuario
	 * Argumentos:
	 * ->Long id: identificador del usuario
	 * ->String firstName: el nuevo nombre del usuario
	 * ->String lastName: el nuevo apellido del usuario
	 */
	void rename(Long id, String firstName, String lastName);
	
	/*
	 * Función para actualizar la fecha de nacimiento de un usuario
	 * Argumentos:
	 * ->Long id: identificador del usuario
	 * ->LocalDate birthDay: la nueva fecha de nacimiento
	 */
	void changeBirth(Long id, LocalDate birthDay);

	void save(BaseUser user);

	void delete(Long id);
	
}
