package _4Arrays;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio06 - Comparacion arrays");
        System.out.println("================================");


        int[] lista1 = new int[4];
        int[] lista2 = new int[4];
        int N_num = 1;
        int N_num2= 1;
        int num;
        int num2;
        boolean igual = true;



        for (int i = 0; i < lista1.length; i++) {
            System.out.print("Dime un numero ("+(N_num++)+"): ");
            num = Integer.parseInt(teclado.nextLine());
            lista1[i]=num;
        }
        System.out.println("------------------------------------------------");

        for (int i = 0; i < lista2.length; i++) {
            System.out.print("Dime un numero ("+(N_num2++)+"): ");
            num2 = Integer.parseInt(teclado.nextLine());
            lista2[i]=num2;
        }


        for (int i = 0; i < lista2.length; i++) {

            if (lista1[i] != lista2[i]) {
                igual = false;
                break;
            }
        }
        if (igual){
            System.out.println("Las listas son iguales");
        }else{
            System.out.println("Las listas son diferentes");
        }
    }
}
