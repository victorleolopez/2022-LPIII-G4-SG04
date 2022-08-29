import java.util.Scanner;

public class LPLIII_session2 {
    public static void main(String[] args) {
        // ACTIVIDAD 3
        System.out.println("\t **** Crear el objecto Pelusa **** \t");
        Perro Pelusa = new Perro("pequines", "blanco");
        System.out.println(Pelusa.toString());
        double peso, temperatura;
        int edad;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el nuevo peso para el perro : ");
            peso = sc.nextDouble();
            Pelusa.peso = peso;
            System.out.println("Ingrese la nueva edad para el perro : ");
            edad = sc.nextInt();
            Pelusa.setEdad(edad);
            System.out.println("Ingrese la nueva temperatura para el perro : ");
            temperatura = sc.nextDouble();
            Pelusa.setTemp(temperatura);
        }
        System.out.println("DIAGNOSTICO: El Perro esta " + Diagnostico.aptoVacunaB(Pelusa));
        System.out.println(Pelusa.toString());
    }
}
