/*Crea una aplicación que gestione el 
flujo de ventas de una
caja de supermercado 
El programa guardara 
la cantidades del
carrito de compra dentro 
de una lista. Mostrará por pantalla la
siguiente informacion:
•IVA aplicado 21 o 4
•precio total bruto y precio mas IVA
•Numero de artículos comprados
•Cantidad pagada
•Cambio a devolver al cliente*/

package supermercado;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Mercadona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> supermarket = new ArrayList<String>();
		ArrayList<Double> precio = new ArrayList<Double>();
		double suma=0;
		double iva=0;
		double pago=0;
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Número de productos: "));
		for (int i = 0; i < n; i++) {
			String productos = JOptionPane.showInputDialog("Nombre de productos: ");
			Double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
			supermarket.add(productos);
			precio.add(cantidad);
			suma= suma+cantidad;
			iva = suma+(suma*0.21);
			//pago=suma-cantidad;
		}
		
		System.out.println("Producto/s:                 	"+supermarket);
		System.out.println("Precio:                         "+precio+"€");
		System.out.println("Número de articulos:            "+n);
		System.out.println("Precio total:                   "+suma+"€");
		System.out.println("Precio + IVA(21%):              "+Math.floor(iva)+"€");
		pago = Double.parseDouble(JOptionPane.showInputDialog("Pagar en caja: "+"€"));
		System.out.println("El precio que pagas es:         "+pago+"€");
		double cambio = pago-Math.floor(iva);
		System.out.println("El dinero de vuelta es:         "+Math.floor(cambio)+"€");

	}
}