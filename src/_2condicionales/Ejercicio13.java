package _2condicionales;

import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, ape1, ape2;
        char inicialN, inicialN2, inicialape1, inicialape2;

        System.out.print("Dime tu nombre: ");
        nombre = teclado.nextLine().toUpperCase();
        //Otra opcion seria meter otro intro y poner : nombre = nomre
        // .toUpperCase().
        System.out.print("Dime tu primer apellido: ");
        ape1 = teclado.nextLine().toUpperCase();
        System.out.print("Dime tu segundo apellido: ");
        ape2 = teclado.nextLine().toUpperCase();

        int posicionBlanco;
        posicionBlanco = nombre.indexOf(' ');

        //Analizo la variable, para saber si hay espacio o no.

        if (posicionBlanco != -1){
            //El nombre es compuesto.
            inicialN = nombre.charAt(0);
            inicialN2 = nombre.charAt(posicionBlanco+1);
            inicialape1 = ape1.charAt(0);
            inicialape2 = ape2.charAt(0);
            System.out.println("INICIALES: "+ inicialN+inicialN2+inicialape1+inicialape2);
        }else {
            //El nombre es simple.
            inicialN = nombre.charAt(0);
            inicialape1 = ape1.charAt(0);
            inicialape2 = ape2.charAt(0);
            System.out.println("INICIALES: "+ inicialN+inicialape1+inicialape2);
        }





    }
}
