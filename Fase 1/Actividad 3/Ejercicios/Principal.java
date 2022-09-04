import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ComponenteX, ComponenteY;
        System.out.println("Introducir Componente del X: ");
        ComponenteX = entrada.nextInt();
        System.out.println("Introducir Componente del Y: ");
        ComponenteY = entrada.nextInt();
        System.out.println("Área: " + Manejador.area(ComponenteX, ComponenteY));
        System.out.println("Perimetro: " + Manejador.perimetro(ComponenteX, ComponenteY));
        Manejador.moverX(20, ComponenteX, ComponenteY);
        System.out.println("Área 2 : " + Manejador.area(ComponenteX, ComponenteY));
        Manejador.moverY(10, ComponenteX, ComponenteY);
        entrada.close();
    }

}
