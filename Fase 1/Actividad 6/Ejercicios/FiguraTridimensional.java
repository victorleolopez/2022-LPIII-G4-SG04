public abstract class FiguraTridimensional  extends Figura{

    public abstract double calcularArea();
    public abstract double calcularVolumen();
    
    // Constructor implicito super
    public FiguraTridimensional(String nombre) {
		super("Figura Tridimensional");		
	}
}
