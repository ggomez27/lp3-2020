package py.ed.uc.lp3.tp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promo implements Serializable {
	/*
	 * La Clase Promo representa una promoción.
	 * Tiene atributos como el nombre, el tipo (sea descuento, mes gratis, etc)
	 * Utiliza una lista de servicios adheridos a la promoción 
	 * (sea un estudio para contenido premium, o plataformas como Netflix, etc)
	 */
	
	private static final long serialVersionUID = -2288081403282631339L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;												//El "nombre" de la Promo. Ej: 1 MES DE DESCUENTO EN NETFLIX
	private String type;												//El tipo de promo. Ej: free-month, coupon, premiere (preestreno)
	private ArrayList<String> adheredServices = new ArrayList<String>(1);		//A que tienda(s) de e-comerce o plataforma(s) de streaming aplica esta promo.
	private int cost;													//El costo de esta promo en Gs.
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<String> getAppliesTo() {
		return adheredServices;
	}
	public void setAppliesTo(ArrayList<String> appliesTo) {
		this.adheredServices = appliesTo;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
