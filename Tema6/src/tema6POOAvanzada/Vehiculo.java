/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public abstract class Vehiculo {

	// ¿Podrá tener descendencia esta clase?
	// Sí, aunque sólo heredará el método abstracto getVelocidadActual, ya que la
	// propiedad está declarada como private y el otro método es final

	// ¿Se pueden sobreescribir todos sus métodos?
	// El astracto sí, el final no ya que al ser final no cambiará

	private int peso;

	public final void setPeso(int p) {
		peso = p;
	}

	public abstract int getVelocidadActual();
}
