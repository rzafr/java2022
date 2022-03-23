/**
 * 
 */
package t6POOAvanzadaTriangulo;

/**
 * @author Ruben
 *
 */
public class TrianguloEquilatero extends Triangulo {

	/**
	 * Constructor por defecto
	 */
	public TrianguloEquilatero() {
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloEquilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		if (!this.valida())
			throw new IllegalArgumentException(
					"Error, los valores de estos lados no se corresponden con este tipo de triángulo");
	}

	/**
	 * Constructor copia
	 * 
	 * @param t
	 */
	public TrianguloEquilatero(TrianguloEquilatero t) {
		super(t);
	}

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * Math.pow(this.lado1, 2);
	}

	@Override
	public boolean valida() {
		if ((this.lado1 == this.lado2) && (this.lado1 == this.lado3) && (this.lado2 == this.lado3))
			return true;
		else
			return false;
	}

}
