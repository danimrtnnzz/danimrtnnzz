package _3Bucles;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Prueba de como funciona un bucle anidado
        //Primero ejecuta el bucle externo y despues el interno
        for (int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                System.out.println(i+"---"+j);
            }
        }


        System.out.println("Tablas de multiplicar");
        System.out.println("=====================");

        System.out.print("Dime un número N: ");
        int N = Integer.parseInt(teclado.nextLine());
        //El primer for controla los numeros metidos por n y el segundo for,
        // el de dentro, haciendo que saca cada numero anterior al N y saca
        // su tabla de multiplicar.

        for (int i=1; i<=N;i++){ //Controla el numero de tablas.
            System.out.println("--------------");
            System.out.println("Tabla del "+i+":");
            System.out.println("--------------");
            for (int j=1; j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }

        System.out.println("RELOJ");
        System.out.println("=====");

        //I son los minutos y la J son los segundos

        for (int i=0; i<=2 ;i++){
            for (int j=0; j<=59;j++){

                if (j>=0 && j<=9){ //Primeros 9 numeros
                    System.out.println(i+":0"+j);
                }else {
                    System.out.println(i + ":" + j);
                }

                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }

                //Aborto cuando llego al 2:00.

                if (i==2 && j==0) {
                    break;
                }
            }
        }

//        System.out.println("Factorial(OPCIONAL)");
//        System.out.println("==================");
//
//        System.out.print("Dime un numero N: ");
//        int n = Integer.parseInt(teclado.nextLine());
//        int factorial = 1;
//
//        for (int i=0; i<=n ;i++){ //Factorial de cada N numero.
//            factorial = 1;
//            for (int j=1; j<=i;j++){
//                factorial = factorial * j;
//            }
//            System.out.println(i+"!--->"+factorial);
//        }





    }
}
