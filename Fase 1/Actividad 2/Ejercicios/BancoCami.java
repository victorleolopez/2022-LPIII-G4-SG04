import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoCami {
    public static void main(String[] args) {
        double inicial = 0, ingresar, retirar;
        ;
        String nombre, opc;
        int opciones = 5;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre : ");
            nombre = sc.nextLine();
            System.out.println(" **** Deseas Ingresar Cantidad inial a la Cuenta " + nombre + " (S/N)");
            opc = sc.nextLine();
            if (opc.equals("S") || opc.equals("s")) {
                System.out.println("Ingresa Cantidad inicial : ");
                inicial = sc.nextDouble();
            }
            CuentaBanco Persona = new CuentaBanco(nombre, inicial);
            System.out.println(Persona.toString());
            do {
                try {
                    Menu();
                    System.out.println("Ingresar Opcion :");
                    opciones = sc.nextInt();
                    while (opciones > 4 || opciones <= 0) {
                        System.out.println("Ingresar Opcion (1-4):");
                        opciones = sc.nextInt();
                    }
                    switch (opciones) {
                        case 1:
                            System.out.println("Ingrese la cantidad a depositar: ");
                            ingresar = sc.nextDouble();
                            Persona.Ingresar(ingresar);
                            System.out.println("La cantidad ingresa a la Cuenta " + nombre + " es S/ " + ingresar);
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad a retirar: ");
                            retirar = sc.nextDouble();
                            Persona.Retirar(retirar);
                            System.out.println("La cantidad retirada a la Cuenta " + nombre + " es S/ " + retirar);
                            break;
                        case 3:
                            System.out.println("---- Saldo actual en la Cuenta " + nombre + " es S/ "
                                    + Persona.getCantidad() + " ----");
                            break;
                        case 4:
                            System.out.println(" \t ********* VISITANOS MUY PRONTO ********* \t");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: No se pudo completar la operacion");
                    sc.next();
                }

            } while (opciones != 4);
        }
    }

    public static void Menu() {
        System.out.println("***********************************************************");
        System.out.println("\t  \t \t**** Menu ***\t");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Mostrar saldo actual");
        System.out.println("4. Salir");
        System.out.println("***********************************************************");
    }
}
