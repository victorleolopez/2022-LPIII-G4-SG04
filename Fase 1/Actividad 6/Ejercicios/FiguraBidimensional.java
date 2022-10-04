public abstract class FiguraBidimensional extends Figura {
    
    public abstract double calcularArea();//método abstracto

    // Constructor implicito super
    public FiguraBidimensional(String nombre) {
        super("Figura Bidimensional");
    }
}
