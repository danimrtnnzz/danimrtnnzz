package _3bucles;

import java.util.Scanner;

public class _2ejemplo {
    static void main() {

    Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("Dime un numero par, para continuar: ");
            num = Integer.parseInt(teclado.nextLine());
        }while (num%2 == 0 && num!=666);
    }
}
