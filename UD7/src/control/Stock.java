package control;

import javax.swing.JOptionPane;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
        int opcion=0;
		 while (!salir) {
			 opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Añadir productos y precios"
	        			+ "2. Buscar producto"
	        			+ "3. Listar todos los productos"
	        			+ "4. Salir"));
		 }
	}

}
