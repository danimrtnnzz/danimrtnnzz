package _4Arrays;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio07 - Comparar lista sin orden");
        System.out.println("================================================");

        int[] lista1={1,3,4,2};

        int[] lista2={3,2,4,1};
        //int[] lista2={3,5,2,8};

        int contadorIguales = 0;

        for (int i = 0; i < lista1.length; i++) {
            //Busco el elemento actual lista1[i] en la segunda tabla
            //Si lo encuentro, aumento el contador de iguales
            for (int j = 0; j < lista2.length; j++) {
                if (lista1[i]==lista2[j]){
                    contadorIguales++;
                    break; //AHORRAR TIEMPO
                }
            }
        }

        System.out.println("Contador iguales:"+contadorIguales);
        if (lista1.length == contadorIguales) {
            System.out.println("Sí son iguales");
        }
        else {
            System.out.println("NO son iguales");
        }
    }
}
