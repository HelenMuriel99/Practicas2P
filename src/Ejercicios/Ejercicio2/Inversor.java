package Ejercicios.Ejercicio2;

public class Inversor {
    public String invertir(String texto) {
        if (texto.isEmpty()) {
            return texto;
        }
        return invertir(texto.substring(1)) + texto.charAt(0);
    }
}
