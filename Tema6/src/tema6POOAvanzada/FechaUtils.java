/**
 * 
 */
package tema6POOAvanzada;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Ruben
 *
 */
public class FechaUtils {

	public enum SignosZodiaco {
		ARIES, TAURO, G�MINIS, C�NCER, LEO, VIRGO, LIBRA, ESCORPIO, SAGITARIO, CAPRICORNIO, ACUARIO, PISCIS
	}

	/**
	 * Muestra en pantalla el mensaje �Faltan z a�os, x meses, d d�as, h horas, m
	 * minutos y s segundos para titulo�
	 * 
	 * @param fechaHasta
	 * @param titulo
	 */
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {

		// Establecemos la fecha actual desde la que calcularemos el Period
		LocalDate fechaDesde = LocalDate.now();

		// Convertimos la fecha LocalDateTime en LocalDate para calcular el Period de
		// a�os, meses y d�as
		LocalDate fechaHastaSinHoras = fechaHasta.toLocalDate();

		// Calculamos el Period para tener los a�os, meses y d�as que faltan
		Period p = Period.between(fechaDesde, fechaHastaSinHoras);

		// Establecemos la hora actual para calcular Duration
		LocalTime horasDesde = LocalTime.now();

		// Convertimos la fecha LocalDateTime en LocalTime
		LocalTime horasHasta = fechaHasta.toLocalTime();

		// Calculamos los segundos totales que faltan
		long diffSeconds = Duration.between(horasDesde, horasHasta).getSeconds();

		// ESTO HAY QUE CAMBIARLO

		// Sacamos las horas, minutos y segundos
		int horas = (int) diffSeconds / 3600;
		int minutos = (int) (diffSeconds % 3600) / 60;
		int segundos = (int) (diffSeconds % 3600) % 60;

		System.out.println("Faltan " + p.getYears() + " a�os, " + p.getMonths() + " meses, " + p.getDays() + " d�as, "
				+ horas + " horas, " + minutos + " minutos y " + segundos + " segundos para " + titulo);

	}

	/**
	 * Muestra que d�a de la semana (lunes, martes, mi�rcoles, etc�) cae el cumple
	 * seg�n el a�o que nos pasa por par�metro
	 * 
	 * @param fechaCumple
	 * @param a�o
	 * @return
	 */
	public static String diaCumple(LocalDate fechaCumple, int a�o) {
		// Creamos un LocalDate con el a�os pasado por par�metro
		LocalDate fechaYear = fechaCumple.withYear(a�o);
		// Creamos un Locale con una etiqueta pas�ndole el locale del espa�ol de Espa�a
		Locale localeDia = Locale.forLanguageTag("es-ES");
		// Formateamos la fecha con un DateTimeFormatter que solo muestre el d�a de la
		// semana como patr�n "EEEE" y como segundo par�metro el Locale localeDia
		String diaSemana = fechaYear.format(DateTimeFormatter.ofPattern("EEEE", localeDia));

		return diaSemana;
	}

	/**
	 * Muestra los a�os que tiene alguien que naci� en esa fecha
	 * 
	 * @param fechaCumple
	 * @return
	 */
	public static int numYears(LocalDate fechaCumple) {
		// Calculamos el Period entre la fecha del cumplea�os y la actual y extraemos
		// los a�os
		LocalDate fechaActual = LocalDate.now();
		Period p = Period.between(fechaCumple, fechaActual);
		return p.getYears();
	}

