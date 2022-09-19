public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP", 7);
        // Banco bbva = new Banco("BBVA", 30);
        Persona P1 = new Persona(111417, "Johan", "Mamani", 'C');
        Persona P2 = new Persona(2511747, "Maria", "Casapia", 'E');
        Persona P3 = new Persona(3511747, "Victor", "Lopez", 'B');
        Persona P4 = new Persona(4511747, "Gladis", "Roque", 'E');
        Persona P5 = new Persona(111417, "Robert", "Vasquez", 'C');
        bcp.agregarCliente(P1);
        bcp.agregarCliente(P2);
        bcp.agregarCliente(P3);
        bcp.agregarCliente(P4);
        bcp.agregarCliente(P5);
        System.out.println(bcp.toString());
        bcp.darBajaCliente(P3);
        System.out.println(bcp.toString());
        bcp.clienteTipo('E');
        bcp.clienteTipo('C');
    }
}
