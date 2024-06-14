package estructuras_datos_arraylist;

import java.util.ArrayList;

/*
 * Escribe un programa que agregue 5 elementos a un ArrayList y luego los imprima.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Carlos");
        lista.add("Marta");
        lista.add("Pedro");

        for (String nombre : lista) {
            System.out.println(nombre);
        }

	}

}
