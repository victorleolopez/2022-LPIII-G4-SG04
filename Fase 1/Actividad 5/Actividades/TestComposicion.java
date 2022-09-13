public class TestComposicion {
    public static void main(String[] args) {
        Persona P1 = new Persona (1001, "Victor", "Lopez", 1635422)
        Persona P2 = new Persona (102, "Johan", "Mamani", 1636770)
        Cuenta C1 = new Cuenta (71636770,500.00);
        Cuenta C2 = new Cuenta (71611111,4500.00);
        P2.setNombre("Johss");
        P2.setCuenta(C2);
        P1.setCuenta(C1);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}
