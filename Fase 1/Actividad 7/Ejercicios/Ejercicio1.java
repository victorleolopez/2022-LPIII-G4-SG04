public class Ejercicio1 {
    public static void main(String[] args) {
        double[] v = new double[15];
        // para introduccir el acceso como el la duncion esta con exception debemos trabajar con exception
        try {
            acceso(v,16); // nos ingresara in error porque es una espacion de 16 pero recordemos que la posicion es de 0 a 15 que son 16 espacios
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if (j >= 0 && j <= v.length){
                return v[j];}
            else
                throw new Exception("El indice " + j + "no existe en el vector");
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}