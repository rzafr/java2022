/**
 * 
 */
package examenPrime;

/**
 * @author Ruben
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrimeVideo pm = new PrimeVideo();

		// Añadimos películas plus
		for (int i = 0; i < 30; i++) {
			pm.getCatalogo().add(new Multimedia("", true, 10));
		}

		// Añadimos películas no plus
		for (int i = 0; i < 170; i++) {
			pm.getCatalogo().add(new Multimedia());
		}

		// Añadimos clientes pro
		for (int i = 0; i < 250000; i++) {
			pm.getSuscriptores().add(new ClientePrimePro(String.valueOf(i), "", ""));
		}

		// Añadimos clientes no pro
		for (int i = 250000; i < 1000000; i++) {
			pm.getSuscriptores().add(new ClientePrime(String.valueOf(i), "", ""));
		}

		// Simulamos que cada cliente vea las 40 primeras películas
		for (Cliente c : pm.getSuscriptores()) {
			for (int i = 0; i < 40; i++) {
				pm.ver(pm.getCatalogo().get(i), c);
			}
		}

		// Calculamos las ganancias totales
		System.out.println("Ganancias con las películas: " + pm.getGanancias() + " €");

		// Añadimos 10 series al catálogo
		for (int i = 0; i < 10; i++) {
			pm.getCatalogo().add(new Serie("", true, 10));
		}

		// Simulamos que cada cliente vea 5 series
		for (Cliente c : pm.getSuscriptores()) {
			for (Multimedia m : pm.getCatalogo()) {
				int index = pm.getCatalogo().indexOf(new Serie("", true, 10));
				if (index > 0) {
					pm.ver(pm.getCatalogo().get(index), c);
				}

			}
		}

		// Calculamos las ganancias totales
		System.out.println("Ganancias más las series: " + pm.getGanancias() + " €");

	}

}
