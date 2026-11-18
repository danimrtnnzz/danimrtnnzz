package _5Cadenas;

import java.util.Locale;

public class Ejercicio03 {
    public static void main(String[] args) {
        String frase= "HOMBRES Y MUJERES TENEMOS LOS MISMOS DERECHOS";
        System.out.println(frase);
        frase = frase.toLowerCase();

        //Hago la frase minuscula

        String palabra = "MUJERES";
        palabra = palabra.toLowerCase();

        //======PARTE1
        //Usando indexOf
        if (frase.indexOf("mujeres") != -1){
            System.out.println("-"+palabra+" sí aparece");
        }else{
            System.out.println("-"+palabra+" no aparece");
        }

        //Usando contains

        if (frase.contains(palabra)){
            System.out.println("-"+palabra+" sí aparece");
        }else{
            System.out.println("-"+palabra+" no aparece");
            System.out.println();
        }

        //Contains y operador ternario

        String si_no = frase.contains(palabra) ? "si" : "no";
        System.out.printf("-%s %s aparece",palabra,si_no);
        //======PARTE2 - indicar num palabras

        int contadorEspacios = 0;
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' '){
                contadorEspacios++;
            }
        }
        System.out.println();
        System.out.println("Hay "+(contadorEspacios+1)+" palabras");


        //======PARTE3 - cambiar espacios por _
        frase = frase.toUpperCase();
        frase = frase.replace(' ','_');

        System.out.println(frase);


        //======PARTE4 - eliminar espacios en blanco
        frase = frase.replace("_","");

        System.out.println(frase);



    }
}
