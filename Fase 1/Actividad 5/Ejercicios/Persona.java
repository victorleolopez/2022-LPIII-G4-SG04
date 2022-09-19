public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    static int numeroC = 1000;
    static int numeroB = 5000;
    static int numeroE = 8000;

    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        // Determine el numero de cuenta
        switch (tipoCliente) {
            case 'C':
                this.cuenta = new Cuenta(numeroC, tipoCliente);
                numeroC++;
                break;
            case 'B':
                this.cuenta = new Cuenta(numeroB, tipoCliente);
                numeroB++;
                break;
            case 'E':
                this.cuenta = new Cuenta(numeroE, tipoCliente);
                numeroE++;
                break;
        }
    }

    public Persona(int id, String nombre, String apellido) {
        this(id, nombre, apellido, 'C');
    }

    // setter y getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente: " + id + "\nTipo   : " + cuenta.getTipoCliente() + "\nNombres: " + nombre + " " + apellido
                + "\n" + cuenta + "\n";
    }

}
