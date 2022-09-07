
public class Arreglodimecional {
    public static void main(String[] args) {
        int[] arreglo0 = { 10, 20, 50, 40, 30, 80 };
        System.out.println("El arreglo unidimensional es: ");
        for (int valor : arreglo0) {
            System.out.printf(" %d", valor);
        }
        System.out.println();
        int[][] arreglo1 = { { 10, 20, 50 }, { 40, 20, 10 }, { 0, 30, 10 } };
        int[][] arreglo2 = { { 70 }, { 80, 90 }, { 0, 10, 20 } };
        System.out.println("Los arreglos bidimencionales del grupo1 son: ");
        imprimirArreglo(arreglo1);
        System.out.println("Los arreglos bidimensionales del grupo2 son: ");
        imprimirArreglo(arreglo2);
    }

    public static void imprimirArreglo(int[][] arreglo) {
        for (int[] arreglo1 : arreglo) {
            for (int columna = 0; columna < arreglo1.length; columna++) {
                System.out.printf(" %d", arreglo1[columna]);
            }
            System.out.println();
        }
    }
}
