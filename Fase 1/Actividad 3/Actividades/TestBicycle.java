public class TestBicycle {
    public static void main(String[] args) {

        Bicycle a, b;

        a = new Bicycle("Adam Smith", 1);
        b = new Bicycle("Ben Jones", 5);
        a.distanceTraveled(240);
        System.out.println(b.getOwnerName());
        b.distanceTraveled(1100);
        Bicycle most0ld = Bicycle.mostused(a, b);
        System.out.println(most0ld);
    }
}