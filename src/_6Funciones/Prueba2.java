package _6Funciones;

public class Prueba2 {

    //LAS FUNCIONES SE SACAN FUERA DEL MAIN

    public static double area(double base, double altura){
        return base*altura;
    }

    public static double calcularIMC(double peso, double altura){
        double imc;
        imc = peso/(altura*altura);
        return imc;
    }

    public static void main(String[] args) {
        System.out.println("Área: "+area(5,6));

        System.out.println("IMC: "+calcularIMC(66, 1.72));

    }
}
