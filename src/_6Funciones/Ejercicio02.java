package _6Funciones;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio02 {

    public static boolean FechaCorrecta(int dia, int mes, int year) {

        boolean diaCorrecto, mesCorrecto, yearCorrecto = false;


        //Analizamos el año.
        if (year >=1900 && year <= 2500){
            diaCorrecto = true;
        }else {
            diaCorrecto = false;
        }

        //Analizamos el mes.
        if (mes >=1 && mes <= 12){
            mesCorrecto = true;
        }else {
            mesCorrecto = false;
        }

        //Analizamos el dia
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                //Meses de 31 dias
                if (dia >= 1 && dia <= 31) {
                    diaCorrecto = true;
                } else {
                    diaCorrecto = false;
                }
                break;

            case 4, 6, 9, 11:
                //Meses 30 dias
                if (dia >= 1 && dia <= 30) {
                    diaCorrecto = true;
                } else {
                    diaCorrecto = false;
                }
                break;
            case 2:
                //Febrero. Depende si es bisiesto o no.
                if (Year.of(year).isLeap()) {
                    //Año bisiesto.
                    if (dia >= 1 && dia <= 29) {
                        yearCorrecto = true;
                    } else {
                        yearCorrecto = false;
                    }
                }
                else {
                    //Año no bisiesto
                    if (dia >= 1 && dia <= 28){
                        yearCorrecto = true;
                    }else{
                        yearCorrecto = false;
                    }
                }
                break;
        }

        //Ahora, analizo los booleanos.
        if (diaCorrecto == true && mesCorrecto == true && yearCorrecto == true){
            return true;
        } else {
            return false;
        }
    } //fin FechaCorrecta

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime una fecha correcta (dd/mm/aaaa): ");
        String fecha = teclado.nextLine();

        String[] partes = fecha.split("/");

        //Paso el string a int con el "Integer.parseInt"

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int year = Integer.parseInt(partes[2]);

        if (FechaCorrecta(dia,mes,mes)){
            System.out.println("-La fecha es correcta");
        }else{
            System.out.println("-La fecha es incorrecta");
        }
    }
} // fin class
