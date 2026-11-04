package _3Bucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ejercicio13 - Email Correcto");
        System.out.println("============================");

        String email;

        do {
            System.out.print("Introduce un email (INTRO para salir): ");
            email = teclado.nextLine();

            boolean arroba = false;
            boolean punto = false;
            boolean correcto = true;
            int posicionArroba = -1;
            int posicionPunto = -1;


            if (email.isEmpty()) {
                System.out.println("Programa finalizado.");
            } else {

                for (int i = 0; i < email.length(); i++) {
                    char caracter = email.charAt(i);

                    if (caracter == '@') {
                        if (arroba) {
                            correcto = false;
                        }
                        arroba = true;
                        posicionArroba = i;
                    }

                    if (caracter == '.') {
                        punto = true;
                        posicionPunto = i;
                    }
                }

                if (!arroba || !punto) {
                    correcto = false;
                }

                if (posicionArroba <= 0
                    || posicionPunto <= posicionArroba + 1
                    || posicionPunto == email.length() - 1) {
                    correcto = false;
                }

                if (correcto) {
                    System.out.println("Email correcto");
                } else {
                    System.out.println("Email incorrecto");
                }
            }

        } while (!email.isEmpty());

    }
}
