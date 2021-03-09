package py.ed.uc.lp3.tp.domain;

import java.util.ArrayList;

public class Curator extends BaseUser{
	/*
	 * La clase Curator hereda los atributos y métodos de la clase BaseUser.
	 * Tiene atributos propios que determinan la categoría de contenido
	 * que el curador puede moderar.
	 */
	private static final long serialVersionUID = 7494652005913627894L;
		private ArrayList<String> category = new ArrayList<String>(1);

		public ArrayList<String> getCategory() {
			return category;
		}

		public void setCategory(ArrayList<String> category) {
			this.category = category;
		}
		
}
