package _5Cadenas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String frase;
        String resultado = "";
        System.out.print("Dime una frase: ");
        frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)!= ' '){
                //Si no es espacio en blanco, lo concadeno
                resultado = resultado+frase.charAt(i);
            }
        }
        System.out.println(resultado);



    }
}
