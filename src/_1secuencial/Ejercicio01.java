package _1secuencial;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Ejercicio01

        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        double media;
        System.out.print("Dime el numero 1:");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Dime el numero 2:");
        num2 = Integer.parseInt(teclado.nextLine());

        System.out.print("Dime el numero 3:");
        num3 = Integer.parseInt(teclado.nextLine());

        media = (double)(num1+num2+num3)/3; //double lo pongo para que en los
        // decimales en vez de ponerme 0, me salgan los decimales que le
        // corresponden.
        System.out.println("La media es:"+media);
        System.out.printf("Le media es: %.2f\n",media);







    }
}
