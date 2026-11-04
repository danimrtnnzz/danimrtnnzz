package _2condicionales;

import java.util.Scanner;

public class Ejercicio15OperadorTernario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean esMayorEdad;
        String mensaje;

        try {
            System.out.println("Indica la edad (INTRO fin): ");
            int edad = Integer.parseInt(teclado.nextLine());

            esMayorEdad = (edad>=18)?true:false;

            mensaje = esMayorEdad ? "Sí" : "No";
            System.out.println("Mayor de edad: "+mensaje);
        }catch (Exception e){
            System.out.println("FIN");
        }
        //El try lo utilizamos para que no aparezca la excepcion


//        if (esMayorEdad){
//            mensaje = "Sí";
//        }else{
//            mensaje = "No";
//        }
//Es lo mismo, solo que esta es una opcion simplificada
    }
}
