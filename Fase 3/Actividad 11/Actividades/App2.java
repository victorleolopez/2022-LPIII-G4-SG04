public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Pares ordenados");
        System.out.println("Integer, Integer:");
        OrderedPair<Integer, Integer> ordenadosInt = new OrderedPair<Integer, Integer>(134, 12);
        System.out.println(ordenadosInt);

        System.out.println("Integer, String:");
        OrderedPair<Integer, String> ordenadosString = new OrderedPair<Integer, String>(15, "hola");
        System.out.println(ordenadosString);

        System.out.println("String, Persona:");
        OrderedPair<String, Persona> ordenadosPersona = new OrderedPair<String, Persona>("71636770",
                new Persona("Javier", "Comercion #128", "956557395"));
        System.out.println(ordenadosPersona);
    }
}
