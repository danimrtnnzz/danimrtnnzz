package _4Arrays;

import java.util.Random;

public class PRUEBAS {
    public static void main(String[] args) {

        System.out.println("PRUEBAS");
        System.out.println("=======");
        System.out.println();
        Random random = new Random();

        final  int TAM_LISTA = 10;
        final int MIN_NUM = -50;
        final int MAX_NUM = 50;

        int []lista = new int[TAM_LISTA];

        for (int i = 0; i < lista.length; i++) {
            int num = random.nextInt(MIN_NUM,MAX_NUM);
            lista[i]=num;
            System.out.println(lista[i]+" ");

        }

        int valor = -5;

        //Te da valor absoluto de lo que le pongas
        System.out.println(Math.abs(valor));
    }
}
