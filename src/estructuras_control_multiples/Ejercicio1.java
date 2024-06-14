package estructuras_control_multiples;

import javax.swing.JOptionPane;

/*
 * Escribe un programa que pida un número del 1 al 7 y muestre el día de la semana correspondiente.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 7"));
		
		switch (dia) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        case 4:
            System.out.println("Jueves");
            break;
        case 5:
            System.out.println("Viernes");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        case 7:
            System.out.println("Domingo");
            break;
        default:
            System.out.println("Número inválido.");
            
		}

	}

}
