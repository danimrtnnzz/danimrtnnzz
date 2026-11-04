package _3Bucles;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio14 - Divisores de un numero");
        System.out.println("====================================");

        int n;

        do {
        System.out.print("Dime un número(0 para salir): ");
        n = Integer.parseInt(teclado.nextLine());



            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(" >El " + i + " es divisor de " + n);
                }
            }
            if (n == 0) {
                System.out.println("El programa ha finalizado");
            }
        }while (n!=0);
        // Se mete todo en un do...while para que el proceso
        // se repita hasta que meta el cero, una vez que lo meta se cierra.

    }
}
