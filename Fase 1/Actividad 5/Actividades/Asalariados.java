public class Asalariados {
    private String nombre;
    private long dni;
    private int diasVacaciones;

    public Asalariados(String nombre, long dni, int diasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getDiasVacaciones() {
        return this.diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    @Override
    public String toString() {
        return "Asalariados:\nNombre: " + nombre + "\nDni: " + dni + "\nDiasVacaciones: " + diasVacaciones;
    }
}
