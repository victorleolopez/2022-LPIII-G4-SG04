public class Verificadora<T> implements Contenedora<T> {
    private T[] datos;

    public Verificadora(T[] x) {
        this.datos = x;
    }

    @Override
    public boolean contiene(T valor) {
        for (T elem : datos)
            if (valor.equals(elem))
                return true;
        return false;
    }

    public T[] getDatos() {
        return datos;
    }

    public void setDatos(T[] datos) {
        this.datos = datos;
    }
    

}
