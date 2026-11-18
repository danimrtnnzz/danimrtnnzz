package _5Cadenas;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Contar las apariciones de una palabra en frase sin usar split ni
        // replace
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio07 - Contar apariciones de palabras");
        System.out.println("============================================");

        String frase = "No hay camino para la paz, la paz es el camino";
        int contador = 0;

        System.out.println("FRASE: "+frase);

        String palabra;
        System.out.print("Dime una palabra[INTRO para fin]: ");
        palabra = teclado.nextLine();

        boolean fin = false;

        do {

            int posi_palabra = frase.indexOf(palabra);
            if (posi_palabra != -1){
                //He encontrado la palabra
                contador++;
                frase = frase.substring(posi_palabra+(palabra.length()));
            }else{
                fin=true;
            }

        }while (!fin);

        System.out.printf("La palabra %s aparece %d veces", palabra,contador);

    }
}