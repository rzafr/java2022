/**
 * 
 */
package t5HerenciaBanco;

/**
 * @author Ruben
 *
 */
public class TestBanco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Objetos CuentaAhorro
		CuentaAhorro ca1 = new CuentaAhorro(18690.6, false, false, 120.0, 1.07);
		CuentaAhorro ca2 = new CuentaAhorro(29567.6, false, false, 120.0, 1.01);

		// Objetos CuentaJoven
		CuentaJoven cj1 = new CuentaJoven(1567.9, false, false, 120.0);
		CuentaJoven cj2 = new CuentaJoven("12345678901234567890",2167.9, false, false, 120.0);

		// Objetos CuentaCorriente
		CuentaCorriente cc1 = new CuentaCorriente(678.4, true, true, 120.0);
		CuentaCorriente cc2 = new CuentaCorriente(278.4, true, true, 120.0);
		
		//Hacemos ingresos y reintegros en cada cuenta
		ca1.ingresar(200.0);
		if (ca1.retirar(134.8))
			System.out.println("Reintegro realizado");
		else
			System.out.println("No hay saldo disponible");
		
		ca2.ingresar(400.0);
		if (ca1.retirar(345.8))
			System.out.println("Reintegro realizado");
		else
			System.out.println("No hay saldo disponible");
		
		cj1.ingresar(100.0);
		if (cj1.retirar(1700.8))
			System.out.println("Reintegro realizado");
		else
			System.out.println("No hay saldo disponible");
		
		cj2.ingresar(450.0);
		if (cj1.retirar(500.8))
			System.out.println("Reintegro realizado");
		else
			System.out.println("No hay saldo disponible");
		
		cc1.ingresar(300.0);
		if (cc1.retirar(200.8))
			System.out.println("Reintegro realizado");
		else
			System.out.println("No hay saldo disponible");
		
		cc2.ingresar(100.0);
		if (cc2.retirar(400.8))
			System.out.println("Reintegro realizado");
		else
			System.out.println("No hay saldo disponible");
		
		// Las metemos en un objeto Banco
		Banco b = new Banco();
		
		b.addCuenta(ca1);
		b.addCuenta(ca2);
		b.addCuenta(cj1);
		b.addCuenta(cj2);
		b.addCuenta(cc1);
		b.addCuenta(cc2);
		
		//Buscamos una de ellas por número de cuenta e ingresamos un millón de euros
		b.getCuenta("12345678901234567890").ingresar(1000000.0);
		
		//Ejecutamos el toString() del objeto Banco, que muestra todas las cuentas que tiene dentro
		System.out.println(b.toString());

	}

}