	/**
	 * Se le pase una fecha y nos devuelve el signo del zodiaco
	 * 
	 * @param fecha
	 * @return
	 */
	public static String zodiaco(LocalDate fecha) {
		Month mes = fecha.getMonth();
		int dia = fecha.getDayOfMonth();

		if ((dia >= 21 && mes == Month.MARCH) || (dia <= 20 && mes == Month.APRIL))
			return SignosZodiaco.ARIES.toString();
		else if ((dia >= 21 && mes == Month.APRIL) || (dia <= 20 && mes == Month.MAY))
			return SignosZodiaco.TAURO.toString();
		else if ((dia >= 21 && mes == Month.MAY) || (dia <= 21 && mes == Month.JUNE))
			return SignosZodiaco.G�MINIS.toString();
		else if ((dia >= 22 && mes == Month.JUNE) || (dia <= 21 && mes == Month.JULY))
			return SignosZodiaco.C�NCER.toString();
		else if ((dia >= 22 && mes == Month.JULY) || (dia <= 23 && mes == Month.AUGUST))
			return SignosZodiaco.LEO.toString();
		else if ((dia >= 24 && mes == Month.AUGUST) || (dia <= 23 && mes == Month.SEPTEMBER))
			return SignosZodiaco.VIRGO.toString();
		else if ((dia >= 24 && mes == Month.SEPTEMBER) || (dia <= 22 && mes == Month.OCTOBER))
			return SignosZodiaco.LIBRA.toString();
		else if ((dia >= 23 && mes == Month.OCTOBER) || (dia <= 22 && mes == Month.NOVEMBER))
			return SignosZodiaco.ESCORPIO.toString();
		else if ((dia >= 23 && mes == Month.NOVEMBER) || (dia <= 21 && mes == Month.DECEMBER))
			return SignosZodiaco.SAGITARIO.toString();
		else if ((dia >= 22 && mes == Month.DECEMBER) || (dia <= 20 && mes == Month.JANUARY))
			return SignosZodiaco.CAPRICORNIO.toString();
		else if ((dia >= 21 && mes == Month.JANUARY) || (dia <= 19 && mes == Month.FEBRUARY))
			return SignosZodiaco.ACUARIO.toString();
		else if ((dia >= 20 && mes == Month.FEBRUARY) || (dia <= 20 && mes == Month.MARCH))
			return SignosZodiaco.PISCIS.toString();
		return "";
	}

	/**
	 * Devuelve true si una fecha est� comprendida en un intervalo
	 * 
	 * @param inicio
	 * @param fin
	 * @param fecha
	 * @return
	 */
	public static boolean isIntervalo(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fecha) {
		// Con los m�todos isAfter and isBefore se establece si la fecha est�
		// comprendida en el intervalo
		if ((fecha.isAfter(inicio)) && (fecha.isBefore(fin)))
			return true;
		else
			return false;
	}

	/**
	 * Devuelve una fecha aleatoria entre inicial y final, ambas incluidas
	 * 
	 * @param inicial
	 * @return
	 */
	public static LocalDateTime fechaAzar(LocalDateTime fechInicial, LocalDateTime fechFinal) {
		long secIni = fechInicial.toEpochSecond(ZoneOffset.of("+0"));
		long secFin = fechFinal.toEpochSecond(ZoneOffset.of("+0"));

		long secAzar = (long) (Math.random() * (secFin - secIni + 1)) + secIni;

		Instant i = Instant.ofEpochSecond(secAzar);

		LocalDateTime fechAzar = LocalDateTime.ofInstant(i, ZoneOffset.of("+0"));
		return fechAzar;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Apartado 1 M�todo cuentaAtras()

		// Establecemos la fecha en la que ocurrir� el suceso
		LocalDateTime fecha1 = LocalDateTime.of(2030, 3, 1, 23, 45, 23);

		// Definimos el suceso
		String suceso = "Eclipse de Sol";

		cuentaAtras(fecha1, suceso);

		// Apartado 2 M�todo diaCumple()

		// Fecha de cumplea�os
		LocalDate fecha2 = LocalDate.of(1990, 3, 20);

		// A�o en el que se quiere saber en qu� d�a de la semana cae
		int year = 2021;

		System.out.println("\nTu cumple en " + year + " cae en " + diaCumple(fecha2, year));

		// Apartado 3 M�todo numYears()
		LocalDate fecha3 = LocalDate.of(1996, 2, 15);
		System.out.println("\nTienes " + numYears(fecha3) + " a�os");

		// Apartado 4 M�todo zodiaco()
		LocalDate fecha4 = LocalDate.of(2022, 4, 3);
		System.out.println("\nEl signo del zodiaco de esa fecha es " + zodiaco(fecha4));

		// Apartado 5 M�todo isIntervalo()
		LocalDateTime fechaInicio = LocalDateTime.of(2022, Month.MAY, 4, 12, 45, 30);
		LocalDateTime fechaFin = LocalDateTime.of(2022, Month.OCTOBER, 20, 10, 22, 30);
		LocalDateTime fechaBuscar = LocalDateTime.of(2022, Month.JULY, 22, 18, 12, 30);

		if (isIntervalo(fechaInicio, fechaFin, fechaBuscar))
			System.out.println("\nLa fecha est� comprendida en el intervalo");
		else
			System.out.println("\nLa fecha no est� comprendida en el intervalo");

		// Apartado 6 M�todo fechaAzar()
		LocalDateTime fechaInicial = LocalDateTime.of(2022, Month.MAY, 4, 12, 45, 30);
		LocalDateTime fechaFinal = LocalDateTime.of(2022, Month.OCTOBER, 20, 10, 22, 30);
		System.out.println("\nFecha al azar: " + fechaAzar(fechaInicial, fechaFinal));

	}

}
