package estrcturas_datos_hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * Escribe un programa que imprima todas las claves y valores de un HashMap.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("uno", 1);
        hashmap.put("dos", 2);
        hashmap.put("tres", 3);

        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

	}

}
