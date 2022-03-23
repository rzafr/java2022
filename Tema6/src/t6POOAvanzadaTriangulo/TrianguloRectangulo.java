/**
 * 
 */
package t6POOAvanzadaTriangulo;

/**
 * @author Ruben
 *
 */
public class TrianguloRectangulo extends Triangulo {

	/**
	 * Constructor por defecto
	 */
	public TrianguloRectangulo() {
		super();
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloRectangulo(double lado1, double lado2, double lado3) {
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
	public TrianguloRectangulo(TrianguloRectangulo t) {
		super(t);
	}

	@Override
	public double area() {
		if ((this.lado1 > this.lado2) && (this.lado1 > this.lado3))
			return (this.lado2 * this.lado3) / 2;
		else if ((this.lado2 > this.lado1) && (this.lado2 > this.lado3))
			return (this.lado1 * this.lado3) / 2;
		else
			return (this.lado1 * this.lado2) / 2;
	}

	@Override
	public boolean valida() {
		if ((this.lado1 == Math.sqrt(Math.pow(this.lado2, 2) + Math.pow(this.lado3, 2)))
				|| (this.lado2 == Math.sqrt(Math.pow(this.lado1, 2) + Math.pow(this.lado3, 2)))
				|| (this.lado3 == Math.sqrt(Math.pow(this.lado1, 2) + Math.pow(this.lado2, 2))))
			return true;
		else
			return false;
	}

}
