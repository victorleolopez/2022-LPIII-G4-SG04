public class TestHerencia {

    public static void main(String[] args) {
        Asalariados as1 = new Asalariados("Juan", 24252623, 5);

        System.out.println(as1);
        System.out.println();

        EmpleadoProduccion p1 = new EmpleadoProduccion("Mariana", 85956545, 7, "Tarde");
        System.out.println(p1);

        Asalariados as2 = new EmpleadoProduccion("Juan Zeballos", 25874123, 4, "Noche");

        System.out.println(as2);
        System.out.println();

        // Object obj1 = as2; // esto es posible porque object es una superclase

        EmpleadoProduccion p2 = (EmpleadoProduccion) as2;

        System.out.println(p2);
        System.out.println();

        EmpleadoDistribucion d1 = new EmpleadoDistribucion("Juan Perez", 85968574, 8, "Norte");
        System.out.println(d1);
        System.out.println();

        Asalariados as3 = new EmpleadoDistribucion("Juana Cervantes", 98745632, 7, "Dia");

        System.out.println(as3);
        System.out.println();

    }
}