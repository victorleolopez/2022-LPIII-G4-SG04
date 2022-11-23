public class Procedencia {
    private String departamento;
    private String provincia;

    public Procedencia(String departamento, String provincia) {
        this.departamento = departamento;
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public boolean equals(Object obj) {
        Procedencia comparado = (Procedencia) obj;
        return this.provincia == comparado.provincia && this.departamento == comparado.departamento;
    }

    @Override
    public String toString() {
        return " Procedencia : " + departamento + ", provincia : " + provincia;
    }

}
