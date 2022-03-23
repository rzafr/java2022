/**
 * 
 */
package t6POOAvanzadaScotify;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class Podcast extends Multimedia {

	// Atributos
	private LocalDate fecha;
	private int capitulo;

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param duracion
	 */
	public Podcast(String nombre, int duracion, LocalDate fecha, int capitulo) {
		super(nombre, duracion);
		this.fecha = fecha;
		this.capitulo = capitulo;
	}

	// Getters y setters

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the capitulo
	 */
	public int getCapitulo() {
		return capitulo;
	}

	/**
	 * @param capitulo the capitulo to set
	 */
	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Podcast [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", autores=");
		builder.append(autores);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", capitulo=");
		builder.append(capitulo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void reproducir() {
		System.out.println(
				"Reproduciendo " + this.nombre + " en " + this.fecha.toString() + ", capítulo " + this.capitulo);
	}

}
