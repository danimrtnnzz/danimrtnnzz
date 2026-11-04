package _4Arrays;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ejercicio04 - Marca de fin");

        int[] elementos = new int[5];
        int num;

        System.out.println("Meter valores positivos (Negativo para " +
                "finalizar) ");
        System.out.println("Total valores a meter: 5");
        System.out.println();

        //Paso1 - relleno array
        for (int i = 0; i < elementos.length; i++) {

            System.out.print("Dime  un numero (Negativo finaliza): ");
            num = Integer.parseInt(teclado.nextLine());
            elementos[i] = num;

            //Si meto negativo, lo meto y paro

            if (num < 0) {
                break;
            }

        }
            //Paso2 - Muestro valores
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] > 0){
                System.out.print(elementos[i]+"-");
            }
            else {
                break;
            }
        }
    }
}
