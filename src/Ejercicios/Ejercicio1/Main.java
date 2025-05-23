package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector vector = new Vector();
        Operacion operacion = new Operacion();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] datos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }

        vector.setDatos(datos);

        int suma = operacion.sumaRecursiva(vector.getDatos(), 0);
        System.out.println("La suma de los elementos es: " + suma);
    }
}
