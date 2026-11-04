package _4Arrays;

public class Ejercicio17 {
    public static void main(String[] args) {

        System.out.println("Ejercicio17 - 3 en raya");
        System.out.println("=======================");
        String[][] tabla = {
                {"x", "o", "x"},
                {" ", "o", "o"},
                {"x", "o", "x"}
        };

        boolean jugadorXGana = false;
        boolean jugadorOGana = false;

        // Mostrar el tablero
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        // Comprobar filas
        for (int i = 0; i < tabla.length; i++) {
            if (!tabla[i][0].equals(" ") &&
                    tabla[i][0].equals(tabla[i][1]) &&
                    tabla[i][1].equals(tabla[i][2])) {

                if (tabla[i][0].equals("x")) {
                    jugadorXGana = true;
                } else if (tabla[i][0].equals("o")) {
                    jugadorOGana = true;
                }
            }
        }

        // Comprobar columnas
        for (int i = 0; i < tabla.length; i++) {
            if (!tabla[0][i].equals(" ") &&
                    tabla[0][i].equals(tabla[1][i]) &&
                    tabla[1][i].equals(tabla[2][i])) {

                if (tabla[0][i].equals("x")) {
                    jugadorXGana = true;
                } else if (tabla[0][i].equals("o")) {
                    jugadorOGana = true;
                }
            }
        }

        // Comprobar diagonal principal
        if (!tabla[0][0].equals(" ") &&
                tabla[0][0].equals(tabla[1][1]) &&
                tabla[1][1].equals(tabla[2][2])) {

            if (tabla[0][0].equals("x")) {
                jugadorXGana = true;
            } else if (tabla[0][0].equals("o")) {
                jugadorOGana = true;
            }
        }

        // Comprobar diagonal secundaria
        if (!tabla[0][2].equals(" ") &&
                tabla[0][2].equals(tabla[1][1]) &&
                tabla[1][1].equals(tabla[2][0])) {

            if (tabla[0][2].equals("x")) {
                jugadorXGana = true;
            } else if (tabla[0][2].equals("o")) {
                jugadorOGana = true;
            }
        }

        // Mostrar el resultado
       if (jugadorXGana) {
            System.out.println("Ha ganado el jugador X.");
        } else if (jugadorOGana) {
            System.out.println("Ha ganado el jugador O.");
        } else {
            System.out.println("TABLAS.");
        }
    }
}