package _3Bucles;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio2 - posi/nega/cero");
        System.out.println("===========================");

        System.out.print("Dime cuantos numeros: ");
        int Numeros = Integer.parseInt(teclado.nextLine());

        //Meto el total Numero para que el mismo numero de la variable, se el
        // mismo que de los pasos del bucle.
        int contadorPosi=0, contadorNega=0, contadorCero=0;

        for(int i = 0; i < Numeros; i++) {
            System.out.print("Dime un numero:");
            int num = Integer.parseInt(teclado.nextLine());

            //Analizamos el número.

            if (num > 0) {
                contadorPosi++;
            } else if (num < 0) {
                contadorNega++;
            }else{
                contadorCero++;
            }
        }
        System.out.println("Tenemos "+contadorPosi+" numeros positivos, "+contadorNega+" numeros negativos, "+contadorCero+" ceros");
    }
}
