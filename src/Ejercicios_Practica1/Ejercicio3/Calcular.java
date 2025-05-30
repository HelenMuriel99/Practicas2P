package Ejercicios_Practica1.Ejercicio3;

public class Calcular {
    public int sumaRecursiva(int[] vec, int n) {
        if (n == 0) {
            return 0;
        }
        return sumaRecursiva(vec, n - 1) + vec[n - 1];
    }

    public double promedio(int[] vec) {
        if (vec.length == 0) {
            return 0;

        }
        int suma = sumaRecursiva(vec, vec.length);
        return (double) suma / vec.length;
    }
}
