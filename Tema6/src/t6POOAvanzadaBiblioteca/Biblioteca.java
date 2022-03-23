/**
 * 
 */
package t6POOAvanzadaBiblioteca;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Biblioteca {

	// Atributos
	protected ArrayList<Publicacion> publicaciones;
	private String direccion;

	/**
	 * Constructor parametrizado
	 * 
	 * @param direccion
	 */
	public Biblioteca(String direccion) {
		super();
		this.direccion = direccion;
		this.publicaciones = new ArrayList<>();
	}

	// Getters y setters

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the publicaciones
	 */
	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	/**
	 * Añade un libro o una revista a la biblioteca
	 * 
	 * @param unaPub
	 */
	public void adquirirMaterial(Publicacion unaPub) {
		this.publicaciones.add(unaPub);
	}

	/**
	 * Devuelve la Publicación correspondiente si está en la Biblioteca (que el
	 * título sea exactamente el mismo)
	 * 
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		for (Publicacion p : publicaciones) {
			if (p.getTitulo().equals(titulo))
				return p;
		}
		return null;
	}

	/**
	 * Devuelve un ArrayList con todas las publicaciones del autor pasado por
	 * parámetro en la Biblioteca
	 * 
	 * @param autor
	 * @return
	 */
	public ArrayList<Publicacion> buscar(Autor autor) {
		ArrayList<Publicacion> pubAutor = new ArrayList<>();
		for (Publicacion p : publicaciones) {
			for (Autor a : p.getAutores()) {
				if (a.equals(autor))
					pubAutor.add(p);
			}
		}
		return pubAutor;
	}
}
