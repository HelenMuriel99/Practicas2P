package Ejercicios_Practica2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Matriz matA = new Matriz();
        Matriz matB = new Matriz();
        ComparadorMatriz comparador = new ComparadorMatriz();

        int[][][] a = {
                {{2, 4}, {6, 8}},
                {{10, 12}, {14, 16}}
        };

        int[][][] b = {
                {{2, 4}, {6, 8}},
                {{10, 12}, {14, 16}}
        };

        matA.setMatriz(a);
        matB.setMatriz(b);

        boolean iguales = comparador.comparar(matA.getMatriz(), matB.getMatriz(), 0, 0, 0);

        if (iguales) {
            System.out.println("Las matrices son iguales.");
        } else {
            System.out.println("Las matrices son diferentes");
        }
    }
}
