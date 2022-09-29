public class Bicicleta  implements ImpactoEcologico{
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
