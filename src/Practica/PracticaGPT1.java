package Practica;

import java.util.Scanner;

public class PracticaGPT1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num;
    int numPar = 0;
    int numImpar = 0;
    int suma = 0;

        do {
            System.out.print("Dime un numero entero: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num != 0) {
                suma = suma + num;
                if (num % 2 == 0) {
                    numPar++;
                } else {
                    numImpar++;
                }
            }
        }while (num != 0);

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("N par: " + numPar);
        System.out.println("N impar: " + numImpar);

    }
}
