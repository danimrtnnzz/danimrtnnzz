package _3Bucles;

import java.util.Scanner;

public class ejercicio09cuello {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio09 - caja fuerte");
        System.out.println("=========================");

        String secreto = "0123";
        boolean acertado = false;
        String combinacion;

        do {
            System.out.print("¿Cuál es la contraseña de la caja fuerte?: ");
            combinacion = teclado.nextLine();

            //Comprobar tamaño correcto de la clave.

            if (combinacion.length()!=4){
                System.out.println("ERROR: Tamaño incorrecto");
                System.out.println();
            }

            else if (combinacion.equals(secreto)){
                acertado = true;
                System.out.println("La caja ha sido abierta!!!");
            }

        }while(!acertado);
    }
}
