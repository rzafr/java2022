/**
 * 
 */
package t5HerenciaEmpleado;

/**
 * @author Ruben
 *
 */
public class TestEmpleado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Comercial c1 = new Comercial("Paco", 32, 1290.50, 400);
		Comercial c2 = new Comercial("Yolanda", 29, 1120.60, 220);

		Repartidor r1 = new Repartidor("Alberto", 32, 1005.00, true, "zona 3");
		Repartidor r2 = new Repartidor("Julia", 22, 1200.70, false, "zona 3");

		MozoAlmacen m1 = new MozoAlmacen("Andrés", 25, 1100.40, true, 1);
		MozoAlmacen m2 = new MozoAlmacen("Luis", 33, 1200.40, false, 2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println();

		c1.plus();
		c2.plus();
		r1.plus();
		r2.plus();
		m1.plus();
		m2.plus();

		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		System.out.println(m1);
		System.out.println(m2);

	}

}
