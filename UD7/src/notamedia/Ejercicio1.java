/*Crea una aplicación que calcule la nota media de los
alumnos pertenecientes al curso de programación Una vez
calculada la nota media se guardara esta información en un
diccionario de datos que almacene la nota media de cada
alumno Todos estos datos se han de proporcionar por
pantalla*/

package notamedia;

import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Double> intro = new Hashtable<>();
		int guardado1;
		double num = 0;
		do {
			guardado1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero de alumnos: "));
		} while (guardado1 <= 0); // repetir mientras que el valor de guardado sea mayor de 0

		for (int a = 1; a <= guardado1; a++) {
			String nom = JOptionPane.showInputDialog("Pon un Nombre para el alumno: ");
			double suma = 0;
			int numnotas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas le pongo? "));
			for (int r = numnotas; r > 0; r--) {
				num = Double.parseDouble(JOptionPane.showInputDialog("Pon una nota: "));
				suma = suma + num;
			}
			double media = suma / numnotas;
			intro.put(nom, media);
		}
		@SuppressWarnings("rawtypes")
		Enumeration llaves = intro.keys();
		@SuppressWarnings("rawtypes")
		Enumeration valores = intro.elements();
		while (llaves.hasMoreElements()) {
			System.out.println("El alumno " + llaves.nextElement());

			System.out.println("Tiene de nota media un: " + valores.nextElement());
		}
	}
}
