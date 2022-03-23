/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public class ClientePrime extends Cliente {

	/**
	 * Propiedades
	 */
	private static final double PRECIO_MENSUAL = 3;

	/**
	 * Constructor pasando el valor del atributo estático PRECIO_MENSUAL
	 * 
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = PRECIO_MENSUAL;
	}

	@Override
	public boolean esPro() {
		return false;
	}

	@Override
	public double getPrecioMensual() {
		return PRECIO_MENSUAL;
	}

}
