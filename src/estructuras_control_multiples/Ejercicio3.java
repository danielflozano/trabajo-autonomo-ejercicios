package estructuras_control_multiples;

import javax.swing.JOptionPane;

/*
 * Escribe un programa que convierta una nota numérica a su equivalente en letra
 * según el sistema de calificaciones estadounidense.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota numérica"));
		
		switch (nota / 10) {
        case 10:
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        default:
            System.out.println("F");
            break;
            
		}

	}

}
