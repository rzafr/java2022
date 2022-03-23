/**
 * 
 */
package t6POOAvanzadaScotify;

import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class TestScotify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scotify sc = new Scotify();

		// Añadimos 3 Podcast
		sc.addMultimedia(new Podcast("Entrevistas", 1800, LocalDate.of(2022, 1, 12), 1));
		sc.addMultimedia(new Podcast("Entrevistas", 2400, LocalDate.of(2022, 1, 19), 2));
		sc.addMultimedia(new Podcast("Entrevistas", 2100, LocalDate.of(2022, 1, 26), 3));

		// Añadimos 2 discos completos con sus canciones
		Disco d1 = new Disco("Disco1", LocalDate.of(2022, 2, 10), new Autor("Autor1", "Info1"), "DMC");

		sc.addMultimedia(new Cancion("C1", 150, 1, Genero.ROCK, d1));
		sc.addMultimedia(new Cancion("C2", 180, 2, Genero.ROCK, d1));
		sc.addMultimedia(new Cancion("C3", 150, 3, Genero.ROCK, d1));
		sc.addMultimedia(new Cancion("C4", 150, 4, Genero.ROCK, d1));
		sc.addMultimedia(new Cancion("C5", 150, 5, Genero.ROCK, d1));

		Disco d2 = new Disco("Disco2", LocalDate.of(2022, 2, 17), new Autor("Autor2", "Info2"), "DLPC");

		sc.addMultimedia(new Cancion("T1", 150, 1, Genero.CLASICA, d2));
		sc.addMultimedia(new Cancion("T2", 200, 2, Genero.CLASICA, d2));
		sc.addMultimedia(new Cancion("T3", 120, 3, Genero.CLASICA, d2));
		sc.addMultimedia(new Cancion("T4", 160, 4, Genero.CLASICA, d2));
		sc.addMultimedia(new Cancion("T5", 190, 5, Genero.CLASICA, d2));

		// Buscamos una canción por nombre
		System.out.println(sc.buscar("T2"));

		// Reproducimos todo el multimedia
		for (Multimedia m : sc.getMultimedias()) {
			m.reproducir();
		}

		// ¿Cómo harías una lista de reproducción?

		// Creando otro objeto Scotify y añadiendo el Multimedia que elija
		Scotify scy = new Scotify();
		scy.addMultimedia(new Cancion("T1", 150, 1, Genero.CLASICA, d2));
		scy.addMultimedia(new Cancion("T3", 120, 3, Genero.CLASICA, d2));
		scy.addMultimedia(new Cancion("T5", 190, 5, Genero.CLASICA, d2));

		System.out.println("Lista de reproducción:");

		for (Multimedia m : scy.getMultimedias()) {
			m.reproducir();
		}

	}

}
