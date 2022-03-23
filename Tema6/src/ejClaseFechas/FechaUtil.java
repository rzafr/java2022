/**
 * 
 */
package ejClaseFechas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Ruben
 *
 */
public class FechaUtil {
	public static void main(String[] args) {
		
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha.getDayOfMonth());
		System.out.println(fecha.getMonth());
		System.out.println(fecha.isLeapYear());
		System.out.println(fecha.getDayOfMonth());
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora.getMinute());
		System.out.println(hora.getSecond());
		
		LocalDate examen = LocalDate.parse("2022-03-09");
		System.out.println(examen.getDayOfMonth());
		
		
		LocalDateTime ldt1 = LocalDateTime.of(examen, hora);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.of(2022, 3, 9, 20, 20);
		System.out.println(ldt2);
		
		LocalDateTime ldt3 = examen.atTime(16, 0);
		System.out.println(ldt3);
		
		//Calcular los segunos o minutos entre dos instantes
		Instant i1 = Instant.now().minusSeconds(120);
		
		/*
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		Instant i2 = Instant.now();
		System.out.println("-----------------------");
		System.out.println(i2);
		System.out.println(Duration.between(i1, i2));
		System.out.println(Duration.between(i1, i2).getSeconds());
		
		
		//Calcular tiempo transcurrido entre fechas
		LocalDate ld1 = LocalDate.of(2000, 1, 1);
		LocalDate ld2 = LocalDate.now();
		Period p = Period.between(ld1, ld2);
		System.out.println(p.getDays()+" "+p.getMonths()+" "+p.getYears());
		
		
		//Formateo de fechas
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime ldtt = LocalDateTime.parse("21/02/2022 21:23",dtf);
		System.out.println(ldtt);
		
		//Formateo de fechas leída de teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una fecha por teclado (dd-mm-yyyy):");
		String fechaString = sc.nextLine();
		DateTimeFormatter dtform = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {	
			LocalDate mifecha = LocalDate.parse(fechaString, dtform);
			System.out.println(mifecha.getYear());
		} catch(Exception e) {
			System.out.println("No me has dado una fecha en el formato indicado");
		}
		
	}
}
