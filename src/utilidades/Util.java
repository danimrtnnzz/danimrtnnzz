package utilidades;

import java.util.Scanner;

public class Util {
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

    public static String resetearFrase(String frase){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime una frase nueva: ");
        frase = teclado.nextLine();
        return frase;
    } //fin funcion1

    public static String upperCamelCase(String frase){
        String[] palabras = frase.split(" ");
        String camel = "";
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (!palabra.isEmpty()) {
                camel = camel + palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
            }
        }
        return camel;
    } //fin funcion 2

    public static String snakeCase(String frase){
        String snake = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letra == ' ') {
                letra = '_';
            } else {
                snake = snake + Character.toLowerCase(letra);
            }
        }
        return snake;
    } //fin funcion 3

}
