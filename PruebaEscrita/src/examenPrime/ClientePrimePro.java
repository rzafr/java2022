/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public class ClientePrimePro extends Cliente {

	/**
	 * Propiedades
	 */
	private static final double PRECIO_MENSUAL = 5;

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = PRECIO_MENSUAL;
	}

	@Override
	public boolean esPro() {
		return true;
	}

	@Override
	public double getPrecioMensual() {
		return PRECIO_MENSUAL;
	}

}
