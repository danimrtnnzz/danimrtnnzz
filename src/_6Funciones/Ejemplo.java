package _6Funciones;

    import utilidades.Util;
    public class Ejemplo {
        public static void duplicar(int[] v) {
            for (int i = 0; i < v.length; i++) {
                v[i] = v[i] * 2;   // cambia el array original
            }
        }
        public static void duplicar(int n) {
            n = n * 2;   // solo cambia la copia
        }
        public static void mostrar(int[] v) {
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4};
            Util.imprimirArray(nums);  //opcional mostrar(nums)
            duplicar(nums);   // no devuelve nada...
            Util.imprimirArray(nums);    // 2 4 6 8  ¡ha cambiado!

            System.out.println();
            int valor = 10;
            System.out.println("valor: "+valor);
            duplicar(valor);
            System.out.println("valor: "+valor);
        }
    }
