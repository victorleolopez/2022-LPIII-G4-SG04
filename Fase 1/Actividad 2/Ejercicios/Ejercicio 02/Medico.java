
import java.util.InputMismatchException;
import java.util.Scanner;

public class Medico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, sexo;
        int dia, mes, anio, opciones = 0;
        double altura, peso;
        PerfilMedico paciente = new PerfilMedico("Johan", "Lopez", "M", 21, 12, 2000, 1.70, 75);
        do {
            try {
                Menu();
                System.out.println("Ingresar Opcion :");
                opciones = sc.nextInt();
                while (opciones > 3 || opciones <= 0) {
                    System.out.println("Ingresar Opcion (1-3):");
                    opciones = sc.nextInt();
                }
                switch (opciones) {
                    case 1:
                        System.out.println("Ingrese nombre: ");
                        nombre = sc.next();
                        System.out.println("Ingrese apellido: ");
                        apellido = sc.next();
                        System.out.println("Ingrese sexo (M/F): ");
                        sexo = sc.next();
                        System.out.println("Ingrese dia: ");
                        dia = sc.nextInt();
                        while (dia > 31 || dia < 1) {
                            System.out.println("Ingrese dia (1-31): ");
                            dia = sc.nextInt();
                        }
                        System.out.println("Ingrese mes: ");
                        mes = sc.nextInt();
                        while (mes > 12 || mes < 1) {
                            System.out.println("Ingrese dia (1-12): ");
                            mes = sc.nextInt();
                        }
                        System.out.println("Ingrese año: ");
                        anio = sc.nextInt();
                        int cifras = 0;
                        int a = anio;
                        while (a > 0) {
                            a = a / 10;
                            cifras++;
                        }
                        while (cifras != 4 && (anio < 1900 || anio > 3500)) {
                            System.out.println("Ingrese año (****): ");
                            anio = sc.nextInt();
                        }
                        System.out.println("Ingrese altura (m): ");
                        altura = sc.nextDouble();
                        System.out.println("Ingrese peso (Kg):");
                        peso = sc.nextDouble();
                        paciente.setnombre(nombre);
                        paciente.setapellido(apellido);
                        paciente.setsexo(sexo);
                        paciente.setdia(dia);
                        paciente.setmes(mes);
                        paciente.setanio(anio);
                        paciente.setaltura(altura);
                        paciente.setpeso(peso);

                        break;
                    case 2:
                        System.out.println(paciente.toString());
                        break;

                    case 3:
                        System.out.println(" \t ********* VISITANOS MUY PRONTO ********* \t");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: No se pudo completar la operacion");
                sc.next();
            }
        } while (opciones != 3);

        sc.close();
    }

    public static void Menu() {
        System.out.println("***********************************************************");
        System.out.println("\t  \t \t**** Menu ***\t");
        System.out.println("1. Ingresar Paciente");
        System.out.println("2. Mostrar Paciente");
        System.out.println("3. Salir");
        System.out.println("***********************************************************");
    }
}
