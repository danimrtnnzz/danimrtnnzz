package _5Cadenas;

import java.util.Scanner;

public class Ejercicio10 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Introduce una frase: ");
            String frase = teclado.nextLine();
            String fraseCifrada = "";

            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                char caracterCifrado = (char) (caracter + 1);
                fraseCifrada = fraseCifrada + caracterCifrado;
            }

            System.out.println("Frase cifrada: " + fraseCifrada);

            System.out.print("Pega la frase cifrada: ");
            String textoCifrado = teclado.nextLine();
            String fraseDescifrada = "";

            for (int i = 0; i < textoCifrado.length(); i++) {
                char caracter = textoCifrado.charAt(i);
                char caracterDescifrado = (char) (caracter - 1);
                fraseDescifrada = fraseDescifrada + caracterDescifrado;
            }

            System.out.println("Frase descifrada: " + fraseDescifrada);

            teclado.close();
    }
}
