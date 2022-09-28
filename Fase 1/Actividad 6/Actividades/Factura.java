public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioporArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cuenta, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidad(cuenta);
        setPrecioporArticulo(precio);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioporArticulo() {
        return precioporArticulo;
    }

    public void setPrecioporArticulo(double precioporArticulo) {
        this.precioporArticulo = precioporArticulo;
    }

    @Override
    public double getMontoPago() {
        return getCantidad() * getPrecioporArticulo();
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)\nCantidad: %s\nPrecio por Articulo: $%,.2f", "Factura:\nNumero de Pieza:",
                numeroPieza, descripcionPieza, cantidad, precioporArticulo);
    }
}