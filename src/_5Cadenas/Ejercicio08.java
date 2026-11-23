package _5Cadenas;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;


        System.out.println("Ejercicio08 - Conversor de frase");
        System.out.println("================================");

        System.out.println("--- MENÚ ---");

        System.out.print("Dime una frase: ");
        String frase = teclado.nextLine();

        do {
        System.out.println("Frase actual: "+frase);
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
                    System.out.print("Dime una frase nueva: ");
                    frase = teclado.nextLine();

                    break;

                }
                case 2: {
                    String[] palabras = frase.split(" ");
                    String camel = "";
                    for (int i = 0; i < palabras.length; i++) {
                        String palabra = palabras[i];
                        if (!palabra.isEmpty()) {
                            camel =
                                    camel + palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
                        }
                    }
                    System.out.println(camel);
                    break;
                }
                case 3: {
                    String snake = "";
                    for (int i = 0; i < frase.length(); i++) {
                        char letra = frase.charAt(i);

                        if (letra == ' ') {
                            letra = '_';
                        } else {
                            snake = snake + Character.toLowerCase(letra);
                        }
                    }
                    System.out.println(snake);
                    break;
                }
                case 4: {
                    System.out.println("Cerrando programa...");
                    break;
                }
            }
        }while (opcion != 4);


    }
}
