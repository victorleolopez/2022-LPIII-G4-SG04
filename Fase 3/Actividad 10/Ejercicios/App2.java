import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int salir = 10;
        int opciones, posicion1, posicion2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos valores tendra el array String");
        int valores = sc.nextInt();
        String[] stringArray = new String[valores];
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Inserte valores para la posición [" + i + "] :");
            String dato = sc.next();
            stringArray[i] = dato;
        }

        while (salir == 10) {
            System.out.println("\n------- Menu --------");
            System.out.println("1. Cambiar Posicion");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir\n");
            System.out.print("Opcion : ");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    System.out.println("Ingresar posicion 1");
                    posicion1 = sc.nextInt();
                    System.out.println("Ingresar posicion 2");
                    posicion2 = sc.nextInt();
                    cambio(stringArray, posicion1, posicion2);
                    break;
                case 2:
                    imprimirArray(stringArray);
                    break;
                case 3:
                    salir = 11;
                    break;
                default:
                    System.out.println("¡ No existe opcion !");
                    break;
            }

        }
        sc.close();
    }

    public static <T> void imprimirArray(T[] inputArray) {
        System.out.println("\n *** IMPRIMIR LISTA *** ");
        int num = 0;
        for (T elemento : inputArray) {
            num++;
            System.out.printf("%-8s %s", elemento, num % 4 == 0 ? "\n" : "");
        }
        System.out.println();
    }

    public static <T> void cambio(T[] inputArray, T posicion1, T posicion2) {
        int num = 0;
        int largo = inputArray.length - 1;
        try {
            validarLimites(largo, (int) posicion1, (int) posicion2);
            System.out.println("Se cambio la poscion " + posicion1 + " con el posicion " + posicion2 + "del arreglo");
            Collections.swap(Arrays.asList(inputArray), (int) posicion1, (int) posicion2);
            for (T elemento : inputArray) {
                num++;
                System.out.printf("%-8s %s", elemento, num % 4 == 0 ? "\n" : "");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

    public static void validarLimites(int largo, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {

        if (limiteInferior < 0 || limiteInferior > largo || limiteSuperior < 0 || limiteSuperior > largo
                ) {
            throw new LimiteInvalidoException("Error :Limites invalidos");
        }
    }

}