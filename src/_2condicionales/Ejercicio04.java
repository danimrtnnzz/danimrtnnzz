package _2condicionales;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ex1, ex2, ex3;
        double media_examenes;
        boolean notasOK;
        String trabajo;
        String trabajoSI ="S";
        String trabajoNO = "N";

        System.out.print("Dime la nota del primer examen:");
        ex1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime la nota del segundo examen:");
        ex2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime la nota del tercer examen");
        ex3 = Double.parseDouble(teclado.nextLine());

        // Compruebo que todas las notas son correctas.
        if (ex1 >=0 && ex1 <=10 &&
                ex2 >=0 && ex2 <=10 &&
                ex3 >=0 && ex3 <=10){
            notasOK = true;
        }
        else {
            notasOK = false;
        }
        if (notasOK == true) {

            media_examenes = ((ex1 * 0.3) + (ex2 * 0.3) + (ex3 * 0.4));

            System.out.println("Tu media es de " + media_examenes + " en los examenes");
            System.out.printf("Tu media es de %.2f en los examenes\n", media_examenes);

            if (media_examenes < 5 && media_examenes >= 0) {
                System.out.println("Estas suspenso");
            } else if (media_examenes >= 5 && media_examenes < 6) {
                System.out.println("Suficiente");
            } else if (media_examenes >= 6 && media_examenes < 7) {
                System.out.println("Bien");
            } else if (media_examenes >= 7 && media_examenes < 9) {
                System.out.println("Notable");
            } else if (media_examenes >= 9 && media_examenes < 10) {
                System.out.println("Sobresaliente");
            }
        }
        else{
            System.out.println("ERROR: Has introducido alguna nota no permitida.");
        }
    }
}


