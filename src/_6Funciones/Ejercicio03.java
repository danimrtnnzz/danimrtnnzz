package _6Funciones;

import org.jetbrains.annotations.NotNull;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Programa principal

        System.out.print("Dime una fecha (dd/mm/aaaa): ");
        String fecha = teclado.nextLine();

        int salida = fechaCorrecta(fecha);
        if (salida == 2){
            System.out.println("ERROR: Valores incorrectos");
        } else if (salida == 1) {
            System.out.println("ERROR: Formato incorrecto");
        }else{
            imprimirFechaLarga(fecha);
        }
        //Al estar correcto pongo la funcion imprimirFechaLarga e imprime
        // directamente la fecha correcta


    } //fin main




    //JAVADOC
    //Funcion que pide una fecha y comprueba que esta en formato dd/mm/aaaa.
    // Es decir, hay que usar dos digitos para el dia y el mes y 4 cuatro
    // para el año.
    //ENTRADA: una cadena con la fecha
    //DEVUELVE: true si es correcta en formato

    /**
     * Función para indicar si una fecha es correcta, tanto en formato
     * dd/mm/aaaa como en valores.
     * @param fecha  en formato dd/mm/aaaa
     * @return true o false
     */
    public static boolean formatoFechaCorrecta(@org.jetbrains.annotations.NotNull String fecha){

            boolean  formatoFechaCorrecto= true;  //reseteo variable

            //fecha = null ; para ver la pila de llamadas
            String[] camposFecha = fecha.split("/");
            //Tenemos que tener tres campos
            if (camposFecha.length !=3){
                formatoFechaCorrecto = false;

                //Compruebo la longitud de cada campo
            }else if (camposFecha[0].length()!=2 ||
                    camposFecha[1].length()!=2   ||
                    camposFecha[2].length()!=4 ) {

                formatoFechaCorrecto = false;
            }

            // Se simplifica y no hace falta poner if...else
            return formatoFechaCorrecto;
    } // fin funcion 1


    /**
     * Función para indicar si una fecha es correcta, tanto en formato
     * dd/mm/aaaa como en valores.
     * @param fecha  en formato dd/mm/aaaa
     * @return devuelve 0 si es correcta, 1 si tiene error en el formato y 2
     * si error en valores
     */
    public static int fechaCorrecta(String fecha){
        boolean fechaCorrecta = true;

        //1º - Compruebo formato

        fechaCorrecta = formatoFechaCorrecta(fecha);

        if (!fechaCorrecta){
            return 1;
        }

        // Compruebo valores
        // Necesito ahora sacar los campos.

        String[] camposFecha = fecha.split("/");
        int dia = Integer.parseInt(camposFecha[0]);
        int mes = Integer.parseInt(camposFecha[1]);
        int year = Integer.parseInt(camposFecha[2]);

        System.out.printf("Dia:%d  Mes:%d  Año:%d\n", dia,mes,year);


        int [] diasMes={0,31,28,31,30,31,30,31,31,30,31,30,31};

        //Antes de seguir, si el año es bisiesto, hago que febrero tenga
        //29 dias
        if (Year.isLeap(year)){
            diasMes[2]=29; //actualizamos tabla
        }

        if (year<1900 || year>3000){
            fechaCorrecta = false;
        }
        else if (mes<1 || mes>12){
            fechaCorrecta = false;
        }
        else if(dia <1 || dia >diasMes[mes]){
            fechaCorrecta = false;
        }

        if (!fechaCorrecta){
            return 2;
        }

        //Si llego hasta aqui es porque la fecha tiene un formato correcto y
        // los valores son correctos
        return 0;
    } //fin fecha correcta



    /** Funcion para imprimir la fecha en formato "23 de enero del 2000"
     * No comprueba errores. No devuelve nada.
     * @param fecha en formato dd/mm/aaaa
     */
    public static void imprimirFechaLarga(@NotNull String fecha){

        String [] mesesAño={"","enero","febrero","marzo","abril","mayo",
                "junio","julio","agosto","septiembre","octubre",
                "noviembre","diciembre"};

        String[] camposFecha = fecha.split("/");
        int dia = Integer.parseInt(camposFecha[0]);
        int mes = Integer.parseInt(camposFecha[1]);
        int year = Integer.parseInt(camposFecha[2]);

        System.out.printf("%d de %s del %d", dia,mesesAño[mes],year);

    } //fin imprimir fechaLarga

} // fin class
