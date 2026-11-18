package _5Cadenas;

public class Ejercicio06 {
    public static void main(String[] args) {

        String frase = "el rock mola siempre";
        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toUpperCase(frase.charAt(i));

            if (letra == 'O') {
                letra = '0';
            } else if (letra == 'I') {
                letra = '1';
            }

            resultado =resultado + letra;
        }

        System.out.println(resultado);
    }
}
