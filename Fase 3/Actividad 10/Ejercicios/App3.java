public class App3 {

    public static void main(String[] args) throws Exception {
        String stringA = "LABAL";
        String stringB = "LABAL";
        Integer integerA = 20;
        Integer integerB = 15;
        Double doubleA = 1.15;
        Character charA = 't';
        Carro c1 = new Carro("VV-VV-99", "SANSUND", "1235ASS");
        Carro c2 = new Carro("VV-VV-99", "SANSUND", "1235ASS");
        Carro c3 = new Carro("ZUL", "MOTLORA", "1J5ASS");
        System.out.println("stringA con stringB ¿son iguales?");
        System.out.println(isEqualTo(stringA, stringB));

        System.out.println("integerA con integerB ¿son iguales?");
        System.out.println(isEqualTo(integerA, integerB));

        System.out.println("doubleA con charA ¿son iguales?");
        System.out.println(isEqualTo(doubleA, charA));

        System.out.println("carro 1 con carro 2 ¿son iguales?");
        System.out.println(isEqualTo(c1, c2));

        System.out.println("carro 1 con carro 3 ¿son iguales?");
        System.out.println(isEqualTo(c1, c3 ));

    }

    public static <T, E> boolean isEqualTo(T argumento1, E argumento2) {
        return argumento1.equals(argumento2);
    }

}
