/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public abstract class Vehiculo {

	// �Podr� tener descendencia esta clase?
	// S�, aunque s�lo heredar� el m�todo abstracto getVelocidadActual, ya que la
	// propiedad est� declarada como private y el otro m�todo es final

	// �Se pueden sobreescribir todos sus m�todos?
	// El astracto s�, el final no ya que al ser final no cambiar�

	private int peso;

	public final void setPeso(int p) {
		peso = p;
	}

	public abstract int getVelocidadActual();
}
