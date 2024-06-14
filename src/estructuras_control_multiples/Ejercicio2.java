package estructuras_control_multiples;

import javax.swing.JOptionPane;

/*
 * Crea un programa que determine la calificación de un estudiante según su nota:
 * A (90-100), B (80-89), C (70-79), D (60-69), F (<60).
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del estudiante"));
		
		char calificacion;
        if (nota >= 90) {
            calificacion = 'A';
        } else if (nota >= 80) {
            calificacion = 'B';
        } else if (nota >= 70) {
            calificacion = 'C';
        } else if (nota >= 60) {
            calificacion = 'D';
        } else {
            calificacion = 'F';
        }

        System.out.println("La calificación del estudiante es: " + calificacion);

	}

}
