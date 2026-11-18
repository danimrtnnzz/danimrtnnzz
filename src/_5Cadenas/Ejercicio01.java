package _5Cadenas;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "Yo he visto cosas que vosotros no creeriais";
        int contador = 0;
        boolean salir = false;

        frase = frase.toLowerCase(); //Paso la frase a minuscula
        System.out.println("Frase: ");
        System.out.println(frase);
        char letra = ' ';
        //Tiene que esyar inicializada a un valor para que pueda comenzar


        do {
            contador = 0;
            System.out.print("Dime letra[INTRO para terminar]: ");

            try {
                letra = teclado.nextLine().toLowerCase().charAt(0);
                //Hago que la letra se ponga en minuscula y sea el primer
                // caracter
            }catch (Exception e){
                System.out.println("El programa a finalizado");
//                break;
                salir = true;
            }

            for (int i = 0; i < frase.length(); i++) {
                if (letra == frase.charAt(i)) {
                    contador++;
                }
            }
            System.out.println("La letra "+letra+" aparece "+contador+" veces");
            System.out.println();
        }while (!salir);
    }

}
