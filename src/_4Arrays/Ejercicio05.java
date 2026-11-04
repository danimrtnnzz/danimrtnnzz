package _4Arrays;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio05 - Pares");
        System.out.println("===================");


        int[] lista = new int[5];
        int num;
        boolean par = true;

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Dime un numero: ");
            num = Integer.parseInt(teclado.nextLine());
            lista[i] = num;

            if (lista[i]%2!=0){
                par = false;

            }
        }
        if (par){
            System.out.println("Los numeros de la lista son pares");
        }else{
            System.out.println("Hay numeros impares");
        }
    }
}
