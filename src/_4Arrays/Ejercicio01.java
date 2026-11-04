package _4Arrays;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio01 - Declarar Array");
        System.out.println("============================");

        String[] animales = {"perro","gato","rata","pajaro","raton"};
        String[] animales2 = new String[5];
        animales2[0]="perro";
        animales2[1]="gato";
        animales2[2]="rata";
        animales2[3]="pajaro";
        animales2[4]="raton";


        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        System.out.println(animales[4]);

        System.out.println("----------------------------------------");
        //Imprimir valores de un array

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i]);
        }

        System.out.println("----------------------------------------");

        System.out.println("PARTE 2");
        System.out.println("=======");

        int[] enteros = {2,4,6,8,10};
        for (int i = enteros.length-1; i >=0 ; i--) {
            System.out.println(enteros[i]);
        }




    }
}
