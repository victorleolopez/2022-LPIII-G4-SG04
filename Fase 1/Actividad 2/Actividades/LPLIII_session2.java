public class LPLIII_session2 {
    public static void main(String[] args) {
        // ACTIVIDAD 1
        System.out.println("\t **** Crear los objectos Filo y Pelusa **** \t");
        Perro Fido = new Perro("chihuahua", "marron");
        Perro Pelusa = new Perro("pequines", "blanco");
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());
        // INCREMENTAR EDAD
        System.out.println("\t **** Incrementar la Edad con el metodo increEdad 2 y 5 **** \t");
        Fido.increEdad(2);
        Pelusa.increEdad(5);
        System.out.println(Fido.toString());
        System.out.println(Pelusa.toString());
    }
}
