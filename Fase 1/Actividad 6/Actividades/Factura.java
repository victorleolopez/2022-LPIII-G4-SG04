public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioporArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cuenta, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);
    }

    private void establecerPrecioPorArticulo(double precio) {
    }

    private void establecerCantidad(int cuenta) {
    }
    @Override
    public double obtenerMontoPago(){
        return obtenerCantidad()*obtenerPrecioPorArticulo();
    }
}