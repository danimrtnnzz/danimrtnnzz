package Examen1_4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;

        do {
            System.out.print("¿Cuántos números quieres jugar? (1 a 3): ");
            cantidad = sc.nextInt();
        } while (cantidad < 1 || cantidad > 3);

        int[] misNumeros = new int[cantidad];
        int[] combinacion = new int[5];

        // Pedir los números del jugador.
        for (int i = 0; i < misNumeros.length; i++) {
            int numero;
            boolean valido;

            do {
                System.out.print("Introduce el número " + (i + 1) + " (1 a 9): ");
                numero = sc.nextInt();
                valido = true;

                if (numero < 1 || numero > 9) {
                    valido = false;
                    System.out.println("El número debe estar entre 1 y 9.");
                } else {
                    for (int j = 0; j < i; j++) {
                        if (misNumeros[j] == numero) {
                            valido = false;
                        }
                    }

                    if (!valido) {
                        System.out.println("Ese número ya lo has introducido.");
                    }
                }
            } while (!valido);

            misNumeros[i] = numero;
        }

        // Generar cinco números aleatorios sin repetir.
        for (int i = 0; i < combinacion.length; i++) {
            int numero;
            boolean repetido;

            do {
                numero = (int) (Math.random() * 9) + 1;
                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (combinacion[j] == numero) {
                        repetido = true;
                    }
                }
            } while (repetido);

            combinacion[i] = numero;
        }

        System.out.print("\nTus números: ");
        for (int i = 0; i < misNumeros.length; i++) {
            System.out.print(misNumeros[i] + " ");
        }

        System.out.print("\nCombinación ganadora: ");
        for (int i = 0; i < combinacion.length; i++) {
            System.out.print(combinacion[i] + " ");
        }

        // Comparar cada número del jugador con la combinación.
        int aciertos = 0;

        for (int i = 0; i < misNumeros.length; i++) {
            for (int j = 0; j < combinacion.length; j++) {
                if (misNumeros[i] == combinacion[j]) {
                    aciertos++;
                }
            }
        }

        System.out.println("\nHas acertado " + aciertos + " números.");

        sc.close();
    }
}