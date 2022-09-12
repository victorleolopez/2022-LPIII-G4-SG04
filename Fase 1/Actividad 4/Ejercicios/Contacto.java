public class Contacto {

    // Creamos los atributos del contacto
    private String nombre;
    private int telefono;
    private String direccion;

    public Contacto(String nombre, int telefono, String dirrecion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = dirrecion;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
        this.direccion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean equals(Contacto contacto) {
        if (nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nNombre : " + nombre + "\nTelefono : " + telefono + "\nDireccion : " + direccion + "\n";
    }
}
