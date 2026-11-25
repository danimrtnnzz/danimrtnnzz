package _6Funciones;

import utilidades.Util;

public class Ejercicio10 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,};
        int [] CopiaNumeros = hacerCopia(numeros);

        //Voy a modificar el original
        numeros[0]=666;numeros[1]=777;
        Util.imprimirArray(numeros);



        Util.imprimirArray(CopiaNumeros);
//        Util.imprimirArray(hacerCopia(array));


    } //fin main

    public static int[] hacerCopia(int [] lista){

        int[] resultado =  new int[lista.length];

        for (int i = 0; i < lista.length; i++) {
            resultado[i] = lista[i];
        }

        return resultado;

    } //fin funcion
}
