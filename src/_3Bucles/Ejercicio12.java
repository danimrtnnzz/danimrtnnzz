package _3Bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int secreto=(int)(Math.random()*50)+1;
        int intentos = 0;
        boolean acertado = false;

        do {
            System.out.println("Dime un numero entre el 1 y el 50: ");
            int num = Integer.parseInt(teclado.nextLine());
            intentos++;

            if (num == secreto){
                acertado = true;
            } else if (num < secreto) {
                System.out.println("El numero secreto es MAYOR");
            } else if (num > secreto) {
                System.out.println("El numero secreo es MENOR");
            }
        }while (!acertado);

        System.out.printf("\nNumero secreto [%d] encontrado\n",secreto);
        System.out.println("Intentos: "+intentos);

    }
}
