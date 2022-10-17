import java.util.ArrayList;

public class PruebaInterfazImpactoE {
    public static void main(String[] args) {
        int countAuto = 0;
        int countBicleta = 0;
        int countEdificio = 0;

        ArrayList<ImpactoEcologico> objetoImpactoEcologico = new ArrayList<ImpactoEcologico>();
        objetoImpactoEcologico.add(new Auto(10, 20, 30));
        objetoImpactoEcologico.add(new Auto(100, 40, 75));
        objetoImpactoEcologico.add(new Bicicleta(14, 15, 14));
        objetoImpactoEcologico.add(new Bicicleta(1000, 10, 40));
        objetoImpactoEcologico.add(new Edificio(2410, 70, 100));
        objetoImpactoEcologico.add(new Edificio(10000, 20, 124));

        System.out.println("\nImpactoEcologico procesados en forma polimorfica:\n");

        for (ImpactoEcologico ImpactoEcologicoActual : objetoImpactoEcologico) {
            System.out.printf("%s\n%s: %,.2f\n\n", ImpactoEcologicoActual.toString(), "Impacto ambiental",
                    ImpactoEcologicoActual.obtenerlmpactoEcologico());

            if (ImpactoEcologicoActual instanceof Auto) {
                countAuto++;
            }
            if (ImpactoEcologicoActual instanceof Bicicleta) {
                countBicleta++;
            }
            if (ImpactoEcologicoActual instanceof Edificio) {
                countEdificio++;
            }
        }
        
        System.out.println("\nEn el arreglo de Impacto Ecologico hay: " + countAuto + " Carros");
        System.out.println("\nEn el arreglo de Impacto Ecologico hay: " + countBicleta + " Biciletas");
        System.out.println("\nEn el arreglo de Impacto Ecologico hay: " + countEdificio + " Edificios");
    }
}
