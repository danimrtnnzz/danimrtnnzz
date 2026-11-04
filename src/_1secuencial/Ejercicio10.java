package _1secuencial;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double monedas2;
        double monedas1;
        double monedas50;
        double monedas20;
        double monedas10;

        System.out.print("Dime el numero de monedas de 2€: ");
        monedas2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el numero de monedas de 1€: ");
        monedas1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el numero de monedas de 0.5€: ");
        monedas50 = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el numero de monedas de 0.2€: ");
        monedas20 = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el numero de monedas de 0.1€: ");
        monedas10 = Double.parseDouble(teclado.nextLine());

        System.out.printf("Tienes: %.0f de 2€ \n", monedas2);
        System.out.printf("Tienes: %.0f de 1€\n", monedas1);
        System.out.printf("Tienes: %.0f de 0.5€\n", monedas50);
        System.out.printf("Tienes: %.0f de 0.20€\n", monedas20);
        System.out.printf("Tienes: %.0f de 0.10€\n", monedas10);

        double centimos = (monedas10*10)+(monedas20*20)+(monedas50*50);

        double division  = centimos/100;
        //numero de euros adicionales que tengo // gracias a la suma de centimos
        double modulo = centimos%100;
        //centimos que sobran

        System.out.println(""+modulo);

        double euros_total = division+(monedas2*2)+(monedas1);
        double centimos_total = modulo;


        System.out.println("En total tienes "+euros_total+" euros y "+centimos_total+" centimos ");
        System.out.printf("En total tienes %.0f euros y %.0f centimos",
                euros_total, centimos_total);




    }
}
