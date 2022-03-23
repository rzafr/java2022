/**
 * 
 */
package tema6POOAvanzada;

/**
 * @author Ruben
 *
 */
public class Bebe {

	// Lo que he pensado se cumple. No hay dudas en el ejercicio
	// El programa muestra:
	// El bebé se ha despertado y va a pedir cosas
	// El bebé dice: papá quiero jugar
	// papá quiero jugar , mamá tengo hambre , mamá quiero agua

	static void pedir() {
		System.out.println(str1 + " , " + str2 + " , " + str3);
	}

	static {
		str2 = "mamá tengo hambre";
		str3 = "mamá quiero agua";
	}

	Bebe() {
		System.out.println("Nacimiento del bebé");
	}

	static String str2, str3, str1 = "papá quiero jugar";

	public static void main(String[] args) {
		System.out.println("El bebé se ha despertado y va a pedir cosas");
		System.out.println("El bebé dice: " + Bebe.str1);
		Bebe.pedir();
	}
}
