/**
 * 
 */
package tienda;

/**
 * @author Ruben
 *
 */
public class ClienteNoRegistrado extends Cliente {

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param direccion
	 */
	public ClienteNoRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion) {
		super(nombre, apellidos, dni, localidad, direccion);
	}

	/**
	 * Constructor copia
	 * 
	 * @param c
	 */
	public ClienteNoRegistrado(ClienteNoRegistrado unCliente) {
		super(unCliente);
	}
	
	
	
	
	
	/**
	 * Devuelve el descuento asociado a este tipo de cliente
	 */
	public double descuento() {
		return 0;
	}

}
