package _1secuencial;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double grados_en_f;
        System.out.print("Dime cuantos grados Fahrenheit hacen:");
        grados_en_f = Double.parseDouble(teclado.nextLine());
        double gradosF_en_C = (grados_en_f -32)*5/9;
        System.out.println("Hacen" +gradosF_en_C+" Celsius");
        System.out.printf("Hacen %.2f, grados Celcius", gradosF_en_C);




    }
}
