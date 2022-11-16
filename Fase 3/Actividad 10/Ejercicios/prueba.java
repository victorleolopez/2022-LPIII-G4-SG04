import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, valores;
        Boolean salir = false;
        while (salir == false) {
            menu();
            System.out.println("Eligir el tipo de dato");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuantos valores tendra el arreglo");
                    valores = sc.nextInt();
                    Integer[] intArray = new Integer[valores];
                    for (int i = 0; i < intArray.length; i++) {
                        System.out.println("Inserte valores para la posición [" + i + "] :");
                        Integer dato = sc.nextInt();
                        intArray[i] = dato;
                    }
                    System.out.println("Array de int contiene:");
                    imprimirArray(intArray);
                    comfirmar(intArray);
                    break;
                case 2:
                    System.out.println("Cuantos valores tendra el arreglo");
                    valores = sc.nextInt();
                    Double[] doubleArray = new Double[valores];
                    for (int i = 0; i < doubleArray.length; i++) {
                        System.out.println("Inserte valores para la posición [" + i + "] :");
                        Double dato = sc.nextDouble();
                        doubleArray[i] = dato;
                    }
                    System.out.println("Array de double contiene:");
                    comfirmar(doubleArray);
                    break;
                case 3:
                    System.out.println("Cuantos valores tendra el arreglo");
                    valores = sc.nextInt();
                    Float[] floatArray = new Float[valores];
                    for (int i = 0; i < floatArray.length; i++) {
                        System.out.println("Inserte valores para la posición [" + i + "] :");
                        Float dato = sc.nextFloat();
                        floatArray[i] = dato;
                    }
                    System.out.println("Array de float contiene:");
                    comfirmar(floatArray);
                    break;
                case 4:
                    System.out.println("Cuantos valores tendra el arreglo");
                    valores = sc.nextInt();
                    Character[] charArray = new Character[valores];
                    for (int i = 0; i < charArray.length; i++) {
                        System.out.println("Inserte valores para la posición [" + i + "] :");
                        Character dato = sc.next().charAt(0);
                        charArray[i] = dato;
                    }
                    System.out.println("Array de char contiene:");
                    comfirmar(charArray);
                    break;
                case 5:
                    System.out.println("Cuantos valores tendra el arreglo");
                    valores = sc.nextInt();
                    String[] StringArray = new String[valores];
                    for (int i = 0; i < StringArray.length; i++) {
                        System.out.println("Inserte valores para la posición [" + i + "] :");
                        String dato = sc.next();
                        StringArray[i] = dato;
                    }
                    System.out.println("Array de String contiene:");
                    imprimirArray(StringArray);
                    comfirmar(StringArray);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("¡ No existe opcion !");
                    break;
            }
        }
        ;
        sc.close();
    }

    public static void menu() {
        System.out.println("\n******* MENU *******");
        System.out.println("1 Integer");
        System.out.println("2 Double");
        System.out.println("3 Float");
        System.out.println("4 Character");
        System.out.println("5 String");
        System.out.println("6 Salir\n");
    }

    public static <T> void comfirmar(T[] Tarray) {
        Scanner sc = new Scanner(System.in);
        int salir = 10;
        int opciones, posicion1, posicion2;
        while (salir == 10) {
            System.out.println("\n------- Menu --------");
            System.out.println("1. Cambiar Posicion");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir\n");
            opciones = sc.nextInt();
            switch (opciones) {
                case 1:
                    System.out.println("Ingresar posicion 1");
                    posicion1 = sc.nextInt();
                    System.out.println("Ingresar posicion 2");
                    posicion2 = sc.nextInt();
                    cambio(Tarray, posicion1, posicion2);
                    break;
                case 2:
                    imprimirArray(Tarray);
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
        int num = 0;
        String valores;
        for (T elemento : inputArray) {
            num++;
            valores = (String) elemento;
            System.out.printf("%-8s %s", valores, num % 4 == 0 ? "\n" : "");
        }
        System.out.println();
    }

    public static void imprimirArray(String[] inputArray) {
        int num = 0;
        for (String elemento : inputArray) {
            num++;
            System.out.printf("%-8s %s", elemento, num % 4 == 0 ? "\n" : "");
        }
        System.out.println();
    }

    public static <T> void cambio(T[] inputArray, T posicion1, T posicion2) {
        int num = 0;
        String valores;
        System.out.println("\nSe cambio la poscion " + posicion1 + " con el posicion " + posicion2 + "del arreglo");
        Collections.swap(Arrays.asList(inputArray), (int) posicion1, (int) posicion2);
        for (T elemento : inputArray) {
            num++;
            valores = (String) elemento;
            System.out.printf("%-8s %s", valores, num % 4 == 0 ? "\n" : "");
        }
        System.out.println();
    }
}
