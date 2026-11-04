package _2condicionales;

import java.sql.SQLData;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio08 - SWITCH");
        System.out.println("=====================");

        int diaSemana;

        System.out.print("Dime el dia de la semana:");
        diaSemana = Integer.parseInt(teclado.nextLine());


        //El break es importante, si no lo pongo entre media, muestra lo que
        // tengo en esa funcion mas lo que hay en la de abajo.
        switch (diaSemana){
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("Dia incorrecto");
        }
    }
}
