/**
 * 
 */
package tienda;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;


/**
 * @author Ruben
 *
 */
public class Pedido {

	private static int incremento=1;
	
	private int codigo;
	private LocalDate fecha;
	private double total; //Calculado seg?n pedido, ni en constructor ni set
	private Cliente cliente;//Hay que pasarlo con set
	private ArrayList<LineaPedido> lineas;
	
	
	
	
	public Pedido() {
		this.codigo=Pedido.incremento;
		Pedido.incremento++;
		this.fecha=LocalDate.now();
		this.lineas=new ArrayList<>();
		this.total=0;
	}
	
	public Pedido(Cliente cliente) {
		this.codigo=Pedido.incremento;
		Pedido.incremento++;
		this.fecha=LocalDate.now();
		this.cliente=cliente;
		this.lineas=new ArrayList<>();
		this.total=0;
	}
	
	/**
	 * Devuelve el precio total del pedido con IVA menos el posible descuento del cliente que hace el pedido
	 * @return
	 */
	public double total() {
		//El total se va actualizando cada vez que a?ado una nueva LineaPedido
		return total - this.cliente.descuento();
	}
	
	/**
	 * Devuelve las l?neas de pedido
	 * @return
	 */
	public ArrayList<LineaPedido> getLineas() {
		return this.lineas;
	}
	
	/**
	 * A?ade una l?nea de pedido al pedido y calcular? el total poni?ndolo en el atributo total
	 * @param lp
	 */
	public void nuevaLinea(LineaPedido lp) {
		//Si hay una l?nea de pedido ya con el mismo producto, lo que hago es actualizar la cantidad
		boolean encontrado=false;
		for (LineaPedido linea : lineas) {
			if (linea.getProducto().equals(lp.getProducto())) {
				linea.setCantidad(linea.getCantidad()+lp.getCantidad());
				encontrado=true;
			}
		}
		//Si no lo encuentra para ver si est? repetido, se a?ade
		if(!encontrado) {
			this.lineas.add(lp);
		}
		//Tanto si est? como si no, se suma el subtotal
		this.total += lp.subtotal();
		
		//Si se hiciera con el indexOf en LineaPedido, buscar?a un objeto exactamente igual
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido: ");
		builder.append(codigo);
		builder.append("\n");
		for (LineaPedido linea : lineas) {
			builder.append("Producto: ");
			builder.append(linea.getProducto().getCodigo());
			builder.append(" precio: ");
			builder.append(linea.getProducto().getPrecio());
			builder.append(" cantidad: ");
			builder.append(linea.getCantidad());
			builder.append(" Subtotal = ");
			builder.append(linea.subtotal());
			builder.append("? \n");
			
		}
		builder.append("Total (IVA inc.) = ");
		builder.append(total());
		builder.append("?");
		builder.append("\n");
		
		
		return builder.toString();
	}
	
	
	public void toPDF() throws IOException {
		try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
            contentStream.showText("Pedido: " + this.codigo);
            contentStream.endText();
            
            if (this.cliente != null) {//Si tiene cliente asociado pintamos los datos
            	contentStream.beginText();
                contentStream.setFont(PDType1Font.TIMES_BOLD, 10);
                contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 80);
                contentStream.showText("Cliente: " + this.cliente.getDni() + " " + this.cliente.getApellidos() + ", " + this.cliente.getNombre());
                contentStream.newLineAtOffset(0, -25);//Salto de l?nea
                contentStream.showText("Direcci?n: " + this.cliente.getDireccion() + ", " + this.cliente.getLocalidad());
                contentStream.endText();
            }
            
            contentStream.beginText();
            contentStream.newLineAtOffset(0, -25);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 8);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 160);
            StringBuilder text = new StringBuilder();
            for (LineaPedido linea : lineas) {
            	text.setLength(0);
            	text.append("Producto: ");
            	text.append(linea.getProducto().getCodigo());
            	text.append(" precio: ");
            	text.append(linea.getProducto().getPrecio());
            	text.append(" cantidad: ");
            	text.append(linea.getCantidad());
            	text.append(" Subtotal = ");
            	text.append(linea.subtotal());
            	text.append("?");
            	contentStream.showText(text.toString());
            	
                contentStream.newLineAtOffset(0, -25);
              
            }
            //Si cliente distinto null y descuento > 0 poner detalle del descuento
            contentStream.endText();

            contentStream.close();

            document.save("document.pdf");
        }
    }
	
	
	
	
	
	
}
