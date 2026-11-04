package _2condicionales;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio 10");
        System.out.println("================");

        System.out.print("Color del semáforo: ");
        String color = teclado.nextLine();
        //Pasamos el color a minuscula.
        color = color.toLowerCase();

        switch (color){
            case "rojo":
                System.out.println("STOP!!!");
                break;
            case "verde":
                System.out.println("Pasar");
                break;
            case "ambar":

                System.out.print("Qué edad tienes?: ");
                int edad = Integer.parseInt(teclado.nextLine());

                if (edad < 20){
                    System.out.println("Eres menor, no puedes pasar");
                }else {
                    System.out.println("Acelera y pasa");
                }
                System.out.println("Pasar con precaucion");
                break;

            default:
                System.out.println("ERROR: color erroneo");
        }
    }
}
