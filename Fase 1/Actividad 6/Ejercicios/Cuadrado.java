public class Cuadrado extends FiguraBidimensional {
    // Atributos
    public double lado;

    // Constructor
    public Cuadrado(String nombre, double lado) {
        super(nombre = "Cuadrado");
        this.lado = lado;
    }

    // Metodo abstracto de la clase abstracta Figura
    @Override
    public void colorear() {
    }

    // Método de la clase FiguraBidimensional
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + calcularArea();
    }

}
