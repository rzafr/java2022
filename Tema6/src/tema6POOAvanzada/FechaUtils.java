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
		ARIES, TAURO, GÉMINIS, CÁNCER, LEO, VIRGO, LIBRA, ESCORPIO, SAGITARIO, CAPRICORNIO, ACUARIO, PISCIS
	}

	/**
	 * Muestra en pantalla el mensaje “Faltan z años, x meses, d días, h horas, m
	 * minutos y s segundos para titulo”
	 * 
	 * @param fechaHasta
	 * @param titulo
	 */
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {

		// Establecemos la fecha actual desde la que calcularemos el Period
		LocalDate fechaDesde = LocalDate.now();

		// Convertimos la fecha LocalDateTime en LocalDate para calcular el Period de
		// años, meses y días
		LocalDate fechaHastaSinHoras = fechaHasta.toLocalDate();

		// Calculamos el Period para tener los años, meses y días que faltan
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

		System.out.println("Faltan " + p.getYears() + " años, " + p.getMonths() + " meses, " + p.getDays() + " días, "
				+ horas + " horas, " + minutos + " minutos y " + segundos + " segundos para " + titulo);

	}

	/**
	 * Muestra que día de la semana (lunes, martes, miércoles, etc…) cae el cumple
	 * según el año que nos pasa por parámetro
	 * 
	 * @param fechaCumple
	 * @param año
	 * @return
	 */
	public static String diaCumple(LocalDate fechaCumple, int año) {
		// Creamos un LocalDate con el años pasado por parámetro
		LocalDate fechaYear = fechaCumple.withYear(año);
		// Creamos un Locale con una etiqueta pasándole el locale del español de España
		Locale localeDia = Locale.forLanguageTag("es-ES");
		// Formateamos la fecha con un DateTimeFormatter que solo muestre el día de la
		// semana como patrón "EEEE" y como segundo parámetro el Locale localeDia
		String diaSemana = fechaYear.format(DateTimeFormatter.ofPattern("EEEE", localeDia));

		return diaSemana;
	}

	/**
	 * Muestra los años que tiene alguien que nació en esa fecha
	 * 
	 * @param fechaCumple
	 * @return
	 */
	public static int numYears(LocalDate fechaCumple) {
		// Calculamos el Period entre la fecha del cumpleaños y la actual y extraemos
		// los años
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
			return SignosZodiaco.GÉMINIS.toString();
		else if ((dia >= 22 && mes == Month.JUNE) || (dia <= 21 && mes == Month.JULY))
			return SignosZodiaco.CÁNCER.toString();
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
	 * Devuelve true si una fecha está comprendida en un intervalo
	 * 
	 * @param inicio
	 * @param fin
	 * @param fecha
	 * @return
	 */
	public static boolean isIntervalo(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fecha) {
		// Con los métodos isAfter and isBefore se establece si la fecha está
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

		// Apartado 1 Método cuentaAtras()

		// Establecemos la fecha en la que ocurrirá el suceso
		LocalDateTime fecha1 = LocalDateTime.of(2030, 3, 1, 23, 45, 23);

		// Definimos el suceso
		String suceso = "Eclipse de Sol";

		cuentaAtras(fecha1, suceso);

		// Apartado 2 Método diaCumple()

		// Fecha de cumpleaños
		LocalDate fecha2 = LocalDate.of(1990, 3, 20);

		// Año en el que se quiere saber en qué día de la semana cae
		int year = 2021;

		System.out.println("\nTu cumple en " + year + " cae en " + diaCumple(fecha2, year));

		// Apartado 3 Método numYears()
		LocalDate fecha3 = LocalDate.of(1996, 2, 15);
		System.out.println("\nTienes " + numYears(fecha3) + " años");

		// Apartado 4 Método zodiaco()
		LocalDate fecha4 = LocalDate.of(2022, 4, 3);
		System.out.println("\nEl signo del zodiaco de esa fecha es " + zodiaco(fecha4));

		// Apartado 5 Método isIntervalo()
		LocalDateTime fechaInicio = LocalDateTime.of(2022, Month.MAY, 4, 12, 45, 30);
		LocalDateTime fechaFin = LocalDateTime.of(2022, Month.OCTOBER, 20, 10, 22, 30);
		LocalDateTime fechaBuscar = LocalDateTime.of(2022, Month.JULY, 22, 18, 12, 30);

		if (isIntervalo(fechaInicio, fechaFin, fechaBuscar))
			System.out.println("\nLa fecha está comprendida en el intervalo");
		else
			System.out.println("\nLa fecha no está comprendida en el intervalo");

		// Apartado 6 Método fechaAzar()
		LocalDateTime fechaInicial = LocalDateTime.of(2022, Month.MAY, 4, 12, 45, 30);
		LocalDateTime fechaFinal = LocalDateTime.of(2022, Month.OCTOBER, 20, 10, 22, 30);
		System.out.println("\nFecha al azar: " + fechaAzar(fechaInicial, fechaFinal));

	}

}
