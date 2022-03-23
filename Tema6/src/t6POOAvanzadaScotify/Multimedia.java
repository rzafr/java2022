/**
 * 
 */
package t6POOAvanzadaScotify;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Multimedia implements Reproducible {

	// Propiedades
	protected String nombre;
	protected int duracion;
	protected int year;
	protected ArrayList<Autor> autores;
	protected static long reproducciones = 0;

	/**
	 * Constructor con nombre y duración
	 * 
	 * @param nombre
	 * @param duracion
	 */
	public Multimedia(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.autores = new ArrayList<>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	// Getters y setters

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the autores
	 */
	public ArrayList<Autor> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracion;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		if (duracion != other.duracion)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	/**
	 * Añade un autor al ArrayList de autores
	 * 
	 * @param a
	 */
	public void addAutor(Autor a) {
		this.autores.add(a);
	}

	/**
	 * Elimina un autor del ArrayList si existe
	 * 
	 * @param a
	 * @return
	 */
	public boolean delAutor(Autor a) {
		for (Autor autor : autores) {
			if (autor.equals(a)) {
				autores.remove(autor);
				return true;
			}
		}
		return false;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo " + this.nombre);
		Multimedia.reproducciones++;// Esto no lo veo claro porque sería contar para todas los multimedias
	}

	/**
	 * Indica el número de veces que se han reproducido los multimedias
	 * 
	 * @return
	 */
	public long getReproducciones() {
		return Multimedia.reproducciones;// ¿Cómo sería para sacar el total por canción?
	}

}
