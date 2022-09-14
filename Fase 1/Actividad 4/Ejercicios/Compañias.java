public class Compañias {
    private final int cantProductos = 5;
    private final int cantVendedores = 4;

    private int[][] baseDatos = new int[cantProductos][cantVendedores];
    private int ventas[][] = new int[cantProductos][2];
    private final int[] preciosProductos = { 1, 1, 1, 1, 1 };

    public void IngresarDatos() {
        baseDatos[0][0] = 500;
        baseDatos[0][1] = 500;
        baseDatos[0][2] = 600;
        baseDatos[0][3] = 800;

        baseDatos[1][0] = 500;
        baseDatos[1][1] = 600;
        baseDatos[1][2] = 700;
        baseDatos[1][3] = 100;

        baseDatos[2][0] = 200;
        baseDatos[2][1] = 200;
        baseDatos[2][2] = 0;
        baseDatos[2][3] = 0;

        baseDatos[3][0] = 180;
        baseDatos[3][1] = 350;
        baseDatos[3][2] = 250;
        baseDatos[3][3] = 0;

        baseDatos[4][0] = 500;
        baseDatos[4][1] = 600;
        baseDatos[4][2] = 100;
        baseDatos[4][3] = 200;
    }

    public void CalcularVenta() {
        // int sumaVendedor = 0;
        for (int j = 0; j < cantProductos; ++j) {
            for (int i = 0; i < cantVendedores; ++i) {
                if (baseDatos[j][i] > 0) {
                    ventas[j][0] += baseDatos[j][i] * preciosProductos[j];
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
        System.out.printf("%65s\n", "\\\\\\ TODOS LOS VENDEDORES /////");
        System.out.println();
        System.out.printf("%21s%20s%20s%20s%25s", "VENDEDOR 1", "VENDEDOR 2", "VENDEDOR 3", "VENDEDOR 4",
                "TOTAL VENDIDO \n\n");

        for (int i = 0; i < cantProductos; i++) {
            System.out.printf("%d", (i + 1));
            for (int j = 0; j < cantVendedores; j++) {
                System.out.printf("%20d", baseDatos[i][j]);
                if (j == 3) {
                    System.out.printf("%25d", ventas[i][0]);
                }
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < cantVendedores; i++) {
            System.out.printf("%20d", ventas[i][1]);
        }
    }
}
