public class Banco {
    private String nombre;
    private Persona clientes[];

    public void set

    public Banco(String nombre) {
        this(nombre,20)
    }Clientes(Persona[] clientes) {
        this.clientes = clientesintnumiCgr    }

    new

    Peronsona[]numcliCnumclicC // Contructores

    public Banco(String nombre, Persona clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    // setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona getClientes() {
        return clientes;
    }

    public void setClientes(Persona clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", clientes=" + clientes + '}';
    }

    public void agregarCliente(Persona persona) {
        // Completa
    }

    public Persona darBajaCliente(Persona persona) {
        // Completa
    }

    public boolean buscarCliente(Persona persona) {
        // Completa
    }

    public void clienteTipo(char tipo) {
        // Completa
    }

}
