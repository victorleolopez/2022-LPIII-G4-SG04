public class TestAsociacion {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        Persona P1 = new Persona(211417, "Johan", "Mamani", 47474741);
        Persona P2 = new Persona(5511747, "Jose", "Caceres", 1757141);
        Persona P3 = new Persona(5511747, "Tsac", "Lopez", 17472528);
        Persona P4 = new Persona(5511747, "Jedys", "Roque", 717171);
        Persona P5 = new Persona(5511747, "Geral", "Vasquez", 71174888);
        Persona P6 = new Persona(5511747, "Alain", "Dueñas", 888874741);
        Persona P7 = new Persona(5511747, "Saul", "Jarata", 99958717);
        // agregue clientes
        bcp.agregarCliente(P1);
        bcp.agregarCliente(P2);
        bcp.agregarCliente(P4);
        bcp.agregarCliente(P7);
        bbva.agregarCliente(P3);
        bbva.agregarCliente(P5);
        bbva.agregarCliente(P6);
        // elimine clientes
        bcp.darBajaCliente(P2);
        bcp.darBajaCliente(P4);
        bbva.darBajaCliente(P7);
        // lista los clientes por tipo
        System.out.println(bcp);
        System.out.println(bbva);
        // busque clientes
        

    }
}
