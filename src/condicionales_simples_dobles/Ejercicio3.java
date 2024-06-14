package condicionales_simples_dobles;

import javax.swing.JOptionPane;

/*
 * Escribe un programa que pida al usuario un número y determine si es par o impar.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

	}
	
}
