package _3Bucles;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                int suma = 0;

                System.out.print("Número (0 para terminar): ");
                int n = Integer.parseInt(teclado.nextLine());

                while (n != 0) {
                    suma += n;
                    System.out.print("Número (0 para terminar): ");
                    n = Integer.parseInt(teclado.nextLine());
                }

                System.out.print("Suma total: " + suma);
        System.out.println();
        // Reseo variable
        suma = 0;
        n=0;

        System.out.print("Número (0 para terminar): ");
        n = Integer.parseInt(teclado.nextLine());


        do {
                    suma += n;
                    System.out.print("Numero (0 para terminar): ");
                    n = Integer.parseInt(teclado.nextLine());
                }while(n != 0);

        System.out.print("Suma total: "+ suma);
    }
}
