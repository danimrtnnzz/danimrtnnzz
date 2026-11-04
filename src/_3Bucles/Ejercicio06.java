package _3Bucles;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio6 - Testigo if sin else ");
        System.out.println("================================");

        int num;
//        int contadorNega = 0, por si quiero contar el numero de negativos
//        que he utilizado
        boolean hayNegativos = false;


        do{
            System.out.print("Dime un número entero: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num < 0) {
                hayNegativos = true;
            }
        }while (num != 0) ;


        //if (num>0){
        //contadorNega++;}, esta seria la menra de contar el numero de
        // negativos que he utilizado.


        if (hayNegativos == true){
            System.out.println();
            System.out.println("Si que hay negativos");
        }
    }
}
