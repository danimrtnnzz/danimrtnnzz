package _4Arrays;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] niños = new String[5];
        int[] edades = new int[5];

        int total = 0;


            for (int i = 0; i < niños.length; i++) {
                System.out.print("Dime el nombre del alumno [* para terminar]" +
                        " " + (i + 1) + ": ");
                niños[i] = teclado.nextLine();
                if (niños[i].equals("*")) {
                    break;
                }else{
                    System.out.print("Dime la edad de " + niños[i] + " :");
                    edades[i] = Integer.parseInt(teclado.nextLine());
                }
                total++;
            }
        if (total > 0) {
            int Mayor = 0;
            int Menor = 0;

            for (int i = 1; i < total; i++) {
                if (edades[i] > edades[Mayor]) {
                    Mayor = i;
                }
                //Saco al niño que es mayor siempre, recorre el array de edades
                // y va comparando uno a uno

                if (edades[i] < edades[Menor]) {
                    Menor = i;
                }
            }

            System.out.println("Alumno de mayor edad: " + niños[Mayor]+" con "+edades[Mayor]+" años");
            System.out.println("Alumno de menor edad: " + niños[Menor]+" con "+edades[Menor]+" años");
        } else {
            System.out.println("No se ha introducido ningún alumno.");
        }
    }
}

