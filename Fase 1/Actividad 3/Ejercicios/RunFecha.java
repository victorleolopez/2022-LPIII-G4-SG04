public class RunFecha {
    public static void main(String[] args) {
        Fecha fech = new Fecha(01, 04, 2000);
        System.out.println(fech.diasEntre(new Fecha(01, 05, 2000)));
    }
}
