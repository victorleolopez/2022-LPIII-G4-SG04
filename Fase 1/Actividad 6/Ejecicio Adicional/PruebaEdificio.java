import java.util.Scanner;

public class PruebaEdificio {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, numpiso = -1, numpersonas = 0,piso=0;
        String nombreEdificio;
        System.out.println("************ Bienvenido al Sistema **************");
        System.out.print("Nombre del Edificio: ");
        nombreEdificio = sn.nextLine();
        while (numpiso < 2) {
            System.out.print("Ingresar numero de pisos: ");
            numpiso = sn.nextInt();
        }
        Elevador building = new Elevador(nombreEdificio, numpiso, 1);

        // Menu
        do {
            // Mensajes del menu
            System.out.println("\n************ Menu **************");
            System.out.println("1. Datos del Edificio");
            System.out.println("2. Subir Persona");
            System.out.println("3. Bajar Persona");
            System.out.println("4. Salir");
            System.out.print("Elije una opcion : ");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("******* Datos del Eficio *******");
                    System.out.println("Nombre      : " + building.getNombre());
                    System.out.println("Numero Piso : " + building.getPiso());
                    System.out.println("Piso Actual : " + building.getPisoActual());
                    System.out.println("Personas Acensor : " + building.getpersonas());
                    break;
                case 2:
                    do {
                        System.out.print("Ingresar Cantidad de Personas : ");
                        numpersonas = sn.nextInt();
                    }while (numpersonas < 0);
                    building.Espacios(numpersonas, 1);
                    do {
                        System.out.print("Piso se dirige  ( 1 - "+ building.getPiso()+" ) : ");
                        piso = sn.nextInt();
                    }while (piso < 0 || building.getPiso()<piso);
                    building.Paseo(piso);
                    break;
                case 3:
                    do {
                        System.out.print("Ingresar Cantidad de Personas a bajar : ");
                        numpersonas = sn.nextInt();
                    }while (numpersonas < 0 ||  building.getpersonas() < numpersonas );
                    building.Espacios(numpersonas, 2);
                    do {
                        System.out.print("Piso se dirige  ( 1 - "+ building.getPiso()+" ) : ");
                        piso = sn.nextInt();
                    }while (piso < 0 || building.getPiso()<piso);
                    building.Paseo(piso);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
        sn.close();
        System.out.println("FIN");
    }

}
