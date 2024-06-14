package tipos_datos_variables;

import javax.swing.JOptionPane;

/*
 * Crea un programa que declare una variable String para almacenar tu nombre y una variable int
 * para tu edad. Imprime un mensaje que diga "Hola, [nombre]. Tienes [edad] años."
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		
		System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
		
	}

}
