package _2condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio 11/Fecha correcta");
        System.out.println("=============");

        int dia, mes, year;
        boolean diaCorrecto, mesCorrecto, yearCorrecto = false;

        System.out.print("Dime el dia: ");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el mes: ");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.print("Dime el año: ");
        year = Integer.parseInt(teclado.nextLine());

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
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha es incorrecta");
        }
    }
}
