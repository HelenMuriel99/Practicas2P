package Ejercicios_Practica1.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VectorDatos vector = new VectorDatos();
        Calcular calcular = new Calcular();

        System.out.print("Ingrese la cantidad de elementos que tendra el vetor: ");
        int n = sc.nextInt();
        int[] datos = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            datos[i] = sc.nextInt();
        }

        vector.setDatos(datos);
        double promedio = calcular.promedio(vector.getDatos());
        System.out.println("Promedio del vector:" + promedio);
    }
}
