package _3bucles;

import java.util.Scanner;

public class _1ejemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        do {
        System.out.print("Dime un numero: ");
        num = Integer.parseInt(teclado.nextLine());
        }while (num>=0);



    }
}
