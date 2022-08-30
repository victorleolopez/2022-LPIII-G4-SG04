public class Contador {
    static int acumulador = 0;
    static int nContadores = 0;
    static int ultimoContador = 0;
    final static int VALOR_INICIAL = 10;
    private int valor;

    public static int acumulador() {
        return acumulador;
    }

    // public Contador(int valor) {
    // this.valor = valor;
    // acumulador += valor;
    // Contador.VALOR_INICIAL += valor;
    // }

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }

    public Contador() {
        this(Contador.VALOR_INICIAL);
        nContadores++;
        ultimoContador = valor;
    }

    public void inc() {
        valor++;
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }
}
