package Practica1;

public class ListaSimplemeteEnlazada {
    protected Nodo primero;

    public ListaSimplemeteEnlazada() {
        primero = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void insertar(Object dato) {
        if (estaVacia()) {
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }
    }

    public void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();
        }
    }

    public void mostrar() {
        Nodo tmp = primero;
        while (tmp != null) {
            System.out.print(tmp.getDato() + "  ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}
