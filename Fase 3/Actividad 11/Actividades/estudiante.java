public class Estudiante extends Persona {
    private String especialidad;
    private Procedencia procedencias;

    public Estudiante(String especialidad, Procedencia procedencias) {
        this.especialidad = especialidad;
        this.procedencias = procedencias;
    }

    public Estudiante(String nombres, String direccion, String telefono, String especialidad,
            Procedencia procedencias) {
        super(nombres, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencias = procedencias;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Procedencia getProcedencia() {
        return procedencias;
    }

    public void setProcedencia(Procedencia procedencias) {
        this.procedencias = procedencias;
    }

    public boolean equals(Object obj) {
        Estudiante comparado = (Estudiante) obj;
        return this.getNombres() == comparado.getNombres() && this.getProcedencia().equals(comparado.getProcedencia());
    }

}
