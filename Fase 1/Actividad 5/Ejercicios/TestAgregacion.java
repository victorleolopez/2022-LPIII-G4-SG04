public class TestAgregacion {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("AU399", 3, "Toyota", "Corollax");
        Automovil a2 = new Automovil("VH744", 5, "Nissan", "Versal");
        System.out.println(a1.toString());
        Motor m1 = new Motor(3729, 1000);
        Motor m2 = new Motor(4751, 2000);
        a2.setMotor(m2);
        System.out.println(a2.toString());
        a1.setMotor(m1);
        System.out.println(a1.toString());
        System.out.println(m2.toString());
    }

}
