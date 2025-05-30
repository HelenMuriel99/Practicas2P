package Ejercicios_Practica2.Ejercicio3;

public class ComparadorMatriz {
    public boolean comparar(int[][][] m1, int[][][] m2, int x, int y, int z) {
        if (x == m1.length) {
            return true;
        }
        if (m1[x][y][z] != m2[x][y][z]) {
            return false;
        }

        if (z < m1[0][0].length - 1) {
            return comparar(m1, m2, x, y, z + 1);
        } else if (y < m1[0].length - 1) {
            return comparar(m1, m2, x, y + 1, 0);
        } else {
            return comparar(m1, m2, x + 1, 0, 0);
        }
    }
}
