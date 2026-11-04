package _3Bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio11 - Numero afortunado");
        System.out.println("===============================");

        String numero;
        int totalSuerte = 0;
        int totalMalaSuerte = 0;


        System.out.print("Dime un numero : ");
        numero  = teclado.nextLine();

        for (int i=0;i<numero.length();i++) {
            char carac = numero.charAt(i);
            if (carac =='2'|| carac =='5'|| carac=='8'){
                totalSuerte++;
            }else{
                totalMalaSuerte++;
            }
        }
        //Queda analizar el contador.

        if (totalSuerte>totalMalaSuerte){
            System.out.printf("El nunero %s es AFORTUNADO",numero);
            System.out.println("Tiene "+totalSuerte+" numeros afortunados");
        }else{
            System.out.printf("El numero %s es DESAFORTUNADO",numero);
            System.out.println("Tiene "+totalMalaSuerte+" numeros " +
                    "desafortunados");
        }



    }
}
