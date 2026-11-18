package _5Cadenas;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.print("Email[INTRO para terminar]: ");
            String email = teclado.nextLine();

            if (email.isEmpty()) {
                break;
            }

            int arroba = email.indexOf('@');
            System.out.println("usuario: " + email.substring(0, arroba));
            System.out.println("dominio: " + email.substring(arroba+1,
                    email.length()));
        }

    }
}
