public class Auto implements ImpactoEcologico {
    private double FACTOR_DE_EMISION=0.3;

    public double getFACTOR_DE_EMISION() {
        return FACTOR_DE_EMISION;
    }

    public void setFACTOR_DE_EMISION(double fACTOR_DE_EMISION) {
        FACTOR_DE_EMISION = fACTOR_DE_EMISION;
    }

    private double FACTOR_DE_EMISION() {
        return 0;
    }

    private double DATO_ACTIVIDAD() {
        return 0;
    }

    @Override
    public double obtenerlmpactoEcologico() {
        return DATO_ACTIVIDAD() * FACTOR_DE_EMISION();
    }
    
}
