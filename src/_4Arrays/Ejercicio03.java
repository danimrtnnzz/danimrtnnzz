package _4Arrays;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio03- Leer notas");
        System.out.println("=======================");


        double[] notas = new double[5];
        double nota;
        double maximo = 0;
        double minimo = 10;
        double suma = 0;


            for (int i = 0; i < notas.length; i++) {

                System.out.print("Dime la nota del examen: ");
                nota = Double.parseDouble(teclado.nextLine());

                notas[i]=nota;

                System.out.printf("Notas --> [%.2f]\n", nota);

                if (nota > maximo){
                    maximo = nota;
                }
                if (nota < minimo) {
                    minimo = nota;
                }
                suma += nota;
            }
        double media = suma/notas.length;

        System.out.println();

        System.out.printf("La nota maxima es: %.2f\n", maximo);
        System.out.printf("La nota minima es: %.2f\n", minimo);
        System.out.printf( "La media de los examenes es de: %.2f", media);


    }
}
