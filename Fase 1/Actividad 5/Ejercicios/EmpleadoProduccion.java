public class EmpleadoProduccion extends Asalariados {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno, double salirioBase) {
        super(nombre, dni, diasVacaciones, salirioBase);
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase() {
        return super.getSalarioBase() + (super.getSalarioBase() * 15 / 100);
    }

    @Override
    public String toString() {
        return "Empleado de Produccion\nDni        : " + super.getDni() + "\nNombre     : " + super.getNombre()
                + "\nVacaciones : " + super.getDiasVacaciones() + " dias\tTurno : " + turno + "\nSalario    : "
                + this.getSalarioBase() + "\n";
    }
}
