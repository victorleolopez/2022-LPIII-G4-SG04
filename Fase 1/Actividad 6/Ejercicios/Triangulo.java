public class Triangulo extends FiguraBidimensional {
    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Triangulo( double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    // Metodo abstracto de la clase abstracta Figura
    @Override
    public void colorear() {
    }

    // Metodo de la clase FiguraBidimensional
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método toString
    @Override
    public String toString() {
        return "Area: " + calcularArea();
    }

}
