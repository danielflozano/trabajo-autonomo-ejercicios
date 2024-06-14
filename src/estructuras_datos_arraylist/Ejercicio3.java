package estructuras_datos_arraylist;

import java.util.ArrayList;

/*
 * Escribe un programa que verifique si un ArrayList contiene un elemento específico.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Luis");
        lista.add("Carlos");
        lista.add("Marta");
        lista.add("Pedro");

        if (lista.contains("Marta")) {
            System.out.println("Marta está en la lista.");
        } else {
            System.out.println("Marta no está en la lista.");
        }

	}

}
