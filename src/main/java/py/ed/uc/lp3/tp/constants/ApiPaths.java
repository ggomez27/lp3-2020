package py.ed.uc.lp3.tp.constants;

//Clase estática que utilizamos para centralizar todas las constantes 
//que utlilizaremos como parte de la API REST para los ejercicios
public class ApiPaths {

	private static final String BASE_API = "/api/tp";
	
	public static final String USER = BASE_API + "/user"; 				//Para usuarios comunes
	public static final String ADMIN = BASE_API + "/admin";				//Para admins
	public static final String CURATOR = BASE_API + "/curator";			//Para 
	public static final String SPECTATOR = BASE_API + "/spectator";	
	
	public static final String LOGIN = BASE_API + "/login";
	

	public static final String CONTENT = BASE_API + "/content";
	public static final String REVIEWSITES = BASE_API + "/sites";
	public static final String PROMOS = BASE_API + "/promos";
}
