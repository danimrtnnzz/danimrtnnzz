package _6Funciones;

import utilidades.Util;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] notasAlumno1 = {1,2,3,4};

        System.out.print("Dime por cuanto quieres aumentar el valor: ");
        int valor = Integer.parseInt(teclado.nextLine());

        incrementarValores(notasAlumno1, valor);

        Util.imprimirArray(notasAlumno1);

    } //fin main

    public static void incrementarValores (int[] lista, int valor){
        for (int i = 0; i < lista.length; i++) {

            int suma = lista[i] + valor;
            if (suma<=10){
                lista[i] = suma;
            }else{
                lista[i] = 10;
            }

//            lista[i] = lista[i] + valor;
//            if (lista[i]>10){
//                lista[i] = 10;
//            }
        }
    } //fin funcion
}
