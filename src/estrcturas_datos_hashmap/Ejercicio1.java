package estrcturas_datos_hashmap;

import java.util.HashMap;

/*
 * Escribe un programa que almacene y recupere pares clave-valor en un HashMap.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("uno", 1);
        hashmap.put("dos", 2);
        hashmap.put("tres", 3);

        System.out.println("Valor asociado con 'uno': " + hashmap.get("uno"));
        System.out.println("Valor asociado con 'dos': " + hashmap.get("dos"));
        System.out.println("Valor asociado con 'tres': " + hashmap.get("tres"));

	}

}
