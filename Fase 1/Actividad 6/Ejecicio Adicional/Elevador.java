public class Elevador extends Edificio {
    ;
    private int pisoActual;
    private int personas;
    private final int pesoFinal = 750;

    public Elevador(String Nombre, int pisoFinal, int pisoActual) {
        super(Nombre, pisoFinal);
        this.pisoActual = pisoActual;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getpersonas() {
        return personas;
    }

    public void setpersonas(int personas) {
        this.personas = personas;
    }

    public int getPesoFinal() {
        return pesoFinal;
    }

    public void Asensor(int personas) {

    }
    public boolean Espacios( int personas){
        if (personas*50>pesoFinal){
            return true;
        }
        else 
            return false;
    }

}
