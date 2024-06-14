package estructuras_datos.lista_enlazada;

public class ListaEnlazada {
	
	 private Nodo cabeza;

	    public ListaEnlazada() {
	        this.cabeza = null;
	    }

	    public void agregar(int dato) {
	        Nodo nuevoNodo = new Nodo(dato);
	        if (cabeza == null) {
	            cabeza = nuevoNodo;
	        } else {
	            Nodo temp = cabeza;
	            while (temp.siguiente != null) {
	                temp = temp.siguiente;
	            }
	            temp.siguiente = nuevoNodo;
	        }
	    }

	    public void imprimir() {
	        Nodo temp = cabeza;
	        while (temp != null) {
	            System.out.print(temp.dato + " ");
	            temp = temp.siguiente;
	        }
	        System.out.println();
	    }

	    public void eliminar(int dato) {
	        if (cabeza == null) {
	            return;
	        }

	        if (cabeza.dato == dato) {
	            cabeza = cabeza.siguiente;
	            return;
	        }

	        Nodo temp = cabeza;
	        while (temp.siguiente != null && temp.siguiente.dato != dato) {
	            temp = temp.siguiente;
	        }

	        if (temp.siguiente != null) {
	            temp.siguiente = temp.siguiente.siguiente;
	        }
	    }

	    public boolean buscar(int dato) {
	        Nodo temp = cabeza;
	        while (temp != null) {
	            if (temp.dato == dato) {
	                return true;
	            }
	            temp = temp.siguiente;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        ListaEnlazada lista = new ListaEnlazada();
	        lista.agregar(1);
	        lista.agregar(2);
	        lista.agregar(3);
	        lista.agregar(4);

	        System.out.println("Elementos de la lista:");
	        lista.imprimir();

	        System.out.println("Eliminar el elemento 3:");
	        lista.eliminar(3);
	        lista.imprimir();

	        System.out.println("Buscar el elemento 2:");
	        System.out.println(lista.buscar(2) ? "Elemento encontrado" : "Elemento no encontrado");

	        System.out.println("Buscar el elemento 5:");
	        System.out.println(lista.buscar(5) ? "Elemento encontrado" : "Elemento no encontrado");
	    }

}
