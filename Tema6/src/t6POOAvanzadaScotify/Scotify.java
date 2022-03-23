/**
 * 
 */
package t6POOAvanzadaScotify;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Scotify {

	private ArrayList<Multimedia> multimedias;

	/**
	 * Constructor que inicializa el ArrayList
	 */
	public Scotify() {
		this.multimedias = new ArrayList<>();
	}
	
	

	/**
	 * @return the multimedias
	 */
	public ArrayList<Multimedia> getMultimedias() {
		return multimedias;
	}



	/**
	 * Añade un objeto Multimedia al ArrayList
	 * 
	 * @param unaPub
	 */
	public void addMultimedia(Multimedia m) {
		this.multimedias.add(m);
	}

	/**
	 * Elimina un Multimedia del ArrayList, si se encuentra en la lista
	 * 
	 * @param m return
	 */
	public boolean delMultimedia(Multimedia m) {
		for (Multimedia multi : multimedias) {
			if (multi.equals(m)) {
				multimedias.remove(multi);
				return true;
			}
		}
		return false;
	}

	/**
	 * Devuelve el Multimedia que corresponde al nombre pasado como parámetro
	 * 
	 * @param titulo
	 * @return
	 */
	public Multimedia buscar(String nombre) {
		for (Multimedia m : multimedias) {
			if (m.getNombre().equals(nombre))
				return m;
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
	public ArrayList<Multimedia> buscar(Autor autor) {
		ArrayList<Multimedia> multiAutor = new ArrayList<>();
		for (Multimedia m : multimedias) {
			for (Autor a : m.getAutores()) {
				if (a.equals(autor))
					multiAutor.add(m);
			}
		}
		return multiAutor;
	}
}
