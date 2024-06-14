package estructuras_datos_arreglos;

/*
 * Crea un programa que almacene 5 nombres en un array y los imprima en orden inverso.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String[] nombres = {"Ana", "Luis", "Carlos", "Marta", "Pedro"};
		
		for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println(nombres[i]);
        }
		
	}

}
