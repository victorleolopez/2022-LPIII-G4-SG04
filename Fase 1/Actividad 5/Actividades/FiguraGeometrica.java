public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String string) {
    }

    abstract public double area();

    public void figuraGeometrica(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    final public boolean mayorQue(FiguraGeometrica otra) {
        return this.area() > otra.area();
    }

    final public String toString() {
        return this.nombre + " con area " + this.area();
    }
}
