public class Personas {
    private String nif;
    private String nombre;
    private int edad;
    public Personas(String nif, String nombre, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Personas [nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
