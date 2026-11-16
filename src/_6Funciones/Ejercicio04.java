package _6Funciones;

public class Ejercicio04 {
    public static void main(String[] args) {
        int[] lista = {1,3,5,8,12,3,6};
        imprimirArray(lista);
        //Llamo a la funciona y meto el array que me pide que es el array lista
    }

    public static void imprimirArray(int[] array){
        //Imprimo el Array de forma bonita

        System.out.println("| ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" | ");
        }

    } //Fin funciona imprimirArray
}
