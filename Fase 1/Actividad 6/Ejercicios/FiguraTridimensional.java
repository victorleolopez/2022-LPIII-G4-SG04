public abstract class FiguraTridimensional  extends Figura{

    public abstract double calcularArea();
    public abstract double calcularVolumen();
    
    // Constructor implicito super
    public FiguraTridimensional(String nombre) {
		super(nombre);		
	}

    @Override
    public String toString() {
        return "Figura Tridimensional";
    }
}
