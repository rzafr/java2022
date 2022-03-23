/**
 * 
 */
package examenPrime;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Serie extends Multimedia {

	/**
	 * Propiedades
	 */
	private ArrayList<Temporada> temporadas;

	/**
	 * Constructor llamando al del padre e iniciando el array de temporadas
	 * 
	 * @param titulo
	 * @param esPlus
	 * @param precio
	 */
	public Serie(String titulo, boolean esPlus, double precio) {
		super(titulo, esPlus, precio);
		this.temporadas = new ArrayList<>();
	}

	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [temporadas=");
		builder.append(temporadas);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", esPlus=");
		builder.append(esPlus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Devuelve el número de temporadas de la serie
	 * 
	 * @return
	 */
	public int getNumeroTemporadas() {
		return this.temporadas.size();
	}

	/**
	 * Añade una temporada a la serie
	 * 
	 * @param temporada
	 */
	public void addTemporada(Temporada temporada) {
		temporada.setSerie(this);
		this.temporadas.add(temporada);
	}

}
