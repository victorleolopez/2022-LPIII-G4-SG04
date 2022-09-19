public class TestComposicion {
    public static void main(String[] args) {

        // Persona P1 = new Persona(1001, "Victor", "Lopez", 'C');
        // Persona P2 = new Persona(102, "Johan", "Mamani", 'C');
        // Persona P3 = new Persona(1001, "Victor", "Lopez", 'B');
        // Persona P4 = new Persona(1001, "Victor", "Lopez", 'C');
        // Persona P5 = new Persona(1001, "Victor", "Lopez", 'E');
        // Persona P6 = new Persona(1001, "Victor", "Lopez", 'C');
        // Persona P7 = new Persona(1001, "Victor", "Lopez", 'E');
        // Persona P8 = new Persona(1001, "Victor", "Lopez", 'B');
        Persona P9 = new Persona(1001, "Victor", "Lopez", 'B');
        P9.getCuenta().setSaldo(2500);

        // System.out.println(P1.toString());
        // System.out.println(P2.toString());
        // System.out.println(P3.toString());
        // System.out.println(P4.toString());
        // System.out.println(P5.toString());
        // System.out.println(P6.toString());
        // System.out.println(P7.toString());
        // System.out.println(P8.toString());
        System.out.println(P9.toString());

        // P2.setNombre("Johss");
        // P1.getCuenta().setSaldo(550.55);
        // P2.getCuenta().setSaldo(50.55);
        // System.out.println(P1.toString());
        // System.out.println(P2.toString());
    }
}