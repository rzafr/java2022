/**
 * 
 */
package t6POOAvanzadaScotify;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Disco {

	// Propiedades
	private String titulo;
	private LocalDate fecha;
	private Autor autor;
	private String discografica;
	private ArrayList<Cancion> canciones;

	/**
	 * Constructor parametrizado
	 * 
	 * @param titulo
	 * @param fecha
	 * @param autor
	 * @param discografica
	 */
	public Disco(String titulo, LocalDate fecha, Autor autor, String discografica) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.autor = autor;
		this.discografica = discografica;
		this.canciones = new ArrayList<>();
	}

	// Getters y setters

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

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
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * @return the discografica
	 */
	public String getDiscografica() {
		return discografica;
	}

	/**
	 * @param discografica the discografica to set
	 */
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disco [titulo=");
		builder.append(titulo);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", discografica=");
		builder.append(discografica);
		builder.append(", canciones=");
		builder.append(canciones);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Añade el disco a la canción y luego la canción al ArrayList de canciones que
	 * tiene el disco
	 * 
	 * @param a
	 */
	public void addCancion(Cancion c) {
		c.setDisco(this);
		this.canciones.add(c);
	}

	/**
	 * Elimina, si existe, una canción del ArrayList de canciones
	 * 
	 * @param c
	 * @return
	 */
	public boolean delCancion(Cancion c) {
		for (Cancion can : canciones) {
			if (can.equals(c)) {
				canciones.remove(can);
				return true;
			}
		}
		return false;
	}

	/**
	 * Devuelve todas las canciones
	 * 
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * Calcula la duración total del disco, sumando la duración de las canciones
	 * 
	 * @return
	 */
	public int getDuracionTotal() {
		int duracion = 0;
		for (Cancion c : canciones) {
			duracion += c.getDuracion();
		}
		return duracion;
	}
}
