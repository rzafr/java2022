/**
 * 
 */
package ejClaseForma;

/**
 * @author Ruben
 *
 */
public class TestForma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Circulo c1 = new Circulo(7.95);
		c1.dibujar();
		System.out.println(c1);
		System.out.println("Área del círculo: " + c1.area());
		System.out.println();

		Rectangulo r1 = new Rectangulo(3.54, 2.99);
		r1.dibujar();
		System.out.println(r1);
		System.out.println("Área del rectángulo: " + r1.area());
		System.out.println();

		Triangulo t1 = new Triangulo(1.98, 8.72);
		t1.dibujar();
		System.out.println(t1);
		System.out.println("Área del triángulo: " + t1.area());
		System.out.println();
		
		Cuadrado cu1 = new Cuadrado(5.59);
		cu1.dibujar();
		System.out.println(cu1);
		System.out.println("Área del cuadrado: " + cu1.area());
		

	}

}
