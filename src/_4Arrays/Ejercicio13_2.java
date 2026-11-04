package _4Arrays;

import java.util.Scanner;

public class Ejercicio13_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombres; //new String[5];
        int[] edades;//new int[5];

        System.out.println("¿Cuántas personas máximo quieres guardar?: ");
        int maxPersonas = Integer.parseInt(teclado.nextLine());

        nombres = new String[maxPersonas];
        edades = new int[maxPersonas];

        System.out.println("Dame nombres y edades. Máximo de "+maxPersonas+" " +
                "personas");
        System.out.println("Si quieres finalizar antes, introduce *");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            nombres[i] = nombre;

            if (!nombres[i].equals("*")){ //Si el nombre es distinto de * pide edad
                System.out.print("Edad: ");
                int edad = Integer.parseInt(teclado.nextLine());
                edades[i] = edad;
            }else{
                edades[i] = -1;
                break;
                //El break lo meto aqui que lo usa cuando meto * para parar
                // el bucle
            }
        }
        //PARTE " - mostrar nombre del mayor y el menor

        int posMax = 0;
        int posMin = 0;
        int maxedad = edades[0];
        int minedad = edades[0];

        //Recorro con while porque no se cuantos pasos voy a dar
        int i=0;
        while(edades[i]!=-1 && i<edades.length){
            if (maxedad<edades[i]){ //Scar maximo
                maxedad=edades[i];
                posMax = i;
            }
            if (minedad>edades[i]){ //Scar maximo
                minedad=edades[i];
                posMin = i;
            }
            i++;
        }
        //Muestro datos
        System.out.println("----------------------------------");
        System.out.println("Nombre del mayor: "+nombres[posMax]);
        System.out.println("Nombre del mayor: "+nombres[posMin]);


    }
}