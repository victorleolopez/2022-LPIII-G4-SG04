public class Alumno extends Personas {
    private Fecha fechaMatricula;

    //public Alumno() {}

    public Alumno(String nif, String nombre, int edad, Fecha fechaMatricula) {
        super(nif, nombre, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }

    public Fecha getPechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAño(fechaMatricula.getAño());
    }

    @Override
    public String toString() {
        return "Alumno [fechaMatricula=" + fechaMatricula + "]";
    }
    
}
