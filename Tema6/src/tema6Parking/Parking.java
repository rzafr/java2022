/**
 * 
 */
package tema6Parking;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Ruben
 *
 */
public class Parking {

	// Atributos
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<PlazaAparcamiento> plazas;
	private int plazasDisponibles;
	private float saldoAcumulado;
	
	protected static final float PRECIO_BASE_POR_MINUTO = 0.04f;
	protected static final float PRECIO_BASE_POR_METRO = 0.2f;

	/**
	 * Constructor de la clase Parking
	 */
	public Parking() {
		this.plazas = new ArrayList<>();
		this.saldoAcumulado = 0;
		// Creamos 100 plazas disponibles, del 1 al 100
		for (int i = 1; i <= 100; i++) {
			// El constructor por defecto de PlazaAparcamiento autoincrementa el número de
			// plaza y la pone a true
			this.plazas.add(new PlazaAparcamiento());
		}
		this.plazasDisponibles = 100;
		this.vehiculos = new ArrayList<>();
	}

	/**
	 * Devuelve el número de plazas libres
	 * 
	 * @return
	 */
	public int getNumeroPlazasLibres() {
		return plazasDisponibles;
	}

	/**
	 * Devuelve la lista de vehículos aparcados
	 * 
	 * @return
	 */
	public ArrayList<Vehiculo> getVehiculosAparcados() {
		return vehiculos;
	}
	
	/**
	 * Devuelve la lista de plazas del parking
	 * 
	 * @return
	 */
	public ArrayList<PlazaAparcamiento> getPlazas() {
		return plazas;
	}

	/**
	 * Devuelve el saldo acumulado
	 * 
	 * @return
	 */
	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}

	/**
	 * Recorre todas las plazas y devuelve String con número y estado de las plazas
	 * del parking
	 * 
	 * @return
	 */
	public String imprimeParking() {
		return plazas.toString();
	}

	/**
	 * Asigna al vehículo una plaza libre si la hay, asigna la fecha y hora de
	 * entrada, añade ese vehículo a la lista del parking, y marca en el parking esa
	 * plaza como ocupada
	 * 
	 * @param v
	 * @return
	 */
	public String registrarEntradaVehiculo(Vehiculo v) {
		// Comprobamos que hay plazas disponibles
		if (this.plazasDisponibles > 0) {
			// Recorremos el parking buscando una plaza libre
			for (PlazaAparcamiento p : plazas) {
				if (p.isEstaLibre()) {
					// La marcamos como ocupada
					p.setEstaLibre(false);
					// Adjudicamos la plaza al vehículo
					v.setPlaza(p);
					// Registramos la fecha de entrada
					v.setFechaEntrada(LocalDateTime.now());
					// Añadimos el vehículo al ArrayList de vehículos
					this.vehiculos.add(v);
					// Restamos una plaza disponible
					this.plazasDisponibles--;
					return ("La matrícula " + v.getMatricula() + " está aparcada en la plaza " + p.getNumPlaza());
				}
			}
		} else {
			return "El parking está lleno";
		}
		return "";
	}

	/**
	 * Si el vehículo está en el parking calcula los minutos transcurridos desde que
	 * entró, calcula el importe por el tiempo transcurrido (y longitud si fuera el
	 * caso), suma el importe al saldo acumulado del parking, libera la plaza,
	 * aumenta el número de plazas disponibles y elimina el vehículo de la lista del
	 * parking
	 * 
	 * @param v
	 * @return
	 */
	public String registrarSalidaVehiculo(Vehiculo v) {
		// Comprobamos que el vehículo se encuentra en el parking
		if (this.vehiculos.indexOf(v) >= 0) {
			// Calculamos el importe de la estancia
			double importe = v.calcularImporte();
			// Sumamos el importe a las ganancias del parking
			this.saldoAcumulado += importe;
			// Cambiamos la plaza a disponible
			v.getPlaza().setEstaLibre(true);
			// Sumamos una plaza disponible
			this.plazasDisponibles++;
			// Eliminamos el vehículo del ArrayList de vehículos
			this.vehiculos.remove(v);
			return ("El vehículo matrícula " + v.getMatricula() + " entró " + v.getFechaEntrada() + " y salió "
					+ LocalDateTime.now() + " estando " + v.calcularMinutos() + " minutos, con un coste de " + importe
					+ " €");
		} else {
			return "No se ha encontrado ese vehículo en el parking";
		}
	}

}
