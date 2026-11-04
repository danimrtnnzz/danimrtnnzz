package _1secuencial;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sueldo;
        double venta1, venta2, venta3;
        double porcentaje = 10;  // 10% comision

        System.out.println("¿Cual es el sueldo base del vendedor?:");
        sueldo = Double.parseDouble(teclado.nextLine());
        System.out.println("¿Que valor tienen las ventas que realiza?");
        System.out.print("La primera venta es de:");
        venta1 = Double.parseDouble(teclado.nextLine());
        System.out.print("La segunda venta es de:");
        venta2 = Double.parseDouble(teclado.nextLine());
        System.out.print("La tercera venta es de:");
        venta3 = Double.parseDouble(teclado.nextLine());
        double comision = (venta1+venta2+venta3) * (porcentaje/100);
        double sueldo_final = sueldo+comision;

        System.out.printf("El sueldo final es de %.2f€",sueldo_final);

    }
}
