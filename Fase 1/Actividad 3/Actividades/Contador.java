public class Contador {

    static int acumulador = 0;

    private int valor;

    public static int acumulador() {
        return acumulador;
    } 

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
        this.acumulador+=valor; //3.a.1 Cambiar en el constructor Contador
        Contador.acumulador+=valor; //3.a.2 Cambiar en el constructor Contador
    }

    public void inc() {
        valor++;
        this.valor++;
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }
}