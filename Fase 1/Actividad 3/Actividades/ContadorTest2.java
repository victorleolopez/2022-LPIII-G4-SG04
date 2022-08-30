public class ContadorTest2 {
    public static void main(String[] args) {
        Contador c1, c2, c3;
        System.out.println(Contador.acumulador());
        c1 = new Contador(3);
        c2 = new Contador(10);
        c3 = new Contador();// "VALOR_INICIAL" SE INICIALIZA EN 10
        c1.inc();
        c1.inc();
        c2.inc();
        c3.inc();
        System.out.println(c1.getValor());
        System.out.println(c2.getValor());
        System.out.println(c3.getValor());
        System.out.println(Contador.acumulador);
    }
}