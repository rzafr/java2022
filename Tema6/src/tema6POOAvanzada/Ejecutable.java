/**
 * 
 */
package tema6POOAvanzada;

import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Ejecutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos un ArrayList de Series y otro de Videojuegos
		ArrayList<Serie> series = new ArrayList<>();
		ArrayList<Videojuego> vj = new ArrayList<>();

		// Metemos al menos tres objetos en cada uno
		series.add(new Serie("Watchmen", "Damon Lindelof"));
		series.add(new Serie("Fundación", "David S. Goyer"));
		series.add(new Serie("Westworld", "Jonathan Nolan"));

		vj.add(new Videojuego("Prince of Persia", 200));
		vj.add(new Videojuego("DOOM", 300));
		vj.add(new Videojuego("Tekken 3", 100));

		// Entregamos un Videojuego y Serie con el método entregar()
		series.get(1).entregar();
		vj.get(2).entregar();

		// Recorremos los dos ArrayList mostrando información de cada objeto
		int contSerie = 0;
		for (Serie s : series) {
			System.out.println(s);
			if (s.isPrestado()) {
				System.out.println("La serie está prestada");
				contSerie++;
			} else {
				System.out.println("La serie está disponible");
			}
		}

		System.out.println("\nHay " + contSerie + " series prestadas\n");

		int contVJ = 0;
		for (Videojuego v : vj) {
			System.out.println(v);
			if (v.isPrestado()) {
				System.out.println("El videojuego está prestado");
				contVJ++;
			} else {
				System.out.println("El videojuego está disponible");
			}

		}

		System.out.println("\nHay " + contVJ + " videojuegos prestados\n");

	}

}
