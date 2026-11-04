package _3Bucles;

import java.util.Scanner;

public class Ejercicio13Cuello {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio13 - Email Correcto");
        System.out.println("============================");

        boolean existe_arroba = false;
        boolean existe_punto = false;
        int posicion_punto=0;
        int posicion_arroba=0;

        // Leo email
        System.out.println("email: ");
        String email = teclado.nextLine();

        for (int i = 0; i < email.length(); i++) {
            char caracter = email.charAt(i); //Leo letra a letra
            if (caracter == '@'){
                existe_arroba = true;
                posicion_arroba = i;
            }
            else if (caracter == '.') {
                existe_punto = true;
                posicion_punto = i;
            }
        }

        //Analizo booleanos y posiciones

        if (existe_arroba &&
            existe_punto &&
            posicion_arroba<posicion_punto){
            System.out.println("Email VALIDO");
        }else {
            System.out.println("Email NO VALIDO");
        }




    }
}
