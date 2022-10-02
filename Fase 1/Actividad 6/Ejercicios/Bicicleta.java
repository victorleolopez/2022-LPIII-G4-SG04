public class Bicicleta  implements ImpactoEcologico{
    private final double factor_de_Emision = 0.05;
    private double usoEnergia;
    private double tiempoVida;
    private double InContamiencion;

    public Bicicleta(double usoEnergia, double tiempoVida, double InContamiencion) {
        this.usoEnergia = usoEnergia;
        this.tiempoVida = tiempoVida;
        this.InContamiencion = InContamiencion;
    }

    public double getusoEnergia() {
        return usoEnergia;
    }

    public void setusoEnergia(double usoEnergia) {
        this.usoEnergia = usoEnergia;
    }

    public double gettiempoVida() {
        return tiempoVida;
    }

    public void settiempoVida(double tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public double getInContamiencion() {
        return InContamiencion;
    }

    public void setInContamiencion(double InContamiencion) {
        this.InContamiencion = InContamiencion;
    }

    public double getFactor_de_Emision() {
        return factor_de_Emision;
    }

    private double dato_Actividad() {
        return tiempoVida*(usoEnergia+InContamiencion) ;
    }

    @Override
    public double obtenerlmpactoEcologico() {
        return dato_Actividad() * getFactor_de_Emision();
    }

    @Override
    public String toString() {
        return "Bicicleta \nfactor_de_Emision: " + factor_de_Emision + "\nusoEnergia: " + usoEnergia
                + "\ntiempoVida: " + tiempoVida + "\nInContamiencion: " + InContamiencion;
    }
}
