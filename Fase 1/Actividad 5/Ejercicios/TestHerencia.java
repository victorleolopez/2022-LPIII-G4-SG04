public class TestHerencia {

    public static void main(String[] args) {
        Asalariados as1 = new Asalariados("Johan Mamani", 71636770, 9, 5000);
        System.out.println(as1);

        EmpleadoProduccion p1 = new EmpleadoProduccion("Rosalinda Fernandez", 85956545, 7, "Tarde", 3500);
        System.out.println(p1);

        Asalariados as2 = new EmpleadoProduccion("Juan Zeballos", 25874123, 4, "Noche", 2000);
        System.out.println(as2);

        EmpleadoProduccion p2 = (EmpleadoProduccion) as2;
        System.out.println(p2);

        EmpleadoDistribucion d1 = new EmpleadoDistribucion("Edwin Perez", 85968574, 8, "Norte", 2000);
        System.out.println(d1);

        Asalariados as3 = new EmpleadoDistribucion("Raul Cervantes", 98745632, 7, "Dia", 2000);
        System.out.println(as3);

    }
}