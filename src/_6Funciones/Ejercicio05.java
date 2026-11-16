package _6Funciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio05 - Generador array");
        System.out.println("=============================");
        System.out.print("Dime el tamaño del array: ");
        int tam = Integer.parseInt(teclado.nextLine());
        System.out.print("Rango inferior: ");
        int min = Integer.parseInt(teclado.nextLine());
        System.out.print("Rango superior: ");
        int max = Integer.parseInt(teclado.nextLine());


        for (int i = 0; i < 50; i++) {
            int[] lista = arrayAleatorio(tam,min,max);
            imprimirArray(lista);

        }
    }

    /**
     * Funciona que genera un array de enteros aleatorios entre min y max,
     * ambos extremos incluidos
     * @param tam tamañdo del array
     * @param min rango minimo del array
     * @param max rango minimo del array
     * @return el array de enteros
     */
    public static int[] arrayAleatorio(int tam, int min, int max) {

        int[] resultado = new int[tam];
        Random random = new Random();
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = random.nextInt(min, max + 1);
        }

        return resultado;
    }
    public static void imprimirArray(int[] array){
    //Imprimimos array de forma bonita
    for (int i = 0; i < array.length ; i++) {
        System.out.print("+----");
    }
    System.out.println("+");

    for (int i = 0; i < array.length ; i++) {
        System.out.printf("|%3d ",array[i]);
    }
    System.out.println("|");
    for (int i = 0; i < array.length ; i++) {
        System.out.print("+----");
    }
    System.out.println("+");
}//fin imprimirArray
}

