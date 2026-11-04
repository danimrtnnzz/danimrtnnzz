package _1secuencial;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // si pongo 4%3, es el resto de la división, por lo tanto me saldría
        // el numero 1, ya que es el resto.
        System.out.println("Introduce un numero entero");
        int numero = Integer.parseInt(teclado.nextLine());

        int unidades = numero%10; //calculo el módulo, que es el resto de la
        // division
        int decenas = numero/10; // division entera

        // Invierto el numero
        int numeroInvertido = unidades*10+decenas;
        System.out.print("El número invertido es: "+numeroInvertido);



    }
}
