package constantes;

/*
 * Escribe un programa que declare una constante para el número de días en una semana
 * y use esa constante para calcular cuántas semanas hay en 365 días.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		final int DIAS_X_SEMANA = 7;
		int año = 365;
		
		int semanas = año / DIAS_X_SEMANA;
		
		System.out.println(año + " días equivalen a " + semanas + " semanas.");
		
	}

}
