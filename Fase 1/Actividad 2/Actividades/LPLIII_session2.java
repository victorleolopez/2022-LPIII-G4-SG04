public class LPLIII_session2 {
    public static void main(String[] args) {
        // ACTIVIDAD 2
        System.out.println("\t **** Crear el objecto Pelusa **** \t");
        Perro Pelusa = new Perro("pequines", "blanco");
        System.out.println(Pelusa.toString());
        Pelusa.setTemp(50);
        Pelusa.setEdad(5);
        Pelusa.peso = 4;
        System.out.println("DIAGNOSTICO: El Perro esta " + Diagnostico.aptoVacunaA(Pelusa));
        System.out.println(Pelusa.toString());
    }
}
