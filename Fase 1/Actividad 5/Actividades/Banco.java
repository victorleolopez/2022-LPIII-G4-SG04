public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    // setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", clientes=" + clientes + '}';
    }

    public void agregarCliente(Persona persona) {
        if (comprobarSiExisteCliente(persona)) {
            System.out.println("\nYa existe un contacto con ese nombre, por favor digite otro nombre");
        } else if (comprobarSiLaAgendaEstaLlena()) {
            System.out.println("\nLa agenda esta llena");
        } else {
            boolean registrado = false;
            for (int i = 0; i < clientes.length && !registrado; i++) {
                if (clientes[i] == null) {
                    clientes[i] = persona;
                    registrado = true;
                }
            }

            if (registrado == true) {
                System.out.println("\nEl contacto se ha registrado con exito !!");
            } else {
                System.out.println("\nNo se ha podido registrar el contacto");
            }
        }
    }

    }

    public Persona darBajaCliente(Persona[] persona) {
        String nombre=sc.next();
		Telphone tel=new Telphone();
        for(int i=0;i<list.size();i++) {
			tel=(Telphone) list.get(i);
			if(tel.getName().equals(name)) {
				list.remove(i);
				System.out.println("eliminado correctamente!");
				return 0;
    }

    public boolean buscarCliente(Persona persona) {

    }

    public void clienteTipo(char tipo) {
        // Completa
    }

    public boolean comprobarSiExisteCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarSiLaAgendaEstaLlena() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                return false;
            }
        }
        return true;
    }

}
