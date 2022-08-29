import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    // Inicializar el objeto (constructor)
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int anio, double altura,
            double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public int getdia() {
        return dia;
    }

    public int setdia(int dia) {
        return this.dia = dia;
    }

    public int getmes() {
        return mes;
    }

    public int setmes(int mes) {
        return this.mes = mes;
    }

    public int getanio() {
        return anio;
    }

    public int setanio(int anio) {
        return this.anio = anio;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getpeso() {
        return peso;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\n\t ----------- DATOS DEL PACIENTE ----------- \t\n" + "\n\tNombre: " + nombre + "\n\tApellido: "
                + apellido
                + "\n\tSexo: " + sexo + "\n\tFecha nacimiento: " + dia + "/"
                + mes + "/" + anio + "\n\tAltura: " + altura + "\n\tPeso: " + peso + "\n\tEdad: " + edad() + "\n\tIMC: "
                + imc()
                + "\n\tFCM: " + fmc() + "\n\t -------------------------------------------- \t\n";
    }

    public int edad() {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }

    public double fmc() {
        double fmc;
        fmc = 208 - 0.7 * edad();
        return fmc;
    }

    public double imc() {
        double imc;
        imc = peso / Math.pow(altura, 2);
        return imc;
    }

}