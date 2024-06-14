package estructuras_iterativas_do_while;

import javax.swing.JOptionPane;

/*
 * Crea un programa que pida al usuario que introduzca un número y repita el proceso
 * hasta que el número sea mayor que 100.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número mayor que 100 para salir"));
		} while (numero <= 100);
		
		System.out.println("Programa terminado");
		
	}

}
