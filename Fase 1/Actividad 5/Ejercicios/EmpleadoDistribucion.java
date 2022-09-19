public class EmpleadoDistribucion extends Asalariados {
    private String zona;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String zona, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getSalarioBase() {
        return super.getSalarioBase() + (super.getSalarioBase() * 10 / 100);
    }

    @Override
    public String toString() {
        return "Empleado de Distribucion\nDni        : " + super.getDni() + "\nNombre     : " + super.getNombre()
                + "\nVacaciones : " + super.getDiasVacaciones() + " dias\tZona : " + zona + "\nSalario    : "
                + this.getSalarioBase() + "\n";
    }
}
