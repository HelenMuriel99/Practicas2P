package Practica13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        System.out.println("Introduce los números separados por espacios:");
        String linea = sc.nextLine();
        String[] partes = linea.split(" ");
        for (String parte : partes) {
            try {
                int numero = Integer.parseInt(parte);
                abb.insertar(numero);
            } catch (NumberFormatException e) {
                System.out.println("Ignorando entrada inválida: " + parte);
            }
        }
        System.out.print("Números ordenados (in-order): ");
        abb.recorridoInOrden();
    }
}
