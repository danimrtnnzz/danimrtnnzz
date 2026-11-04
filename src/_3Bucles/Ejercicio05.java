package _3Bucles;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio5 - VOCALES");
        System.out.println("====================");


        char caracter;

        do {
            System.out.print("Dime un caracter: ");
            caracter = teclado.nextLine().toLowerCase().charAt(0);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                System.out.println("El caracter es una VOCAL");
            }else{
                System.out.println("El caracter NO ES VOCAL");
            }
        }while(caracter != ' ');


    }
}
