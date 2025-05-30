package Ejercicios_Practica1.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero numero = new Numero();
        Potenciador potenciador = new Potenciador();

        System.out.print("Ingresa la base: ");
        numero.setBase(sc.nextInt());

        System.out.print("Ingresa el exponente: ");
        numero.setExponente(sc.nextInt());

        int resultado = potenciador.potencia(numero.getBase(), numero.getExponente());

        System.out.println("Resultado: " + resultado);
    }
}
