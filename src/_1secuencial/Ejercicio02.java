package _1secuencial;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular el perimetro y el area de un rectángulo:");

        double base,altura;
        double perímetro,area;

        System.out.print("Dime la base: ");
        base = Double.parseDouble(teclado.nextLine());

        System.out.print("Dime la altura: ");
        altura = Double.parseDouble(teclado.nextLine());

        perímetro = 2*base + 2*altura;
        area = base + altura;

        System.out.println("El perimetro es: "+perímetro+" y el area es:"+area);
        System.out.printf("El perimetro es:%.2f y el area es:%.2f",perímetro,
                area); // si pongo %.0f redondea











    }
}
