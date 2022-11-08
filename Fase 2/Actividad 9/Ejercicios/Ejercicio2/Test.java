public class Test {
    public static void main(String[] args) {
        ClaseA obj1 = new ClaseA(3);
        ClaseB obj2 = new ClaseB();
        ClaseC obj3 = new ClaseC(2);
        ClaseA obj4 = new ClaseB(6);
        ClaseA obj5 = new ClaseC();
        ClaseA obj6 = new ClaseB();
        ClaseA obj7 = new ClaseC(3);
        ClaseA obj8 = new ClaseB(5);
        metodol  ((ClaseC) obj8);
    }

    public static void metodol(ClaseA obj) {
        System.out.println(obj.mostrar());

    }
}
