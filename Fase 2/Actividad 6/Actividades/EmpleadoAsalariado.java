public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double salario) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSalarioSemanal(salario);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double getMontoPago(){
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("Empleado Asalariado: %s\nSalario Semanal: $%,.2f",super.toString(),salarioSemanal);
    }
}
