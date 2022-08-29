public class CuentaBanco {
    private String titular;
    private double cantidad;

    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "CuentaBanco " + "Titular=" + titular + ", Cantidad=" + cantidad;
    }

    public void Ingresar(Double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        } else
            System.out.println(" No puedes Ingresa un numero negativo ");
    }

    public void Retirar(Double cantidad) {
        double fondo = 0;
        if (cantidad > 0)
            fondo = this.cantidad - cantidad;
        else
            fondo = this.cantidad;
        if (fondo < 0) {
            System.out.println(" Solo retirastes " + this.cantidad);
            this.cantidad = 0;
        } else
            this.cantidad = fondo;
    }

}
