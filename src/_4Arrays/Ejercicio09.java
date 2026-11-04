package _4Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio09 - SPLIT");
        System.out.println("===================");

        //PARTE 1
//        String frase;
//        do {
//            System.out.print("Dime lo que quieras(INTRO para terminar): ");
//            frase = teclado.nextLine();
//
//            if (!frase.isEmpty()) {
//                String[] palabras = frase.split(" ");
//                System.out.println("Num palabras: " + palabras.length);
//                for (int i = 0; i < palabras.length; i++) {
//                    System.out.println("   -" + palabras[i]);
//                }
//            }
//        }while(!frase.isEmpty()); //!frase.equals("")


        //PARTE 2

        String fecha;

        do {

            System.out.print("Dime una fecha con este formato [dd/mm/aaaa]: ");
            fecha = teclado.nextLine();

            if (!fecha.isEmpty()) {
                String[] fechas = fecha.split("/");
                System.out.print("Num de datos: "+fechas.length);
                System.out.println();
                for (int i = 0; i < fechas.length; i++) {
                    System.out.println("  -"+fechas[i]);
                }
                System.out.println("Dia: "+fechas[0]);
                System.out.println("Mes: "+fechas[1]);
                System.out.println("Año: "+fechas[2]);

            }
        }while(!fecha.isEmpty());








    }
}
