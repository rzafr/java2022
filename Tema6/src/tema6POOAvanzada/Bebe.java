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
	// El beb� se ha despertado y va a pedir cosas
	// El beb� dice: pap� quiero jugar
	// pap� quiero jugar , mam� tengo hambre , mam� quiero agua

	static void pedir() {
		System.out.println(str1 + " , " + str2 + " , " + str3);
	}

	static {
		str2 = "mam� tengo hambre";
		str3 = "mam� quiero agua";
	}

	Bebe() {
		System.out.println("Nacimiento del beb�");
	}

	static String str2, str3, str1 = "pap� quiero jugar";

	public static void main(String[] args) {
		System.out.println("El beb� se ha despertado y va a pedir cosas");
		System.out.println("El beb� dice: " + Bebe.str1);
		Bebe.pedir();
	}
}
