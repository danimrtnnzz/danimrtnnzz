package _4Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio2 - Meter numero en un array");
        System.out.println("=====================================");

        Random random = new Random();

        int[] numeros = new int[5]; // lo creo sin darle valor aun

        for (int i = 0; i < numeros.length ; i++) {
            int aleatorio = random.nextInt(1,20);
            numeros[i]=aleatorio;
        }
        //FORMA1 : Bucle para imprimirlo
        System.out.println("ARRAY DE NUMEROS");
        System.out.println("------------------------");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("numeros[%d] %5d\n",i, numeros[i]); //Pongo el
            // %10d para el ancho de columna
        }

        System.out.println("-------------------------");

        //FORMA 2 - Bucle para imprimirlo
        System.out.print("Array --> [");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length-1){
                //Estamos en el ultimo elemento
                System.out.print(numeros[i]);
            }else System.out.print(numeros[i]+"|");
        }
        System.out.println("]");
    }
}
