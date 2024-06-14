package estrcturas_datos_hashmap;

import java.util.HashMap;

/*
 * Crea un programa que elimine un par clave-valor de un HashMap.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("uno", 1);
        hashmap.put("dos", 2);
        hashmap.put("tres", 3);

        hashmap.remove("dos");

        System.out.println("Valor asociado con 'dos': " + hashmap.get("dos")); // Imprime: null
        
	}

}
