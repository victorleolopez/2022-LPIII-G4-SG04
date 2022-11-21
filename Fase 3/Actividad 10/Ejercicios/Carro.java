public class Carro {
    private String Placa;
    private String Marca;
    private String Modelo;

    public Carro(String placa, String marca, String modelo) {
        Placa = placa;
        Marca = marca;
        Modelo = modelo;
    }

    public String getplaca() {
        return Placa;
    }

    public void setplaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    @Override

    public boolean equals(Object obj) {
        Carro carrocomparado = (Carro) obj;
        return this.getplaca().equals(carrocomparado.getplaca());
    }

}
