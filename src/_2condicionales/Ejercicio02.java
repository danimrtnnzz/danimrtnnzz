package _2condicionales;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Dime un numero: ");
        numero = Integer.parseInt(teclado.nextLine());

        //Opcion 1 - usando 3 if
        //Opcion 2- usando if.. else
        if (numero > 0 ){
            System.out.println("El numero es positivo");
        }
        if (numero < 0){
            System.out.println("El numero es negativo");
        }
        if (numero == 0){
            System.out.println("El numero es igual a 0");
        }


        //Ahora la opcion 2, con if y else. Al utlizar el else if, una vez
        // llegado al resultado, no sigue con el proceso, por eso esta opcion
        // es mejor ya que terminar antes, de la otra manera ejecuta todas la
        // opciones.


        if (numero > 0 ){
            System.out.println("El numero es positivo");
        }
        else if (numero < 0){
            System.out.println("El numero es negativo");
        }
        else if (numero == 0) {
            System.out.println("El numero es igual a 0");
        }


    }
}
