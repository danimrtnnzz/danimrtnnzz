package _3Bucles;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejercicio04Mejora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio4 - Menu");
        System.out.println("=================");
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("=============");
            System.out.println("1. Decir hola");
            System.out.println("2. Decir adios");
            System.out.println("3. Salir");

//        Declaro la variable opcion fuera, para que pueda utilizarla dentro
//        del bucle y del switch

            do {
                System.out.print("Dime una opcion: ");
                opcion = Integer.parseInt(teclado.nextLine());

//            if (opcion<1 || opcion>3){
//                System.out.println("OPCIÓN NO VÁLIDA");
//            }

            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    System.out.println("Hola!");
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
            }
            System.out.println();
            if (opcion !=3) {
                System.out.println("Pulse INTRO para continuar");
                String intro = teclado.nextLine();
            }
            System.out.println();

        }while (opcion!=3) ;

    }
}
