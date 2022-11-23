import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ObjectNoExist {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		int opc;
		Dictionary agenda = new Dictionary();
		do {
			try {
				menu();
				opc = sc.nextInt();
				switch (opc) {
					case 1:
						System.out.println("******* Ingresar datos ******");
						System.out.print("Dni : ");
						int dni = sc.nextInt();
						sc.nextLine();
						System.out.print("Nombre : ");
						String nombre = sc.nextLine();
						System.out.print("Telefono : ");
						int telefono = sc.nextInt();
						sc.nextLine();
						System.out.print("direccion : ");
						String direccion = sc.nextLine();
						Contactos contacto = new Contactos(dni, nombre, telefono, direccion);
						agenda.add(dni, contacto);
						break;
					case 2:
						System.out.print("Dni : ");
						int buscar = sc.nextInt();
						try {

							System.out.println(agenda.getValue(buscar).toString());
						} catch (ObjectNoExist e) {
							System.out.println("\t No existe contacto");
						}
						break;
					case 3:
						System.out.print("Dni : ");
						int eliminar = sc.nextInt();
						if (agenda.delete(eliminar))
							System.out.println("\t Se elimino contacto");
						else
							System.out.println("\t No existe contacto");
						break;
					case 4:
						ArrayList<OrderedPair> list = agenda.getList();
						if (list.size() <= 0) {
							System.out.println("***** Agenda de contactos vacia*******");
						} else {
							System.out.println("***** Lista de agenda de contactos *******");
							for (int i = 0; i < list.size(); i++)
								System.out.println(list.get(i).getValue());
						}
						break;
					case 5:
						salir = true;
						break;
					default:
						System.out.println("Elige una opcion del 1-5");
				}
			} catch (Exception e) {
				System.out.println("****** Error en el sistema ingresastes un dato equivocado ****");
				salir = true;
			}
		} while (!salir);
		sc.close();
	}

	public static void menu() {
		System.out.println("\n*********** Menu ***********");
		System.out.println("1. Añadir nuevo contacto");
		System.out.println("2. Buscar contacto");
		System.out.println("3. Borrar contacto");
		System.out.println("4. Mostrar contactos");
		System.out.println("5. Salir\n");
		System.out.print("Elegir una opcion: ");
	}
}
