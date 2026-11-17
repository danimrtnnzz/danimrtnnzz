package _5Cadenas;

public class Ejercicio02 {
    public static void main(String[] args) {
        String frase = "El covid19 es lo peor";
        int vocalesC = 0;
        int consonantesC = 0;
        char letra;

        frase = frase.toLowerCase(); //Paso a minuscula
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);

            //Analizo letra

//            if (letra == 'a' || letra == 'e' || letra == 'i'|| letra == 'o'|| letra == 'u'){
//                vocalesC++;
//            }else{
//                consonantesC++;
//            }

            switch (letra){
                case'a','e','i','o','u':
                    vocalesC++;
                    break;
                case '0','1','2','3','4','5','6','7','8','9':
                    break;
                case ' ': //trato el espacio
                    break;

                default:
                    consonantesC++;
            }
        }
        System.out.println("En la frase hay un total de "+vocalesC+" vocales " +
                "y "+consonantesC+" consonantes");
    }

}
