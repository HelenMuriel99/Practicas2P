package Practica13;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo nodo, int dato) {
        if (nodo == null) return new Nodo(dato);

        if (dato < nodo.dato) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, dato);
        } else if (dato > nodo.dato) {
            nodo.derecha = insertarRecursivo(nodo.derecha, dato);
        }
        return nodo;
    }

    public void recorridoInOrden() {
        recorridoInOrden(raiz);
        System.out.println();
    }

    private void recorridoInOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoInOrden(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            recorridoInOrden(nodo.derecha);
        }
    }
}

