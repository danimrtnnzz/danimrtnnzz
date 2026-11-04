package _2condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("SABER AÑO BISIESTO");
        // Dos posibles opciones
        // Es divisible entre 4 pero no entre 100 o es divisible entre 100 y
        // 400.
        //Fusion de ambos IF:
        // if ( year%4 == 0 && !(year%100==0) || (year%100==0 && year%400==0))
        // Con eso podria hacerlo directamente ambas opciones.

        int year;
        System.out.print("Dime el año que quieras:");
        year = Integer.parseInt(teclado.nextLine());
        //OPCION A
        if ( year%4 == 0 && !(year%100==0)){
            System.out.println("El año "+year+" SI es bisiesto");
        }
        //OPCION B
        else if (year%100==0 && year%400==0) {
            System.out.println("El año "+year+" SI es bisiesto");
        }
        else{
            System.out.println("El año NO es bisiesto");
        }

        // Con esta funcion, podemos ver directamente si un año es bisiesto o
        // no
        if (Year.of(year).isLeap()){
            System.out.println("El año "+year+" SI es bisiesto");
        }else{
            System.out.println("El año NO es bisiesto");
        }

        Math.pow(2,8);
        // Para hacer un numero elevado a algo, en este caso
        // seria 2 elevado a 8.
    }
}
