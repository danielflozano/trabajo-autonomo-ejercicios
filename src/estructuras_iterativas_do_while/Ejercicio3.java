package estructuras_iterativas_do_while;

/*
 * Escribe un programa que calcule la suma de los números pares del 1 al 50 usando un bucle do-while.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int i = 1;
		int suma = 0;
		
		do {
			if (i % 2 == 0) {
				suma += i;
			}
			
			i++;
		} while (i <= 50);
		
		System.out.println("La suma de los números pares del 1 al 50 es: " + suma);

	}

}
