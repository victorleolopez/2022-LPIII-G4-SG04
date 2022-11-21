public class goodies {
    private int id;
    private String description;
    private float precio;
    public goodies() {
    }
    public goodies(int id, String description, float precio) {
        this.id = id;
        this.description = description;
        this.precio = precio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
