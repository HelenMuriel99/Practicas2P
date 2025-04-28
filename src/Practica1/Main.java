package Practica1;

public class Main {
    public static void main(String[] args) {
        ListaSimplemeteEnlazada listaSimplemeteEnlazada = new ListaSimplemeteEnlazada();
        System.out.println(listaSimplemeteEnlazada.estaVacia());

        listaSimplemeteEnlazada.insertar(5);
        listaSimplemeteEnlazada.insertar(4);
        listaSimplemeteEnlazada.insertar(3);
        listaSimplemeteEnlazada.insertar(2);
        listaSimplemeteEnlazada.insertar(1);
        listaSimplemeteEnlazada.insertar(0);

        listaSimplemeteEnlazada.mostrar();

        listaSimplemeteEnlazada.estaVacia();
        listaSimplemeteEnlazada.eliminar();

        listaSimplemeteEnlazada.mostrar();

    }
}
