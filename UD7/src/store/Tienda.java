/*Crea una base de datos de 10 artículos para controlar el
stock de productos de una tienda por medio de un diccionario
de datos articulo precio El usuario podrá añadir, por medio
de interfaz visual artículos nuevos y cantidades de estos El
usario podrá consultar la información almacenada en el
diccionario referente a un articulo concreto e incluso listar toda
la información en la terminal del programa*/

package store;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Double> stock = new Hashtable<>();
		int guardprod;
		double num = 0;
		//los 10 articulos que nos piden poner
		stock.put("Pepsi",2.50);
		stock.put("Coke",3.00);
		stock.put("Peras", 6.80);
		stock.put("Pescadería", 15.75);
		stock.put("Carniceria", 25.59);
		stock.put("Pepsi",3.35);
		stock.put("Naranjada",6.00);
		stock.put("Limonada", 7.00);
		stock.put("Rape", 10.75);
		stock.put("Jamón", 5.89);
		
		
		@SuppressWarnings("resource")
		//Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion=0; //Guardaremos la opcion del usuario
 
        while (!salir) {
        	
        	opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Añadir productos y precios"
        			+ "2. Buscar producto"
        			+ "3. Listar todos los productos"
        			+ "4. Salir"));
 
            try {
 
              //Integer sn = Integer.parseInt(JOptionPane.showInputDialog("Escribe una de las opciones"));
                //opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        //System.out.println("Has seleccionado la opcion 1");
                    	do {
                			guardprod = Integer.parseInt(JOptionPane.showInputDialog("Número de artículos a añadir: "));
                		} while (guardprod <= 0); // repetir mientras que el valor de guardado sea mayor de 0

                		for (int a = 1; a <= guardprod; a++) {
                			String nom = JOptionPane.showInputDialog("Nombre del producto: ");
                			double suma = 0;
                			int numprec = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos: "));
                			for (int r = numprec; r > 0; r--) {
                				num = Double.parseDouble(JOptionPane.showInputDialog("Pon un precio: "));
                				suma = suma + num;
                			}
                			stock.put(nom, suma);
                		}
                    	
                    	
                    	
                        break;
                    case 2:
                    	
                    	@SuppressWarnings("rawtypes") Enumeration enu = stock.keys(); 
                    	String Buscar = JOptionPane.showInputDialog("Posa el nom d'article a buscar: ");
                    	for(int i=0; i<Buscar.length(); i++) {
                    	while (enu.hasMoreElements()) { 
                    		String key =  (String) enu.nextElement();
                    		System.out.println(key + ":" + stock.get(key)); 
                        } 
                    	}
                        break;
                    case 3:
                    	@SuppressWarnings("rawtypes")
                		Enumeration llaves = stock.keys();
                		
                		@SuppressWarnings("rawtypes")
                		Enumeration valores = stock.elements();
                		while (llaves.hasMoreElements()) {
                			System.out.println("Los productos " + llaves.nextElement()+" Tienen un precio total de: " + valores.nextElement()+"€");
                			//System.out.println("Tienen un precio total de: " + valores.nextElement()+"€");
                			
                			
                		}
                        //System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                //sn.next();
            }
        }
		
		
		
		
		
		
		
		
		
		//System.out.println("Introduce una opción");
		
		
		
		
		
		
		
		
	}

}
