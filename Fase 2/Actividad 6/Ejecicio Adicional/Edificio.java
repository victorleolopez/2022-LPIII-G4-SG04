public class Edificio {
    private String Nombre;
    private int piso;

    public Edificio(String Nombre,int piso ) {
        this.Nombre = Nombre;
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
