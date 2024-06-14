package estructuras_iterativas_while;

/*
 * Crea un programa que calcule la suma de los números del 1 al 100 usando un bucle while.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int i = 1;
        int suma = 0;

        while (i <= 100) {
            suma += i;
            i++;
        }
        
        System.out.println("La suma es: " + suma);

	}

}
