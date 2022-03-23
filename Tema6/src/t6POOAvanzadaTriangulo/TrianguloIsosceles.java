/**
 * 
 */
package t6POOAvanzadaTriangulo;

/**
 * @author Ruben
 *
 */
public class TrianguloIsosceles extends Triangulo {

	/**
	 * Constructor por defecto
	 */
	public TrianguloIsosceles() {
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloIsosceles(double lado1, double lado2, double lado3) {
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
	public TrianguloIsosceles(TrianguloIsosceles t) {
		super(t);
	}

	@Override
	public double area() {
		double s = (this.lado1 + this.lado2 + this.lado3) / 2;
		return Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
	}

	@Override
	public boolean valida() {
		if (((this.lado1 == this.lado2) && (this.lado1 != this.lado3))
				|| ((this.lado1 == this.lado3) && (this.lado1 != this.lado2))
				|| ((this.lado2 == this.lado3) && (this.lado2 != this.lado1)))
			return true;
		else
			return false;
	}

}
