/**
 * 
 */
package tema6Parking;

import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class AppParking {

	// Si ahora nos dicen que hay un nuevo tipo de veh�culo, por ejemplo, un autob�s que llevar� el n�mero de plazas y se
	// cobrar� un precio base por el n�mero de plazas. �Qu� cambios deber�as hacer? Indica qu� clases habr�a que crear,
	// c�mo, y qu� clases/m�todos habr�a que modificar. No es necesario implementarlo, s�lo decirlo.
	
	// Habr�a que crear la clase Autobus que herede de Vehiculo con atributo int plazasOcupa y en el m�todo calcularImporte()
	// sumar las plazas por los minutos que est� en el parking, adem�s de establecer un descuento si procede.
	
	// En la clase Parking, en el m�todo registrarEntradaVehiculo(Vehiculo v), habr�a que ir comprobando, por cada plaza que 
	// encontremos libre, si hay plazas disponibles al lado para que quepa el autob�s. Asignar las plazas correspondientes y restarlas
	// al contador de plazas disponibles. En el m�todo registrarSalidaVehiculo(Vehiculo v), de igual forma habr�a que tener en cuenta
	// las plazas que ocupa el autob�s para volver a ponerlas disponibles.
	
	// En la clase Parking a�adir atributo static de precio base por plaza. Comprobaciones en AppParking de si el veh�culo es un autob�s.
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Parking p = new Parking();

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {

			System.out.println("\n\nAPP PARKING");
			System.out.println("-----------\n");
			System.out.println("0. Salir del programa");
			System.out.println("1. Registrar entrada veh�culo");
			System.out.println("2. Registrar salida veh�culo");
			System.out.println("3. N�mero plazas disponibles");
			System.out.println("4. Imprimir estado del parking");
			System.out.println("5. Saldo acumulado");
			System.out.println("\nElige una opci�n:");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Opci�n incorrecta");
			}

			switch (opcion) {
				case 0: {
					System.out.println("\nHas salido de la APP PARKING");
					break;
				}
				case 1: {
					System.out.println("Indicar si es coche o furgoneta");
					String tipo = "";
					try {
						tipo = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error" + e.getMessage());
					}
					
					System.out.println("Introduce la matr�cula");
					String matricula = "";
					try {
						matricula = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error" + e.getMessage());
					}
					
					System.out.println("Introduce la marca");
					String marca = "";
					try {
						marca = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error" + e.getMessage());
					}
					
					// Si es furgoneta pedimos la longitud y registramos la entrada
					if (tipo.toLowerCase().equals("furgoneta")) {
						System.out.println("Introduce la longitud");
						float longitud = 0;
						try {
							longitud = Float.parseFloat(sc.nextLine());
						} catch (Exception e) {
							System.out.println("Error" + e.getMessage());
						}
						System.out.println(
								p.registrarEntradaVehiculo(new Furgoneta(matricula.toUpperCase(), marca, longitud)));
					// Si no, registramos la entrada de un coche
					} else if (tipo.toLowerCase().equals("coche")) {
						System.out.println(p.registrarEntradaVehiculo(
								new Coche(matricula.toUpperCase(), marca, Combustible.ELECTRICO)));
					} else {
						System.out.println("Indica un tipo de veh�culo v�lido");
					}
					break;
				}
				case 2: {
					
					System.out.println("Introduce una matr�cula");
					String matricula = "";
					try {
						matricula = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error" + e.getMessage());
					}
					
					// Comprobamos que el veh�culo que se quiere sacar es un coche
					if (p.getVehiculosAparcados()
							.indexOf(new Coche(matricula.toUpperCase(), "RENAULT", Combustible.HIBRIDO)) >= 0) {
						Coche c = (Coche) p.getVehiculosAparcados().get(p.getVehiculosAparcados()
								.indexOf(new Coche(matricula.toUpperCase(), "RENAULT", Combustible.HIBRIDO)));
						System.out.println(p.registrarSalidaVehiculo(c));
					// O una furgoneta
					} else if (p.getVehiculosAparcados()
							.indexOf(new Furgoneta(matricula.toUpperCase(), "RENAULT", 0)) >= 0) {
						Furgoneta f = (Furgoneta) p.getVehiculosAparcados().get(
								p.getVehiculosAparcados().indexOf(new Furgoneta(matricula.toUpperCase(), "RENAULT", 0)));
						System.out.println(p.registrarSalidaVehiculo(f));
					}
					break;
				}
				case 3: {
					System.out.println("Hay " + p.getNumeroPlazasLibres() + " plazas disponibles en el parking");
					break;
				}
				case 4: {
					for (PlazaAparcamiento pa : p.getPlazas()) {
						// Pintamos las plazas del parking
						System.out.println(pa);
						// Si la plaza est� ocupada, sacamos tambi�n la informaci�n del veh�culo
						if (!pa.isEstaLibre()) {
							for (Vehiculo v : p.getVehiculosAparcados()) {
								if (v.getPlaza().equals(pa)) {
									System.out.println(
											"La matr�cula " + v.getMatricula() + " lleva aparcada " + v.calcularMinutos()
													+ " minutos, con un coste de " + v.calcularImporte() + " �");
								}
							}
						}
					}
					break;
				}
				case 5: {
					System.out.println("Saldo acumulado: " + p.getSaldoAcumulado() + " �");
					break;
				}
				default:
					System.out.println("Opci�n incorrecta");
			}

		} while (opcion != 0);

		sc.close();

	}

}
