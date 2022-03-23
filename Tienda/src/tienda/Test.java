/**
 * 
 */
package tienda;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @author Ruben
 *
 */
public class Test {

	//holaaaaaaa
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//TERMINAR ESTO CON UN MEN� SI VAS CON TIEMPO
		
		Categoria c1 = new Categoria("moviles");
		Categoria c2 = new Categoria("perifericos");
		
		Producto p1=new Producto("iphone", "telefonillo", c1, 800, 1.21);
		Producto p2=new Producto("raton", "gaming", c2, 50, 1.21);
		Producto p3=new Producto("teclado", "normal", c2, 60, 1.21);
		
		ClienteRegistrado cr1 = new ClienteRegistrado("Rub�n", "D�az D�az", "456", "Cuevas", "Alli",
			"email", "passw", LocalDate.of(2020,10,7));
		
		
		//probar a poner contrase�a al cliente en TestPedido y luego chequearla antes de hacer el
		//siguiente paso.
		if(cr1.checkPassword("passw")) {
			Pedido pe1 = new Pedido(cr1);
			pe1.nuevaLinea(new LineaPedido(p1,1));
			pe1.nuevaLinea(new LineaPedido(p2,1));
			System.out.println(pe1);
		}
 		
		
		
		ClienteNoRegistrado cnr1 = new ClienteNoRegistrado("Alfonso", "Mart�nez", "456", "Cuevas", "Alli");
		
		Pedido pe2 = new Pedido(cnr1);
		pe2.nuevaLinea(new LineaPedido(p2,1));
		pe2.nuevaLinea(new LineaPedido(p3,2));
		
		
		System.out.println(pe2);
		
		try {
			pe2.toPDF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
