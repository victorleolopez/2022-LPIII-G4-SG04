public class EmpleadoProduccion extends Asalariados {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno) {
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Area Produccion\n" + super.toString() + "\nTurno: \t" + this.turno;
    }
}
