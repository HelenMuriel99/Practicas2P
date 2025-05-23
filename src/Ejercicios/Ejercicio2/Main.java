package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadena cadena = new Cadena();
        Inversor inversor = new Inversor();

        System.out.print("Ingresa una cadena: ");
        String entrada = sc.nextLine();

        cadena.setTexto(entrada);
        String resultado = inversor.invertir(cadena.getTexto());

        System.out.println("Cadena invertida: " + resultado);

    }
}
