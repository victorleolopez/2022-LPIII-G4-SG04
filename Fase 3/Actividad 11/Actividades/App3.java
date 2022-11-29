public class App3 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n*********** Bolsa de Integer ***********");
        Bag<Integer> bolsaInteger = new Bag<>(3);
        bolsaInteger.add(1);
        bolsaInteger.add(2);
        System.out.println(bolsaInteger);
        bolsaInteger.add(3);
        bolsaInteger.remove(8);
        System.out.println(bolsaInteger);
        System.out.println("Indice " + bolsaInteger.getIndex(9));
        System.out.println("Indice " + bolsaInteger.getIndex(2));

        System.out.println("\n***********  Bolsa de String ***********");
        Bag<String> bolsaString = new Bag<>(3);
        bolsaString.add("Perro");
        bolsaString.add("Gato");
        System.out.println(bolsaString);
        bolsaString.add("Guacamayo");
        bolsaString.remove("Perro");
        System.out.println(bolsaString);
        System.out.println("Indice " + bolsaString.getIndex("Guacamayo"));
        System.out.println("Indice " + bolsaString.getIndex("Gato"));

        System.out.println("\n***********  Bolsa de Persona ***********");
        Bag<Persona> bolsaPersona = new Bag<>(3);
        bolsaPersona.add(new Persona("Fernando", "Antiquilla", "932111416"));
        bolsaPersona.add(new Persona("Andre", "Antiquilla", "999111999"));
        System.out.println(bolsaPersona);
        bolsaPersona.remove(new Persona("Fernando", "Antiquilla", "932111416"));
        bolsaPersona.add(new Persona("Jesus", "Nose", "TampocoSe"));
        System.out.println(bolsaPersona);
        System.out.println("Indice " + bolsaPersona.getIndex(new Persona("Andre", "Antiquilla", "999111999")));
        System.out.println("Indice " + bolsaPersona.getIndex(new Persona("Jesus", "Nose", "TampocoSe")));
    }
}
