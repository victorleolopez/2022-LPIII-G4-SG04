public class estudiante extends persona {
    private String especialidad;
    private Procedencia procedencia;

    public estudiante(String especialidad, Procedencia procedencia) {
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }
    public estudiante(String nombres, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombres, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Procedencia getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }
    
}
