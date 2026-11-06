package _4Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 18 - Tabla Alumnos");
        System.out.println("============================");
        String[][] alumnos = {
                {"Juan"},
                {"Celia"},
                {"Alfredo"},
                {"Maria"},
                {"Pedro"}
        };

        double[][] evaluaciones = {
                {5, 6, 7, 0},
                {4, 2, 7, 0},
                {6, 8, 9, 0},
                {10, 8, 9, 0},
                {4, 2, 4, 0}
        };

        // 1. Mostrar la tabla antes de calcular las medias.
        System.out.println("TABLA INICIAL");
        System.out.printf("%-10s %8s %8s %8s %8s%n",
                "ALUMNOS", "EVA1", "EVA2", "EVA3", "MEDIA");

        for (int i = 0; i < evaluaciones.length; i++) {
            System.out.printf("%-10s", alumnos[i][0]);

            for (int j = 0; j < evaluaciones[i].length; j++) {
                System.out.printf(" %8.1f", evaluaciones[i][j]);
            }

            System.out.println();
        }

        // 2. Calcular la media de cada alumno.
        for (int i = 0; i < evaluaciones.length; i++) {
            double suma = 0;

            // Sumamos solo las tres evaluaciones.
            for (int j = 0; j < 3; j++) {
                suma += evaluaciones[i][j];
            }

            evaluaciones[i][3] = suma / 3;
        }

        // 3. Contar los suspensos de cada evaluación.
        int[] suspensos = new int[3];

        for (int i = 0; i < evaluaciones.length; i++) {
            for (int j = 0; j < suspensos.length; j++) {
                if (evaluaciones[i][j] < 5) {
                    suspensos[j]++;
                }
            }
        }

        // 4. Buscar la posición del alumno con mayor media.
        int posicionMayor = 0;

        for (int i = 1; i < evaluaciones.length; i++) {
            if (evaluaciones[i][3] > evaluaciones[posicionMayor][3]) {
                posicionMayor = i;
            }
        }

        // 5. Mostrar la tabla con las medias calculadas.
        System.out.println("\nTABLA CON MEDIAS");
        System.out.printf("%-10s %8s %8s %8s %8s%n",
                "ALUMNOS", "EVA1", "EVA2", "EVA3", "MEDIA");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < evaluaciones.length; i++) {
            System.out.printf("%-10s", alumnos[i][0]);

            for (int j = 0; j < evaluaciones[i].length; j++) {
                System.out.printf(" %8.1f", evaluaciones[i][j]);
            }

            System.out.println();
        }

        // 6. Mostrar el array de suspensos.
        System.out.println("----------------------------------------------");
        System.out.printf("%-10s", "Suspen:");

        for (int j = 0; j < suspensos.length; j++) {
            System.out.printf(" %8d", suspensos[j]);
        }

        System.out.println();

        // 7. Mostrar el nombre y la media del mejor alumno.
        System.out.printf(
                "%nEl alumno de mayor media es %s con una media de: %.1f%n",
                alumnos[posicionMayor][0],
                evaluaciones[posicionMayor][3]
        );
    }
}
