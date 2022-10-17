public class Auto implements ImpactoEcologico {
    private final double factor_de_Emision = 0.3;
    private double comsumoCombustible;
    private double usoacero;
    private double tiempoVida;

    public Auto(double comsumoCombustible, double usoacero, double tiempoVida) {
        this.comsumoCombustible = comsumoCombustible;
        this.usoacero = usoacero;
        this.tiempoVida = tiempoVida;
    }

    public double getFactor_de_Emision() {
        return factor_de_Emision;
    }

    public double getcomsumoCombustible() {
        return comsumoCombustible;
    }

    public void setcomsumoCombustible(double comsumoCombustible) {
        this.comsumoCombustible = comsumoCombustible;
    }

    public double getusoacero() {
        return usoacero;
    }

    public void setusoacero(double usoacero) {
        this.usoacero = usoacero;
    }

    public double gettiempoVida() {
        return tiempoVida;
    }

    public void settiempoVida(double tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    private double dato_Actividad() {
        return (comsumoCombustible*tiempoVida)+usoacero;
    }

    @Override
    public double obtenerlmpactoEcologico() {
        return dato_Actividad() * getFactor_de_Emision();
    }

    @Override
    public String toString() {
        return "Auto :  \nfactor_de_Emision: " + factor_de_Emision + "\ncomsumoCombustible: " + comsumoCombustible
                + "\nusoacero: " + usoacero + "\ntiempoVida: " + tiempoVida;
    }
}
