/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class TestProducto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Producto p1 = new Producto(10, "Calamares", 20.5, 5, 10, 0.10);
		Producto p2 = new Producto(11, "Chipirones", 11.6, 6, 20, 0.20);
		
		System.out.println(p2);
		
		if (p1.equals(p2))
			System.out.println("Son iguales.");
		else
			System.out.println("No son iguales.");
		
		System.out.println(p1.vender(6));
		System.out.println(p2.vender(5));
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.reponer());
		System.out.println(p2.reponer());
				
		System.out.println(p1.getUnidadesDisponibles());
		System.out.println(p2.getUnidadesDisponibles());

	}

}
