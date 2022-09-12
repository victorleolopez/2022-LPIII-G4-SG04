import java.util.Scanner;

public class Actividades {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);

        // Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];

        // Variables utilizadas
        boolean salir = false;
        int opcion, fila, columna;

        // Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;

        // Menu
        do {

            // Mensajes del menu
            System.out.println("************ Menu **************");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar Columna");
            System.out.println("4. Sumar la Diagonal Principal");
            System.out.println("5. Sumar la Diagonal Inversa");
            System.out.println("6. Media de la Matriz");
            System.out.println("7. Imprimir la Matriz");
            System.out.println("8. Salir");
            System.out.print("Elije una opcion : ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    // Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        // Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println(
                                "La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        // Validamos la fila
                        do {
                            System.out.println("Elige una Columna");
                            columna = sn.nextInt();
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println(
                                "La suma de los valores de la Columna " + columna + " es: "
                                        + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 4:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal Principal es: " + sumaDiagonalPrincipal(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 5:
                    if (rellenado) {
                        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        System.out.println("La Media de la Matrix es: " + Media(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 7:
                    if (rellenado) {
                        Imprimir(matriz);
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
        System.out.println("FIN");
    }

    // Rellena la matriz con valores insertados por el usuario
    public static void Imprimir(int[][] matriz) {
        System.out.println("");
        System.out.println("           Matriz                           ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%5d ", matriz[i][j]);
            }
        }
        System.out.println("");
    }

    // Rellena la matriz con valores insertados por el usuario
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Escribe un numero en la posicion " + i + " " + j + " : ");
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    // Suma los valores de una determinada fila
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
            System.out.print(matriz[fila][j] + "  ");
        }
        return suma;
    }

    // Suma los valores de una determinada Columna
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
            System.out.print(matriz[i][columna] + "  ");
        }
        return suma;
    }

    // Suma los valores de una determinada Diagonal Principal
    public static int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "  ");
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    // Suma los valores de una determinada Diagonal inversa
    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0, ayuda = matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            ayuda = ayuda - 1;
            suma += matriz[i][ayuda];
            System.out.print(matriz[i][ayuda] + "  ");
        }
        return suma;
    }

    // Suma los valores de La media de la matriz
    public static double Media(int[][] matriz) {
        double suma = 0, cantidadDeElementos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
                suma += matriz[i][j];
                cantidadDeElementos++;
            }
        }
        return suma / cantidadDeElementos;
    }

}