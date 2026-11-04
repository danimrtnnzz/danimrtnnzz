package _2condicionales;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio01-Condicionales Program que indique si " +
                "un " + "numero es " + "par o impar");

        int numero;
        System.out.print("Dime un numero: ");
        numero = Integer.parseInt(teclado.nextLine());

        if (numero %2 == 0 ) {  //Pongo == para comparar, no para asignar

            System.out.println("El numero " + numero + " es par.");
        }
            else{
                System.out.println("El numero "+numero+" es impar");
            }
    //ALTERNATIVA CON BOOLEANO

        boolean esPar;
        System.out.print("Dime un numero: ");
        numero = Integer.parseInt(teclado.nextLine());
        //Primero relleno la variable booleana.

        if (numero%2==0){
            esPar = true;
        }
        else {
            esPar = false;
        }
        //Segun el booleano, muestro uno u otro mensaje
        if (esPar = true){
            System.out.println("El numero " + numero + " es par.");
        }
        else{
            System.out.println("El numero " + numero + " es impar.");
        }


    }
}
