package _3Bucles;

import java.util.Scanner;

public class Ejercicio09Mejora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio09Mejora - caja fuerte");
        System.out.println("=========================");

        String secreto = "0123";
        boolean acertado = false;
        String combinacion;
        int intentos = 0;  //Máximo 3 intentos

        do {
            System.out.print("¿Cuál es la contraseña de la caja fuerte?: ");
            combinacion = teclado.nextLine();
            intentos++;

            //Comprobar tamaño correcto de la clave.

            if (combinacion.length()!=4){
                System.out.println("ERROR: Tamaño incorrecto");
                System.out.println();
            }
            else if (combinacion.equals(secreto)){
                acertado = true;
                System.out.println("La caja ha sido abierta!!!");
            }
            else if (intentos==3){
                System.out.println("Caja bloqueada");
            }
        }while(!acertado && intentos<3);
    }
}
