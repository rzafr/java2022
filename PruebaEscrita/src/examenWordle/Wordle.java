/**
 * 
 */
package examenWordle;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Wordle {

	public ArrayList<String> diccionario;
	public static ArrayList<Character> alfabeto;
	
	public String palabraAcertar;
	public String palabraActual;
	public ArrayList<Character> letrasNoEstan;
	
	StringBuilder sb = new StringBuilder();
	
	public Wordle() {
		this.palabraAcertar=this.diccionario.get(LocalDate.now().getDayOfMonth());
		this.letrasNoEstan=new ArrayList<>();
	}
	
	public Wordle(String palabra) {
		if (palabra.length() == 5)
			this.palabraAcertar=palabra.toUpperCase();
	}
	
	public boolean comprobar(String intento) {
		if (intento.length() == 5) {
			
			for(int i=0; i<intento.length(); i++) {
				sb.append("");
			}
				
			
			//Aciertos en mayúsculas
			for(int i=0;i<intento.length(); i++) {
				if(this.palabraAcertar.charAt(i) == intento.charAt(i)) {
					sb.setCharAt(i, Character.toUpperCase(intento.charAt(i)));
				}
//						//Aciertos en minúsculas
//						for(int k=0;k<intento.length(); k++) {
//							for(int j=0;j<this.palabraAcertar.length(); j++) {
//								if((this.palabraAcertar.charAt(k) == intento.charAt(j)) || (k!=j)) {
//									
//								}
//							}
//						}
				
			}
			System.out.println(sb);
			//Letras que no están
//			for(int k=0;k<intento.length(); k++) {
//				for(int j=0;j<this.palabraAcertar.length(); j++) {
//					if(this.palabraAcertar.charAt(k) != intento.charAt(j)) {
//						this.letrasNoEstan.add(intento.charAt(j));
//					}
//				}
//			}
			
			if (this.palabraAcertar == intento) {
				return true;
			}
				
		}
		
			
		
		return false;
	}

	/**
	 * @return the palabraAcertar
	 */
	public String getPalabraAcertar() {
		return palabraAcertar;
	}

	/**
	 * @param palabraAcertar the palabraAcertar to set
	 */
	public void setPalabraAcertar(String palabraAcertar) {
		this.palabraAcertar = palabraAcertar;
	}

	/**
	 * @return the palabraActual
	 */
	public String getPalabraActual() {
		return palabraActual;
	}

	/**
	 * @param palabraActual the palabraActual to set
	 */
	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}

	/**
	 * @return the diccionario
	 */
	public ArrayList<String> getDiccionario() {
		return diccionario;
	}

	/**
	 * @return the letrasNoEstan
	 */
	public ArrayList<Character> getLetrasNoEstan() {
		return letrasNoEstan;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wordle [palabraActual=");
		builder.append(sb);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
