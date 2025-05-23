package Ejercicios.Ejercicio1;

public class Operacion {

    public int sumaRecursiva(int[] vector, int i) {
        if (i == vector.length) {
            return 0;
        }
        return vector[i] + sumaRecursiva(vector, i + 1);
    }
}
