/**
 * 
 */
package tema5POOClases;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Agenda {

	private ArrayList<Contacto> agenda;

	/**
	 * Constructor que inicializa el ArrayList
	 */
	public Agenda() {
		agenda = new ArrayList<>();
	}

	/**
	 * Indica si el contacto pasado existe o no
	 * 
	 * @param c
	 * @return
	 */
	public boolean existeContacto(Contacto c) {
		boolean existe = false;
		for (Contacto co : agenda) {
			if (co.equals(c))
				existe = true;
		}
		return existe;
	}

	/**
	 * A�ade un nuevo contacto a la agenda
	 * 
	 * @param c
	 * @return
	 */
	public boolean addContacto(Contacto c) {
		boolean a�adido = false;
		if (!existeContacto(c)) {
			agenda.add(c);
			a�adido = true;
		}
		return a�adido;
	}

	/**
	 * Lista todos los contactos de la agenda
	 */
	public void listarContactos() {
		for (Contacto co : agenda) {
			System.out.println(co);
		}
	}

	/**
	 * Busca un contacto por su nombre y muestra su tel�fono
	 * 
	 * @param nombre
	 * @return
	 */
	public int buscarContacto(String nombre) {
		for (Contacto co : agenda) {
			if (co.getNombre().equalsIgnoreCase(nombre))
				return co.getTelefono();
		}
		return -1;
	}

	/**
	 * Elimina el contacto de la agenda, e indica si se ha eliminado o no con un
	 * mensaje por pantalla
	 * 
	 * @param c
	 */
	public boolean eliminarContacto(Contacto c) {
		boolean eliminado = false;
		if (existeContacto(c)) {
			agenda.remove(c);
			eliminado = true;
		}
		return eliminado;
	}
}
