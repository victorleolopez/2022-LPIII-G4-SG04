public class PruebaHerenciaFigura {
    public static void main(String[] args) {
        int countBi=0;
        int countTri=0;
        Figura[] objetosFiguras = new Figura[7];
        objetosFiguras[0] = new Circulo("Circulo", 60);
        objetosFiguras[1] = new Cuadrado("Cuadrado", 50);
        objetosFiguras[2] = new Triangulo("Triangulo", 20,10);
        objetosFiguras[3] = new Esfera("Esfera", 25);
        objetosFiguras[4] = new Cubo("Cubo", 15);
        objetosFiguras[5] = new Tetraedro("Tetraedro", 15);
        objetosFiguras[6] = new Cuadrado("Cuadrado",12);

        System.out.println("Figuras Geometricas procesadas de forma Polimorfica:");
        for(Figura FigurasActuales : objetosFiguras)
        {
            System.out.printf("\n%s (%s)\n%s\n","Figura  ", FigurasActuales.getNombre(),FigurasActuales.toString());
            if(FigurasActuales instanceof FiguraBidimensional){
                countBi++;
            }
            if(FigurasActuales instanceof FiguraTridimensional){
                countTri++;
            }
        }
        System.out.println("\nEn el arreglo de Figuras Geometricas hay: "+ countBi +" Figuras Geometricas Bidimensionales");
        System.out.println("En el arreglo de Figuras Geometricas hay: "+ countTri +" Figuras Geometricas Tridimensionales\n");

    }

}
