package Ejercicios_Practica2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        VectorMaximo datos = new VectorMaximo();
        CalculadorMaximo calculador = new CalculadorMaximo();

        int[] vector = {1, 3, 9, 5, 4};

        datos.setVector(vector);

        int maximo = calculador.encontrarMaximo(datos.getVector(), 0);
        System.out.println("El valor máximo del vector es: " + maximo);
    }
}
