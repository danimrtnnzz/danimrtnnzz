package _3Bucles;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio3 - Bucles ascendente y descendente");
        System.out.println("============================================");

        for (int i = 0; i<=50 ; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }

        System.out.println("-------------------------------------------");

        for (int i= 100; i>=50; i--){       //Pongo i-- ya que quiero decrecer.
            if (i%2 == 0){
                System.out.println(i);
            }
        }


    }
}
