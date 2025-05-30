package Ejercicios_Practica2.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Matriz datos = new Matriz();
        CalculadorMaximo buscador = new CalculadorMaximo();

        int[][][] matriz = {
                {{9, 6}, {3, 2}},
                {{5, 1}, {3, 4}}
        };

        datos.setMatriz(matriz);

        int max = buscador.encontrarMaximo(datos.getMatriz(), 0, 0, 0);

        System.out.println("El valor máximo de la matriz es: " + max);
    }
}
