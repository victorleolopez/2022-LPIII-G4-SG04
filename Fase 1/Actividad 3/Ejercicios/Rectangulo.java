public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String colors;
    static int nAcumuladores = 0;

    // Constructor
    public Rectangulo(Coordenada C1, Coordenada C2) {
        this.esquina1 = C1;
        this.esquina2 = C2;
        // nAcumuladores++;
        this.colors = controlcolor();
    }

    public Rectangulo(int CompX, int CompY) {
        this.esquina1 = new Coordenada(0, CompY);
        this.esquina2 = new Coordenada(CompX, 0);
        nAcumuladores++;
        this.colors = controlcolor();
    }

    public String controlcolor() {
        String color = "";
        switch (nAcumuladores) {
            case 1:
                color = "Verde";
                break;
            case 2:
                color = "Amarillo";
                break;
            case 3:
                color = "Rojo";
                nAcumuladores = 0;
                break;
        }
        return color;
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada C) {
        this.esquina1 = C;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada C) {
        this.esquina2 = C;
    }

    public String getColor() {
        return colors;
    }

    public void setColor(String color) {
        this.colors = color;
    }

    public String toString() {
        return "\t>> Coordenada 1 : " + esquina1 + ", Coordenada 2 : " + esquina2 + ", Color : " + colors;
    }

}
