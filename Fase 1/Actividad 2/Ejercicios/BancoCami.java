import java.util.Scanner;

public class BancoCami {
    public static void main(String[] args) {
        double inicial;
        String nombre;
        int opc;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre : ");
            nombre = sc.nextLine();
            Menu();
            opc = sc.nextInt();
            if (opc == 1) {
                System.out.println("Ingresa Cantidad inicial : ");
                inicial = sc.nextDouble();
                CuentaBanco Persona = new CuentaBanco(nombre, inicial);
                System.out.println(Persona.toString());
            } else {
                System.out.println("Ingresa aqrfwefwe inicial : ");
                CuentaBanco Persona = new CuentaBanco(nombre);
                System.out.println(Persona.toString());
            }

        }
    }

    public static void Menu() {
        System.out.println("\t **** Menu ***\t");
        System.out.println("1. Ingresar Couta Inicial de Dinero");
        System.out.println("2. No Ingresar Couta Inicial de Dinero");
    }
}
//