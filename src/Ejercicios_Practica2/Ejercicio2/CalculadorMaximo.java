package Ejercicios_Practica2.Ejercicio2;

public class CalculadorMaximo {
    public int encontrarMaximo(int[] vector, int index) {
        if (index == vector.length - 1) {
            return vector[index];
        }
        int maxResto = encontrarMaximo(vector, index + 1);
        return Math.max(vector[index], maxResto);
    }
}
