package _4Arrays;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = {5,4,5,2,5};
        int repeticiones = 0;
        int maxrepe = 0;
        int moda2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" - ");


        }

        for (int i = 0; i < numeros.length; i++) {


            int valor = numeros[i];
            repeticiones=0;
            for (int j = 0; j < numeros.length; j++) {

                if (valor == numeros[j]){
                    repeticiones++;
                }
            }

            //Actualizo maximos
            if (repeticiones>maxrepe){
                maxrepe = repeticiones;
                moda2 = valor;
            }

        }

        //Moda es el numero que se repite mas veces
        System.out.println();
        System.out.println("La moda es: "+moda2+" y las repeticiones serian "+maxrepe);
    }
}
