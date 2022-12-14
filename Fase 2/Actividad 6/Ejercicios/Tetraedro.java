public class Tetraedro extends FiguraTridimensional {
    // Atributos
    public double arista;

    // Constructor
    public Tetraedro( double arista) {
        super( "Tetraedro");
        this.arista = arista;
    }

    // Metodo abstracto de la clase abstracta Figura
    @Override
    public void colorear() {
    }

    // Método de la clase FiguraTridimensional
    @Override
    public double calcularArea() {
        return (Math.sqrt(3) * (arista * arista));
    }

    @Override
    public double calcularVolumen() {
        return (Math.pow(arista, 3)) / (6 * Math.sqrt(2));
    }

    // Método toString
    @Override
    public String toString() {
        return "Area: " + calcularArea() + "\nVolumen: " + calcularVolumen();
    }
}
