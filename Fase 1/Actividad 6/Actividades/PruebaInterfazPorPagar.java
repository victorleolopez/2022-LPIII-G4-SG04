public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetoPorPagar = new PorPagar[6];
        objetoPorPagar[0] = new Factura("01234", "asieno", 2, 375.00);
        objetoPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetoPorPagar[2] = new EmpleadoAsalariado("Johan", "Mamani", "111-11-1111", 800.00);
        objetoPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetoPorPagar[4] = new Prestamo(5,500);
        objetoPorPagar[5] = new Prestamo(3,600);
        System.out.println("\nFacturas y Empleado procesados en forma polimorfica:\n");
        for (PorPagar porPagarActual : objetoPorPagar) {
            System.out.printf("%s\n%s: $%,.2f\n\n", porPagarActual.toString(), "pago vencido",
                    porPagarActual.getMontoPago());
        }
    }
}