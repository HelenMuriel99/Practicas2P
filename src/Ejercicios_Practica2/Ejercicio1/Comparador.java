package Ejercicios_Practica2.Ejercicio1;

public class Comparador {
    public boolean comparar(int[] v1, int[] v2, int index) {
        if (v1.length != v2.length) {
            return false;
        }
        if (index == v1.length) {
            return true;
        }
        if (v1[index] != v2[index]) {
            return false;
        }
        return comparar(v1, v2, index + 1);
    }
}
