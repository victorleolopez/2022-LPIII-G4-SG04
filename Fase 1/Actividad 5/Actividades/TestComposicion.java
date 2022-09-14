public class TestComposicion {
    public static void main(String[] args) {
        Persona P1 = new Persona(1001, "Victor", "Lopez", 1635422);
        Persona P2 = new Persona(102, "Johan", "Mamani", 1636770);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
        P2.setNombre("Johss");
        P1.getCuenta().setSaldo(550.55);
        P2.getCuenta().setSaldo(50.55);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}