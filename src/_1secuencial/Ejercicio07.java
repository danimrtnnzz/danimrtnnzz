package _1secuencial;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A,B;

        System.out.println("Dame un valor para A y un valor para B:");
        System.out.print("El valor de A es de:");
        A = Double.parseDouble(teclado.nextLine());
        System.out.print("El valor de B es de:");
        B = Double.parseDouble(teclado.nextLine());

        System.out.printf("El valor de A %.2f y el valor de B es %.2f",A, B);

        double guardoA = A; // Aqui guardo el valor de la variable A para asi
        // poderlo utilizar para darle el valor a B.
        A = B;
        B = guardoA;
        System.out.println("");

        System.out.printf("Tras intercambiar las variables A toma el valor de" +
                "  %.2f y B toma el valor de %.2f",A, B);





    }
}
