package _3Bucles;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int N = teclado.nextInt();

        int suma = 0;
        int facto = 1;

        for (int i = 1; i <= N; i++) {
            suma = suma + i;
            facto = facto * i;
        }

        System.out.println("La suma de los " + N + " primeros números naturales es: " + suma);

        System.out.println();

        System.out.println("El factorial de los " + N + " primeros números " +
                "naturales es: " + facto);

    }
}