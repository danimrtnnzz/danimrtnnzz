package _4Arrays;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

                int[] numeros = {1, 2, 3, 4};

                boolean creciente = true;
                boolean decreciente = true;

                for (int i = 0; i < numeros.length - 1 ; i++) {

                    if (numeros[i] > numeros[i + 1]) {
                        creciente = false;
                    }

                    if (numeros[i] < numeros[i + 1]) {
                        decreciente = false;
                    }
                }

                if (creciente) {
                    System.out.println("La lista está en orden creciente");
                } else if (decreciente) {
                    System.out.println("La lista está en orden decreciente");
                } else {
                    System.out.println("La lista está sin ordenar");
                }
    }
}
