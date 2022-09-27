public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetoPorPagar = new PorPagar[4];
        objetoPorPagar[0] = new Factura("01234", "asieno", 2, 375.00);
        objetoPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetoPorPagar[2] = new EmpleadoAsalariado("Johan", "Mamani", "111-11-1111", 800.00);
        objetoPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        System.out.println("Facturas y Empleado procesados en forma polimorfica\n");
        for (PorPagar porPagarActual : objetoPorPagar) {
            System.out.println("%s\n%s: $%,.2f\n\n", porPagarActual.toString().obtenerMontoPago());

        }

    }
}