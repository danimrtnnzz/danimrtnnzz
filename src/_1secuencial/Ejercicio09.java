package _1secuencial;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Iniciales

        String nombre, apellido1, apellido2;

        System.out.print("Dime tu nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Dime tu primer apellido: ");
        apellido1 = teclado.nextLine();
        System.out.print("Dime tu segundo apellido: ");
        apellido2 = teclado.nextLine();

        //Paso los char a mayusculas

        char InicialN = nombre.charAt(0); //caracter en la poscion 0
        char Inicial1 = apellido1.charAt(0);
        char Inicial2 = apellido2.charAt(0);

        //Paso los char a mayusculas
        InicialN = Character.toUpperCase(InicialN);
        Inicial1 = Character.toUpperCase(Inicial1);
        Inicial2 = Character.toUpperCase(Inicial2);

        System.out.println("Tus iniciales son: "+InicialN+Inicial1+Inicial2);


    }
}
