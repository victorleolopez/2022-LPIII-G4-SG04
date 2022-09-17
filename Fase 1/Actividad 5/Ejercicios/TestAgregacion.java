public class TestAgregacion {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("A8S-63510", 4, "toyota", "x2z");
        System.out.println(a1.toString());
        Motor m1 = new Motor(145, 1000);
        Motor m2 = new Motor(845, 415);
        // Motor m3 = new Motor(800, 3000);
        a1.setMotor(m1);
        System.out.println(a1.toString());
        a1.setMotor(m2);
        System.out.println(a1.toString());
        // System.out.println(a1.toString());
        // a1.setMotor(m3);
        // System.out.println(a1.toString());

    }

}
