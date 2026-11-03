package _4Arrays;

public class Ejercicio16 {
public static void main(String[] args) {

        //Me creo tabla de 5x5(filasxcolumnas)

        int[][] tabla = new int[5][5];


        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j]=(int)(Math.random()*10);
                System.out.print(tabla[i][j]+"  ");
            }
            System.out.println();
        }
        //Suma de las filas

        int sumaFilas = 0;
        for (int i = 0; i < tabla.length; i++) {
            sumaFilas=0;
            for (int j = 0; j < tabla[0].length; j++) {
                sumaFilas = sumaFilas + tabla[i][j];
            }
            System.out.println("Suma de fila"+(i+1)+": "+sumaFilas);
        }

    }
}
