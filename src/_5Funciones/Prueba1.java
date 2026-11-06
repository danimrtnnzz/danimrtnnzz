package _5Funciones;

public class Prueba1 {
    public static void main(String[] args) {

        //LAS FUNCIONES SE SACAN FUERA DEL MAIN

        System.out.println("Hola como estais");


            System.out.println(sumar(5, 3));
            System.out.println(sumar(10, 7));
            System.out.println(sumar(20, 15));

        }

        //Creo las sumas con "sumar", a= primer valor, b= segundo valor. El
        // return me da el resultado de sumar los numeros
        static int sumar(int a, int b) {
            return a + b;
        }

        //Imprimo un mensaje, pero no devuelve ningun valor
        static void saludar(){
            System.out.println("Hola buenos dias");
        }

}

