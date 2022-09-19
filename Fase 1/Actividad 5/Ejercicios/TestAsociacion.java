public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP", 7);
        // Banco bbva = new Banco("BBVA", 30);
        Persona P1 = new Persona(111417, "Johan", "Mamani", 'C');
        Persona P2 = new Persona(2511747, "Jose", "Caceres", 'E');
        Persona P3 = new Persona(3511747, "Tsac", "Lopez", 'B');
        Persona P4 = new Persona(4511747, "Jedys", "Roque", 'E');
        System.out.println(bcp.toString());
        bcp.agregarCliente(P1);
        bcp.agregarCliente(P2);
        bcp.agregarCliente(P3);
        bcp.agregarCliente(P4);
        bcp.darBajaCliente(P3);
        System.out.println(bcp.toString());
        bcp.clienteTipo('E');
    }
}
