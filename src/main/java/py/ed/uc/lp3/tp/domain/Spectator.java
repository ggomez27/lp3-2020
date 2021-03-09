package py.ed.uc.lp3.tp.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Spectator extends BaseUser{
	/*
	 * Esta clase representa al usuario normal o "espectador".
	 * Hereda atributos y metodos de BaseUser, y agrega atributos propios:
	 * la fecha que expira su suscripción, y una lista de promos que el usuario compro.
	 */
	private static final long serialVersionUID = 5193603247604945341L;
	private LocalDateTime premiumExpiration;
	private ArrayList<Promo> ownedPromos;
	
	public LocalDateTime getPremiumExpiration() {
		return premiumExpiration;
	}

	public void setPremiumExpiration(LocalDateTime premiumExpiration) {
		this.premiumExpiration = premiumExpiration;
	}

	public ArrayList<Promo> getOwnedPromos() {
		return ownedPromos;
	}

	public void setOwnedPromos(ArrayList<Promo> ownedPromos) {
		this.ownedPromos = ownedPromos;
	}
	
	
	
}
