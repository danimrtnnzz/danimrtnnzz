package _2condicionales;

import java.util.Scanner;

public class Ejercicio05 { public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double ex1, ex2, ex3;
    String trabajo;

    System.out.print("Dime la nota del primer examen:");
    ex1 = Double.parseDouble(teclado.nextLine());
    System.out.print("Dime la nota del segundo examen:");
    ex2 = Double.parseDouble(teclado.nextLine());
    System.out.print("Dime la nota del tercer examen");
    ex3 = Double.parseDouble(teclado.nextLine());

    // Compruebo que todas las notas son correctas. No son menores que 0, ni
    // mayores que 10

    boolean notasOK;
    if (ex1 >=0 && ex1 <=10 &&
        ex2 >=0 && ex2 <=10 &&
        ex3 >=0 && ex3 <=10){
        notasOK = true;
    }
    else {
        notasOK = false;
    }

    double media_examenes;
    media_examenes = ((ex1*0.3)+(ex2*0.3)+(ex3*0.4));

    System.out.print("¿Has entregado el trabajo?:");
    trabajo = teclado.nextLine();
    if (trabajo.equals("S") || trabajo.equals("s")){

        System.out.println("Trabajo aprobado");
    }
    else if (trabajo.equals("N") || trabajo.equals("n") ) {
        System.out.println("Tu nota de la evaluacion es: 4. \nEstas suspenso");
    }
    if (trabajo.equals("S") || trabajo.equals("s")) {
        if (media_examenes < 5 && media_examenes >= 0) {
            System.out.println("Estas suspenso");
        } else if (media_examenes >= 5 && media_examenes < 6) {
            System.out.println("Suficiente");
        } else if (media_examenes >= 6 && media_examenes < 7) {
            System.out.println("Bien");
        } else if (media_examenes >= 7 && media_examenes < 9) {
            System.out.println("Notable");
        } else if (media_examenes >= 9 && media_examenes <= 10) {
            System.out.println("Sobresaliente");
            }
        }
    }
}
