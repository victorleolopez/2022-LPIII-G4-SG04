public class Compañias {
    private final int cantProductos = 5;
    private final int cantVendedores = 4;

    private int[][] baseDatos = new int[cantProductos][cantVendedores];
    private int ventas[][] = new int[cantProductos][2];
    private final int[] preciosProductos = { 10, 20, 30, 40, 50 };

    public void IngresarDatos() {
        baseDatos[0][0] = 5;
        baseDatos[0][1] = 6;
        baseDatos[0][2] = 7;
        baseDatos[0][3] = 8;

        baseDatos[1][0] = 1;
        baseDatos[1][1] = 0;
        baseDatos[1][2] = 9;
        baseDatos[1][3] = 1;

        baseDatos[2][0] = 2;
        baseDatos[2][1] = 2;
        baseDatos[2][2] = 0;
        baseDatos[2][3] = 0;

        baseDatos[3][0] = 1;
        baseDatos[3][1] = 3;
        baseDatos[3][2] = 2;
        baseDatos[3][3] = 0;

        baseDatos[4][0] = 0;
        baseDatos[4][1] = 0;
        baseDatos[4][2] = 0;
        baseDatos[4][3] = 0;
    }

    public void CalcularVenta() {
        // int sumaVendedor = 0;
        for (int j = 0; j < cantProductos; ++j) {
            for (int i = 0; i < cantVendedores; ++i) {
                if (baseDatos[i][j] > 0) {
                    ventas[i][0] += baseDatos[i][j] * preciosProductos[i];
                }
            }
        }

        for (int columna = 0; columna < cantVendedores; columna++) {
            for (int fila = 0; fila < cantProductos; fila++) {
                if (baseDatos[fila][columna] > 0) {
                    ventas[columna][1] += baseDatos[fila][columna] * preciosProductos[fila];
                }
            }
        }

    }

    public void mostrarTotal() {
        System.out.printf("%25s\n", "VENDEDORES");
        System.out.printf("%10s%10s%10s%10s%23s", "1", "2", "3", "4", "**** Total de Productos **** \n\n");

        for (int i = 0; i < cantProductos; i++) {
            System.out.printf("%d", (i + 1));
            for (int j = 0; j < cantVendedores; j++) {
                System.out.printf("%10d", baseDatos[i][j]);
                if (j == 3) {
                    System.out.printf("%15d", baseDatos[i][j]);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < cantVendedores; i++) {
            System.out.printf("%10d", baseDatos[i][1]);
        }
    }
}
