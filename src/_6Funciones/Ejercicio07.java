package _6Funciones;


import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra;

        do {
            System.out.print("Dime una palabra y comprobaremos si es un " +
                    "palindromo: ");
            palabra = teclado.nextLine();

            if (esPalindromo(palabra)){
                System.out.printf("La palabra '%s' si que es palindromo\n",
                        palabra);
            }else{
                System.out.printf("La palabra '%s' no es palindromo\n",
                        palabra);
            }

            System.out.println(
                    "-------------------------------------------------------");


        }while(!palabra.isEmpty());


    } //fin main

    public static String invertir(String texto){

        String invertido = "";

        for (int i = texto.length()-1; i >= 0; i--) {

            invertido = invertido + texto.charAt(i);
        }
        return invertido;

    } //fin funcion1

    public static boolean esPalindromo(String texto){

        boolean esPalindromo = false;
        if (invertir(texto).equals(texto)){
            //System.out.println("Es un palindromo");
            return true;
        }else{
            //System.out.println("No es un palindromo");

            return false;
        }
    } //fin funcion2


} //fin programa
