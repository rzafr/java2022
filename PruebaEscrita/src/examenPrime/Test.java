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

		// A�adimos pel�culas plus
		for (int i = 0; i < 30; i++) {
			pm.getCatalogo().add(new Multimedia("", true, 10));
		}

		// A�adimos pel�culas no plus
		for (int i = 0; i < 170; i++) {
			pm.getCatalogo().add(new Multimedia());
		}

		// A�adimos clientes pro
		for (int i = 0; i < 250000; i++) {
			pm.getSuscriptores().add(new ClientePrimePro(String.valueOf(i), "", ""));
		}

		// A�adimos clientes no pro
		for (int i = 250000; i < 1000000; i++) {
			pm.getSuscriptores().add(new ClientePrime(String.valueOf(i), "", ""));
		}

		// Simulamos que cada cliente vea las 40 primeras pel�culas
		for (Cliente c : pm.getSuscriptores()) {
			for (int i = 0; i < 40; i++) {
				pm.ver(pm.getCatalogo().get(i), c);
			}
		}

		// Calculamos las ganancias totales
		System.out.println("Ganancias con las pel�culas: " + pm.getGanancias() + " �");

		// A�adimos 10 series al cat�logo
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
		System.out.println("Ganancias m�s las series: " + pm.getGanancias() + " �");

	}

}
