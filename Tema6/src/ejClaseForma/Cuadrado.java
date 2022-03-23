/**
 * 
 */
package ejClaseForma;

/**
 * @author Ruben
 *
 */
public class Cuadrado extends Rectangulo {

	/**
	 * 
	 * @param lado
	 */
	public Cuadrado(double lado) {
		// Aquí se cambia a lado para que base y altura sean iguales
		super(lado, lado);
	}

	/**
	 * @param otroCuadrado
	 */
	public Cuadrado(Cuadrado otroCuadrado) {
		super(otroCuadrado);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuadrado [id=");
		builder.append(id);
		builder.append(", base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void dibujar() {
		System.out.println("Esto es un cuadrado");
	}

}
