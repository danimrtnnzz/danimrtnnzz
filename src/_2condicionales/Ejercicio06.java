package _2condicionales;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("OPERADOR TERNARIO");
        System.out.println("====================");

        //Apartado 1
        int a = 6;
        int b = 23;
        int mayor;
        // Esto es lo mismo que lo de abajo.
        mayor = (a>b)?a:b;

        // Me guarda cual de los 2 es mayor.
        if (a > b){
            mayor = a;
        }else{
            mayor = b;
        }

        //Apartado 2
        System.out.print("Dime un numero:");
        int num;
        num = Integer.parseInt(teclado.nextLine());
        String paroimpar = (num%2 == 0 )?"par":"impar";
        System.out.println(paroimpar); //pongo el nombre de la variable y con
        // eso directamente me aparece par o impar dependiendo de la
        // operacion realizada.


        //Apartado 3
        System.out.print("Dime tu edad:");
        int edad;
        edad = Integer.parseInt(teclado.nextLine());
        boolean esMayor = (edad > 18)?true:false;
        if (esMayor == true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
