package estructuras_datos_arraylist;

import java.util.ArrayList;

/*
 * Crea un programa que elimine un elemento específico de un ArrayList.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Carlos");
        lista.add("Marta");
        lista.add("Pedro");

        lista.remove("Carlos");

        for (String nombre : lista) {
            System.out.println(nombre);
        }

	}

}
