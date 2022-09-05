import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ComponenteX, ComponenteY, opciones = 0, mover;
        Rectangulo Rectangle = new Rectangulo(new Coordenada(3, 0), new Coordenada(0, 7));
        System.out.println(
                " \t ************************************** BIENVENIDOS ************************************** \t\n\n");
        do {
            try {
                menu();
                System.out.println("Ingresar Opcion :");
                opciones = sc.nextInt();
                while (opciones > 5 || opciones <= 0) {
                    System.out.println("Ingresar Opcion (1-3):");
                    opciones = sc.nextInt();
                }
                switch (opciones) {
                    case 1:
                        System.out.println("Ingresar Componente del X : ");
                        ComponenteX = sc.nextInt();
                        System.out.println("Ingresar Componente del Y : ");
                        ComponenteY = sc.nextInt();
                        Rectangle = new Rectangulo(ComponenteX, ComponenteY);
                        System.out.println(Rectangle.toString());
                        break;
                    case 2:
                        System.out.println("\t Área del Rectangulo es : " + Manejador.area(Rectangle));
                        System.out.println("\t Perimetro del Rectangulo es : " + Manejador.perimetro(Rectangle));
                        break;
                    case 3:
                        System.out.println("Ingresar Mover en el Eje X : ");
                        mover = sc.nextInt();
                        Manejador.moverX(mover, Rectangle);

                        break;
                    case 4:
                        System.out.println("Ingresar Mover en el Eje Y: ");
                        mover = sc.nextInt();
                        Manejador.moverY(mover, Rectangle);
                        break;
                    case 5:
                        System.out.println(
                                "\n\n \t *************************** VISITANOS MUY PRONTO *************************** \t");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: No se pudo completar la operacion");
                sc.next();
            }
        } while (opciones != 5);

        sc.close();
    }

    public static void menu() {
        System.out.println("************************************** MENU **************************************");
        System.out.println("\t1.Crear Rectangulo. \t");
        System.out.println("\t2.Hallar el Area y Perimetro\t");
        System.out.println("\t3.Ingresar Moverse en X \t");
        System.out.println("\t4.Ingresar Moverse en Y \t");
        System.out.println("\t5.Salir \t");
        System.out.println("***********************************************************************************");
    }

}
