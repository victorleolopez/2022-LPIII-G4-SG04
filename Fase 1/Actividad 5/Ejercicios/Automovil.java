public class Automovil {

    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int nPuertas, String marca, String modelo) {
        this.placa = placa;
        this.numPuertas = nPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String toString() {
        if (motor == null)
            return String.format("Automovil sin motor \nPlaca       : %s\nNo. Puertas : %s\nMarca       : %s\nModelo      : %s\n", placa, numPuertas, marca, modelo);
        else
            return String.format("Automovil con motor \nPlaca       : %s\nNo. Motor   : %s\nNo. Puertas : %s\nMarca       : %s\nModelo      : %s\nRPM         : %s\n", placa, motor.getNumMotor(),numPuertas, marca, modelo,motor.getRevPorMin() );
    }
}