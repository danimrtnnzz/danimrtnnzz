package _4Arrays;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio11 - SPLIT2");
        System.out.println("====================");

        String linea="alicia;peralta;manduca;alicia.peralta@gmail.com;" +
                "600554433";

        String[] palabras = linea.split(";");

        System.out.println("Num palabras: "+palabras.length);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("  -"+palabras[i]);
        }
        String nombre = palabras[0]+" "+palabras[1]+" "+palabras[2];
        System.out.println("Nombre: "+nombre);
        String email = palabras[3];
        //Hago segundo split con la variable email
        String[] campos_email = email.split("@");
        System.out.println("Email: "+campos_email[0]);
        String numero = palabras[4];
        System.out.println("Telefono: "+numero);


    }
}
