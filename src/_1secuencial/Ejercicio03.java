package _1secuencial;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Ejercicio03");
        System.out.println("=======================");

        Scanner teclado = new Scanner(System.in);
        double precio_compra;
        double precio_final;

        System.out.print("¿Cual es el precio de la compra?:");
        precio_compra = Double.parseDouble(teclado.nextLine());
        System.out.print("Dime de cuánto seria el descuento:");
        double descuento =Double.parseDouble(teclado.nextLine());
        double resultado_descuento = (precio_compra * descuento)/100;
        precio_final = precio_compra - resultado_descuento;
        System.out.println("Tu artículo se te queda en "+precio_final+"€, " +
                "tras un descuento del "+descuento+"%");
        System.out.printf("Tu artículo menos el %.2f porciento, se te queda " +
                        "en %.2f€", descuento,precio_final);







    }
}
