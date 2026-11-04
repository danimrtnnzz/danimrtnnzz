package _1secuencial;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double calif1,calif2,calif3;
        double califexamen;
        double califtrabajo;

        System.out.println("¿Cual es el resultado de las calificaciones " +
                "parciales?");
        System.out.print("El resultado de la primera calificacion parcial " +
                "es:");
        calif1 = Double.parseDouble(teclado.nextLine());
        System.out.print("El resultado de la segunda calificacion parcial " +
                "es:");
        calif2 = Double.parseDouble(teclado.nextLine());
        System.out.print("El resultado de la tercera calificacion parcial " +
                "es:");
        calif3 = Double.parseDouble(teclado.nextLine());

        System.out.print("Ahora necesito saber cual es el resultado del " +
                "examen final:");
        califexamen = Double.parseDouble(teclado.nextLine());

        System.out.print("Y por ultimo la nota del trabajo final");
        califtrabajo = Double.parseDouble(teclado.nextLine());

        double calificacón_final =
                (((calif1+calif2+calif3)/3)*0.55)+(califexamen*0.3)+(califtrabajo*0.15);

        System.out.println("La calificacion final es de:"+calificacón_final);
        System.out.printf("La calificacion final es de %.2f",calificacón_final);
    }
}
