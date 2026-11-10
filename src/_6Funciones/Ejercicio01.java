package _6Funciones;


import java.util.Scanner;

public class Ejercicio01 {
    public static boolean esPar(int num) {
        boolean resultado;

        if (num % 2 == 0) {
            resultado = true;
            //return true;
        } else {
            resultado = false;
            //return false;
        }
        return resultado;

    }

    public static void main(String[] args) {

        //Defino fuera el num para que pueda continuar el while y no de error
        int num;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Dime un numero entero (0 FIN): ");
            num = Integer.parseInt(teclado.nextLine());

//            boolean resultado = esPar(num);
//            Estoy cogiendo la funcion y
//            metiendo el numero que he metido por teclado y compruebo si es
//            par o impar
//            System.out.println("El numero "+num+" es par?: " + resultado);

            if (num != 0 ) {
                // para decir que el analisis solo lo hago si el
                // numero es distinto de 0 y asi si el num es 0 no me dice si
                // es par o impar

                if (esPar(num)) {
                    System.out.println("     -PAR");
                } else {
                    System.out.println("     -IMPAR");
                }
            }
        }while (num != 0   );
    }
}
