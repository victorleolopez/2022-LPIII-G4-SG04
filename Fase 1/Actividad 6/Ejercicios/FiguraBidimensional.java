import java.util.Scanner;

public abstract class FiguraBidimensional extends Figura {
    int ladoA;
    int ladoB;
    int area;

    public void ingreseDatos(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Lado A?: ");
        ladoA =lectura.nextInt();
        System.out.println("Lado B?: ");
        ladoB =lectura.nextInt();
    }   
    public void mostrarArea(){
        System.out.println("El area es : " + area);
    }
    public abstract void obtenerArea();

}


