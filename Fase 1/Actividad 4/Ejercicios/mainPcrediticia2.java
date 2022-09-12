import java.util.Scanner;

public class mainPcrediticia2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int bdPersonas[][] = new int[8][3];
        boolean salir = false;
        int opcion = 0;
        boolean rellenado = false;
        System.out.println(" *****************  BIENVENIDOS AL SISTEMA ***************** ");
        // Menu
        do {
            Pcrediticia2.menu();
            // Mensajes del menu
            System.out.print("Elije una opcion : ");
            opcion = SC.nextInt();

            switch (opcion) {
                case 1:
                    Pcrediticia2.rellenarPersonas(SC, bdPersonas);
                    // Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        System.out.println("\t *** Porcentaje de Hombre : " + Pcrediticia2.porHombres(bdPersonas));
                    } else {
                        System.out.println("Debes rellenar la bdPersonas primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        System.out.println("\t *** Porcentaje de Mujer : " + Pcrediticia2.porMujer(bdPersonas));
                    } else {
                        System.out.println("Debes rellenar la bdPersonas primero");
                    }
                    break;
                case 4:
                    if (rellenado) {
                        System.out.println(
                                "\t *** Porcentaje de Hombre que Trabaja : "
                                        + Pcrediticia2.porHombresTrabajan(bdPersonas));
                    } else {
                        System.out.println("Debes rellenar la bdPersonas primero");
                    }
                    break;
                case 5:
                    if (rellenado) {
                        System.out.println(
                                "\t *** Porcentaje de Mujeres que Trabaja :  "
                                        + Pcrediticia2.porMujeresTrabajan(bdPersonas));
                    } else {
                        System.out.println("Debes rellenar la bdPersonas primero");
                    }
                    break;
                case 6:
                    if (rellenado) {
                        System.out
                                .println("\t *** El sueldo promedio de los hombres que trabajan : "
                                        + Pcrediticia2.PsueldoHombres(bdPersonas));
                    } else {
                        System.out.println("Debes rellenar la bdPersonas primero");
                    }
                    break;
                case 7:
                    if (rellenado) {
                        System.out
                                .println("\t *** El sueldo promedio de las Mujeres que trabajan : "
                                        + Pcrediticia2.PsueldoHombres(bdPersonas));
                    } else {
                        System.out.println("Debes rellenar la bdPersonas primero");
                    }
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 8");
            }
        } while (!salir);
        System.out.println(" *****************  SALIDA DEL SISTEMA ***************** ");
        SC.close();

    }

}
