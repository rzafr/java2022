/**
 * 
 */
package tema5POOClases;

/**
 * @author Ruben
 *
 */
public class TestHora {

	//	Piensa los cambios que habría que realizar si ahora quisiéramos soportar horas en formato AM/PM. Si tuvieras
	//	que soportar los dos formatos de hora indica qué cambios habría que hacer a las propiedades y métodos.
	//
	// En las propiedades habría que añadir una llamada formato de tipo String que tome como valores AM o PM
	// Añadirla a los constructores, toString y equals. Añadir getter y setter
	// En el método segundoSiguiente en el caso 12:59:59 PM pasaríamos a 01:00:00 PM y con 12:59:59 AM se pasa a 01:00:00 AM
	// En el método horaValida hay que verificar que las horas se encuentra en el intervalo 1 -> 12
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hora h1 = new Hora(200, 59, 34, 20);
		Hora h2 = new Hora(100, 34, 21, 10);
		Hora h3 = new Hora(300, 78, 67, 40);
		Hora h4 = new Hora(678, 59, 59, 23);
		Hora h5 = new Hora("20:00:32");

		if (h1.horaValida())
			System.out.println("La primera hora es válida");
		else
			System.out.println("La primera hora no es válida");

		System.out.println(h1);
		System.out.println(h1.horaCompleta());

		if (h2.horaValida())
			System.out.println("La segunda hora es válida");
		else
			System.out.println("La segunda hora no es válida");

		System.out.println(h2);
		System.out.println(h2.horaCompleta());

		h1.segundoSiguiente();
		System.out.println(h1);

		if (h3.horaValida())
			System.out.println("La tercera hora es válida");
		else
			System.out.println("La tercera hora no es válida");

		System.out.println(h3);

		h4.segundoSiguiente();
		System.out.println(h4);
		
		System.out.println(h5);
	}

}
