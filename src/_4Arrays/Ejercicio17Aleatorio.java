package _4Arrays;

import java.util.Random;

public class Ejercicio17Aleatorio {
    public static void main(String[] args) {

        Random random = new Random();
        String[][] tabla = new String[3][3];

        // Inicializar todas las casillas como vacías
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = " ";
            }
        }

        String jugadorActual = "x";
        boolean hayGanador = false;
        int movimientos = 0;

        while (!hayGanador && movimientos < 9) {

            int fila;
            int columna;

            // Buscar una casilla vacía al azar
            do {
                fila = random.nextInt(3);
                columna = random.nextInt(3);
            } while (!tabla[fila][columna].equals(" "));

            // Colocar la ficha del jugador actual
            tabla[fila][columna] = jugadorActual;
            movimientos++;

            // Comprobar filas y columnas
            for (int i = 0; i < tabla.length; i++) {

                if (tabla[i][0].equals(jugadorActual) &&
                        tabla[i][1].equals(jugadorActual) &&
                        tabla[i][2].equals(jugadorActual)) {

                    hayGanador = true;
                }

                if (tabla[0][i].equals(jugadorActual) &&
                        tabla[1][i].equals(jugadorActual) &&
                        tabla[2][i].equals(jugadorActual)) {

                    hayGanador = true;
                }
            }

            // Comprobar diagonal principal
            if (tabla[0][0].equals(jugadorActual) &&
                    tabla[1][1].equals(jugadorActual) &&
                    tabla[2][2].equals(jugadorActual)) {

                hayGanador = true;
            }

            // Comprobar diagonal secundaria
            if (tabla[0][2].equals(jugadorActual) &&
                    tabla[1][1].equals(jugadorActual) &&
                    tabla[2][0].equals(jugadorActual)) {

                hayGanador = true;
            }

            // Cambiar de jugador si la partida continúa
            if (!hayGanador && movimientos < 9) {
                if (jugadorActual.equals("x")) {
                    jugadorActual = "o";
                } else {
                    jugadorActual = "x";
                }
            }
        }

        // Mostrar el tablero final
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print("[" + tabla[i][j] + "]");
            }
            System.out.println();
        }

        // Mostrar el resultado
        if (hayGanador) {
            System.out.println("Ha ganado el jugador " + jugadorActual);
        } else {
            System.out.println("Empate.");
        }
    }
}