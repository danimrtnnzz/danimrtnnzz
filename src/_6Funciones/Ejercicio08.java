package _6Funciones;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        String frase;


        System.out.println("Ejercicio08 - Conversor de frase");
        System.out.println("================================");

        System.out.println("--- MENÚ ---");

        System.out.print("Dime una frase: ");
        frase = teclado.nextLine();

        do {
            System.out.println("Frase actual: " + frase);
            System.out.println("1. Resetear frase");
            System.out.println("2. Pasar a UpperCamelCase");
            System.out.println("3. Pasar a snake_case");
            System.out.println("4. Salir");
            do {
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());

                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                }

            } while (opcion < 1 || opcion > 4);


            switch (opcion) {
                case 1: {
                    frase = resetearFrase(frase);
                    break;
                }
                case 2: {
                    String camel = upperCamelCase(frase);
                    System.out.println("UpperCalemCase: "+camel);
                    break;
                }
                case 3: {
                    String Snake = snakeCase("Snake_case: "+frase);
                    System.out.println(Snake);
                    break;
                }
                case 4: {
                    System.out.println("Fin del programa.");
                    break;
                }
            }
        }while (opcion != 4) ;
    }//fin main

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
