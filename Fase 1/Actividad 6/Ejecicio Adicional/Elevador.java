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

    public void Espacios(int personas, int numero) {
        if (numero == 1) {
            if ((this.personas) * 50 == pesoFinal) {
                System.out.println("Elebador lleno porfavor esperar");
            } else {
                if ((personas + this.personas) * 50 <= pesoFinal) {
                    this.personas = this.personas + personas;
                    System.out.println("Se subieron " + personas + " personas");
                } else {
                    System.out.println("No se puede llevar a todas las personas\nEspacio para "
                            + (pesoFinal - (50 * this.personas)) / 50 + " Persona");
                }
            }
        } else {
            if ((this.personas - personas) * 50 < pesoFinal) {
                this.personas = this.personas - personas;
                System.out.println("Se bajaron " + personas + " personas");
            } else {
                System.out.println("No se puede llevar a todas las personas\nEspacio para "
                        + (pesoFinal - (50 * this.personas)) / 50 + " Persona");
            }
        }
    }

    public void Paseo(int destino) {
        System.out.println("Estamos en el piso [" + this.pisoActual + "]");
        if (this.pisoActual < destino) {
            for (int i = this.pisoActual+1; i < destino; i++) {
                System.out.println("Subiendo al piso [" + i + "]");
            }
            System.out.println("LLegamos a su Destino al piso [" + destino + "]");
        }
        else{
            for (int i = this.pisoActual-1; i > destino; i--) {
                System.out.println("Bajando al piso [" + i + "]");
            }
            System.out.println("LLegamos a su Destino al piso [" + destino + "]");
            
        }
        this.pisoActual = destino;
    }

}

