package _6Funciones;


public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Ejercicio06 - Comparar y fusionar arrays");
        System.out.println("========================================");


        int[] lista1 = {1, 3, 5};
        int[] lista2 = {1, 3, 8, 10};

        if (compararArrays(lista1, lista2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son distintos");
        }

        // Guardo el array devuelto por fusionarArrays y después lo imprimo.
        int[] fusionado = fusionarArrays(lista1, lista2);
        imprimirArray(fusionado);
    }


    public static boolean compararArrays(int [] lista1, int [] lista2){
        if (lista1.length != lista2.length){
            return false;
            //Si el tamaño es distinto da false
        }
        for (int i = 0; i < lista1.length; i++) {
            if (lista1[i] != lista2[i]){
                return false;
                //Si los numeros son distintos da false, ya que va comparando
                // numero a numero
            }
        }
        return true;
    }

    public static int[] fusionarArrays(int [] lista1, int [] lista2){

        int[] lista3 = new int[lista1.length + lista2.length];

        //Copia los valores de lista1 dentro de la lista3
        for (int i = 0; i < lista1.length; i++) {
            lista3[i] = lista1[i];
        }

        //Copia los valores de lista2 dentro de la lista3 y pone el + i pq
        // como las primeras posiciones estan ocupadas por la lista1 tiene
        // que separar
        for (int i = 0; i < lista2.length; i++) {
            lista3[lista1.length + i] = lista2[i];
        }


        return lista3;
    }

    public static void imprimirArray(int[] array){
        //Imprimimos array de forma bonita
        for (int i = 0; i < array.length ; i++) {
            System.out.print("+----");
        }
        System.out.println("+");

        for (int i = 0; i < array.length ; i++) {
            System.out.printf("|%3d ",array[i]);
        }
        System.out.println("|");
        for (int i = 0; i < array.length ; i++) {
            System.out.print("+----");
        }
        System.out.println("+");
    }//fin imprimirArray

}
