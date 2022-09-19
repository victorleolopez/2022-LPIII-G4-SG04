public class TestComposicion {
    public static void main(String[] args) {

        Persona P5 = new Persona(2021145, "Johan", "Mamani", 'E');
        Persona P6 = new Persona(2021146, "Grecia", "Jarita", 'C');
        Persona P7 = new Persona(2021147, "Raul", "Carpio", 'E');
        Persona P8 = new Persona(2021148, "Angeles", "Jarata", 'B');
        Persona P9 = new Persona(2021149, "Rafaela", "Lopez", 'B');

        P8.getCuenta().setSaldo(450.00);
        P9.getCuenta().setSaldo(2500);

        System.out.println(P5.toString());
        System.out.println(P6.toString());
        System.out.println(P7.toString());
        System.out.println(P8.toString());
        System.out.println(P9.toString());

        P5.setNombre("Isac");
        P6.getCuenta().depositar(5000);
        P8.getCuenta().depositar(5000);
        P7.getCuenta().retirar(50.00);
        P9.getCuenta().retirar(1000.00);
        
        System.out.println();
        System.out.println(P5.toString());
        System.out.println(P6.toString());
        System.out.println(P7.toString());
        System.out.println(P8.toString());
        System.out.println(P9.toString());
    }
}