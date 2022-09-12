import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainContacto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int telefono;
        String nombre;
        String direccion;
        Contacto contacto;
        int tamañoAgenda;

        tamañoAgenda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de contactos para su agenda : "));
        Agenda agendaTelefonica = new Agenda(tamañoAgenda);
        do {
            System.out.println("\n\t*******BIENVENIDO*******");
            System.out.println("1 . Añadir contacto");
            System.out.println("2 . Buscar contacto");
            System.out.println("3 . Modificar contacto");
            System.out.println("4 . Borrar contacto");
            System.out.println("5 . Eliminar un contacto");
            System.out.println("6 . Mostrar contactos");
            System.out.println("7 . Salir");
            System.out.print("Digite una opcion por favor : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                // Añadimos un contacto
                case 1:
                    System.out.print("\nDigite su nombre : ");
                    nombre = teclado.next();

                    System.out.print("Digite su telefono : ");
                    telefono = teclado.nextInt();

                    System.out.print("Digite su direccion : ");
                    direccion = teclado.next();

                    contacto = new Contacto(nombre, telefono, direccion);
                    agendaTelefonica.añadirContacto(contacto);
                    System.out.println("");
                    break;

                // Buscamos un contacto
                case 2:
                    System.out.print("\nDigite un nombre : ");
                    nombre = teclado.next();

                    agendaTelefonica.buscarContacto(nombre);
                    System.out.println("");
                    break;

                // Modificar contacto
                case 3:
                    System.out.print("\nDigite su nombre : ");
                    nombre = teclado.next();

                    System.out.print("Digite su telefono : ");
                    telefono = teclado.nextInt();

                    System.out.print("Digite su direccion : ");
                    direccion = teclado.next();

                    contacto = new Contacto(nombre, telefono, direccion);
                    agendaTelefonica.modificarContacto(contacto);
                    System.out.println("");
                    break;

                // Borramos un contacto
                case 4:
                    System.out.print("\nDigite su nombre : ");
                    nombre = teclado.next();

                    contacto = new Contacto(nombre);
                    agendaTelefonica.eliminarContacto(contacto);
                    System.out.println("");
                    break;

                // Eliminamos un contacto
                case 5:
                    System.out.print("\nDigite su nombre : ");
                    nombre = teclado.next();

                    contacto = new Contacto(nombre);
                    agendaTelefonica.eliminarContacto(contacto);
                    System.out.println("");
                    break;

                // Mostrar contactos
                case 6:
                    System.out.println("");
                    agendaTelefonica.listarContactos();
                    System.out.println("");
                    break;

                // Salir
                case 7:
                    System.out.println("\nGracias por participar !!!");
                    opcion = 8;
                    break;

                default:
                    System.out.println("\nOpcion no valida , porfavor vuelva a digitar");
                    System.out.println("");
                    break;

            }
        } while (opcion != 8);

        teclado.close();
    }
}
