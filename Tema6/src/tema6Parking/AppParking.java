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

	// Si ahora nos dicen que hay un nuevo tipo de vehículo, por ejemplo, un autobús que llevará el número de plazas y se
	// cobrará un precio base por el número de plazas. ¿Qué cambios deberías hacer? Indica qué clases habría que crear,
	// cómo, y qué clases/métodos habría que modificar. No es necesario implementarlo, sólo decirlo.
	
	// Habría que crear la clase Autobus que herede de Vehiculo con atributo int plazasOcupa y en el método calcularImporte()
	// sumar las plazas por los minutos que está en el parking, además de establecer un descuento si procede.
	
	// En la clase Parking, en el método registrarEntradaVehiculo(Vehiculo v), habría que ir comprobando, por cada plaza que 
	// encontremos libre, si hay plazas disponibles al lado para que quepa el autobús. Asignar las plazas correspondientes y restarlas
	// al contador de plazas disponibles. En el método registrarSalidaVehiculo(Vehiculo v), de igual forma habría que tener en cuenta
	// las plazas que ocupa el autobús para volver a ponerlas disponibles.
	
	// En la clase Parking añadir atributo static de precio base por plaza. Comprobaciones en AppParking de si el vehículo es un autobús.
	
	
	
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
			System.out.println("1. Registrar entrada vehículo");
			System.out.println("2. Registrar salida vehículo");
			System.out.println("3. Número plazas disponibles");
			System.out.println("4. Imprimir estado del parking");
			System.out.println("5. Saldo acumulado");
			System.out.println("\nElige una opción:");

			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Opción incorrecta");
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
					
					System.out.println("Introduce la matrícula");
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
						System.out.println("Indica un tipo de vehículo válido");
					}
					break;
				}
				case 2: {
					
					System.out.println("Introduce una matrícula");
					String matricula = "";
					try {
						matricula = sc.nextLine();
					} catch (Exception e) {
						System.out.println("Error" + e.getMessage());
					}
					
					// Comprobamos que el vehículo que se quiere sacar es un coche
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
						// Si la plaza está ocupada, sacamos también la información del vehículo
						if (!pa.isEstaLibre()) {
							for (Vehiculo v : p.getVehiculosAparcados()) {
								if (v.getPlaza().equals(pa)) {
									System.out.println(
											"La matrícula " + v.getMatricula() + " lleva aparcada " + v.calcularMinutos()
													+ " minutos, con un coste de " + v.calcularImporte() + " €");
								}
							}
						}
					}
					break;
				}
				case 5: {
					System.out.println("Saldo acumulado: " + p.getSaldoAcumulado() + " €");
					break;
				}
				default:
					System.out.println("Opción incorrecta");
			}

		} while (opcion != 0);

		sc.close();

	}

}
