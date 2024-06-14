package estructuras_iterativas_while;

import javax.swing.JOptionPane;

/*
 * Cree un programa que pida números al usuario hasta que introduzca un número negativo, momento en el cual el programa terminará.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero = 0;
		
		while (numero >= 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (negativo para salir)"));
			
        }

        System.out.println("Programa terminado.");

	}

}
