package Ejercicios_Practica2.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vectores datos = new Vectores();
        Comparador comparador = new Comparador();

        int[] v1 = {2, 3, 4, 5};
        int[] v2 = {2, 3, 4, 5};

        datos.setVector1(v1);
        datos.setVector2(v2);

        boolean sonIguales = comparador.comparar(datos.getVector1(), datos.getVector2(), 0);

        if (sonIguales) {
            System.out.println("Los vectores som iguales. ");
        } else {
            System.out.println("Los vectores son diferentes. ");
        }
    }
}
