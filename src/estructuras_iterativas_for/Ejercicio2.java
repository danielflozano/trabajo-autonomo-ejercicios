package estructuras_iterativas_for;

import javax.swing.JOptionPane;

/*
 * Crea un programa que calcule el factorial de un número dado por el usuario.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		long numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
		long factorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			
			factorial *= i;
			
		}
		
		System.out.println("El factorial de " + numero + " es: " + factorial);

	}

}
