package Practica7;

public class Ejercicios {
        /*
        Factorial de un numero
        5!=5*4*2*1
        4!=4*3*2*1
        5!=5*4!
        4!=4*3!
        2!=2*1!
         */
        public static int factorial(int n){
            int factorial;
            if (n==1){
                //caso base
                factorial=n;
            }else {
                factorial=n*factorial(n-1);
            }

            return factorial;
        }
}
