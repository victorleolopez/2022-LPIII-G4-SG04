public class Persona {
    private String nombres;
    private String direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombres, String direccion, String telefono) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean equals(Object obj) {
        Persona comparado = (Persona) obj;
        return this.getNombres().equals(comparado.getNombres());
    }

    @Override
    public String toString() {
        return "Persona(" + nombres + ", " + direccion + ", " + telefono + ")";
    }
}
