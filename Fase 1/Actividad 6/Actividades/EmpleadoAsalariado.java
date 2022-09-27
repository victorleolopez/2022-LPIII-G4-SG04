public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double salario) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        estableceSalarioSemanal(salario);
    }

    private void estableceSalarioSemanal(double salario) {
    }

    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }
}
