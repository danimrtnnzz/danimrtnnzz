package _3Bucles;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String secreto = "0123";
        String combinacion;
        boolean acertado = false;
        int intentos = 3;

        while(!acertado){
            System.out.println("Inserte la clave de la caja fuerte, tienes "+ intentos--+
                    " intentos: ");
            combinacion = teclado.nextLine();
            System.out.println();
            System.out.println("Inserte la clave de la caja fuerte, tienes "+intentos--+
                    " intentos: ");
            combinacion = teclado.nextLine();
            System.out.println();
            System.out.println("Inserte la clave de la caja fuerte, tienes " +intentos--+
                    " intento: ");
            combinacion = teclado.nextLine();

            if(combinacion.equals(secreto)){
                acertado = true;
                System.out.println("La caja ha sido abierta");
            }
        }
    }
}
