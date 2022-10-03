public abstract class FiguraBidimensional extends Figura {
    
    public abstract double calcularArea();//método abstracto

    // Constructor implicito super
    public FiguraBidimensional(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Figura Bidimensional";
    }
}
