package Ejercicios_Practica2.Ejercicio4;

public class CalculadorMaximo {
    public int encontrarMaximo(int[][][] matriz, int x, int y, int z) {
        if (x == matriz.length) {
            return Integer.MIN_VALUE;
        }
        int actual = matriz[x][y][z];

        int maxResto;
        if (z < matriz[0][0].length - 1) {
            maxResto = encontrarMaximo(matriz, x, y, z + 1);
        } else if (y < matriz[0].length - 1) {
            maxResto = encontrarMaximo(matriz, x, y + 1, 0);
        } else {
            maxResto = encontrarMaximo(matriz, x + 1, 0, 0);
        }
        return Math.max(actual, maxResto);
    }
}
