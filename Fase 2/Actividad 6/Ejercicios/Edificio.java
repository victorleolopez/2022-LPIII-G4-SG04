public class Edificio implements ImpactoEcologico {
    private final double factor_de_Emision = 0.5;
    private double componentes;
    private double conservacion;
    private int tiempoVida;

    public Edificio(double componentes, double conservacion, int tiempoVida) {
        this.componentes = componentes;
        this.conservacion = conservacion;
        this.tiempoVida = tiempoVida;
    }

    public double getcomponentes() {
        return componentes;
    }

    public void setcomponentes(double componentes) {
        this.componentes = componentes;
    }

    public double getconservacion() {
        return conservacion;
    }

    public void setconservacion(double conservacion) {
        this.conservacion = conservacion;
    }

    public int gettiempoVida() {
        return tiempoVida;
    }

    public void settiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public double getFactor_de_Emision() {
        return factor_de_Emision;
    }
    
    public double dato_Actividad() {
        return (conservacion*tiempoVida)+componentes;
    }
    public double obtenerlmpactoEcologico(){
        return getFactor_de_Emision()*dato_Actividad();

    }

    @Override
    public String toString() {
        return "Edificio \ncosto contruccion: " + componentes + "\ncosto Matenimiento: " + conservacion
                + "\ntiempoVida: " + tiempoVida + "\nfactor_de_Emision: " + factor_de_Emision ;
    }
    

}