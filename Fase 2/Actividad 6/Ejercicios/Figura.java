public abstract class Figura {
    private String nombre;

    public abstract void colorear(); // método abstracto

    // Este constructor no puede ser invocado directamente
    // solo lo usan las clases derivadas
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    // get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
