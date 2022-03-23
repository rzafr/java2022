/**
 * 
 */
package examenPrime;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Temporada {

	/**
	 * Propiedades
	 */
	private int numero;
	private ArrayList<Episodio> episodios;
	private Serie serie;

	/**
	 * Constructor por defecto
	 */
	public Temporada() {
		this.numero = 0;
		this.episodios = new ArrayList<>();
		this.serie = null;
	}

	/**
	 * Constructor sólo con número
	 * 
	 * @param numero
	 */
	public Temporada(int numero) {
		this.numero = numero;
		this.episodios = new ArrayList<>();
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}

	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", título serie=");
		builder.append(serie.getTitulo());
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Devuelve el número de episodios de la temporada
	 * 
	 * @return
	 */
	public int getNumeroEpisodios() {
		return this.episodios.size();
	}

	/**
	 * Añade un episodio a la temporada
	 * 
	 * @param episodio
	 */
	public void addEpisodio(Episodio episodio) {
		episodio.setTemporada(this);
		this.episodios.add(episodio);
	}

	/**
	 * Elimina si existe un episodio de la temporada
	 * 
	 * @param episodio
	 * @return
	 */
	public boolean delEpisodio(Episodio episodio) {
		if (this.episodios.indexOf(episodio) > 0) {
			this.episodios.remove(numero);
			return true;
		} else {
			return false;
		}

	}
}
