public class Ejercicio1 {
    public static void main(String[] args) {
        double[] v = new double[15];
        // aqui
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if (j >= 0 && j <= v.length)
                return v[j];
            else
                throw new Exception("El indice " + j + "no existe en el vector");
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}