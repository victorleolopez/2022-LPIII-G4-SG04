import java.util.ArrayList;

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
        String NuPer = "";
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
            } else {
                NuPer = NuPer + clientes[i].toString() + "\n";
            }
        }
        return " Banco { " + " NOMBRE = " + nombre + " \n CLIENTES {" + "\n" + NuPer + "}";
    }

    public void agregarCliente(Persona persona) {
        if (comprobarSiExisteCliente(persona)) {
            System.out.println("\nYa existe un contacto con ese nombre, por favor digite otro nombre");
        } else if (comprobarSiLaAgendaEstaLlena()) {
            System.out.println("\nLa lista esta llena");
        } else {
            boolean registrado = false;
            for (int i = 0; i < clientes.length && !registrado; i++) {
                if (clientes[i] == null) {
                    clientes[i] = persona;
                    registrado = true;
                }
            }
            if (registrado == true) {
                // System.out.println("\nEl contacto se ha registrado con exito !!");
            } else {
                // System.out.println("\nNo se ha podido registrar el contacto");
            }
        }
    }

    public void darBajaCliente(Persona persona) {
        int num = -1;
        int poscicion = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null)
                num++;
            if (clientes[i] != null && clientes[i].equals(persona)) {
                System.out.println("\nEl contacto se ha eliminado " + clientes[i]);
                poscicion = i;
                clientes[i] = null;
            }
        }
        clientes[poscicion] = clientes[num];
        clientes[num] = null;
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].equals(persona))
                    return true;
            }
        }
        return false;
    }

    public void clienteTipo(char tipo) {
        ArrayList<Persona> clienteC = new ArrayList<Persona>();
        ArrayList<Persona> clienteB = new ArrayList<Persona>();
        ArrayList<Persona> clienteE = new ArrayList<Persona>();
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getCuenta().getTipoCliente() == 'C')
                clienteC.add(clientes[i]);
            if (clientes[i] != null && clientes[i].getCuenta().getTipoCliente() == 'B')
                clienteB.add(clientes[i]);
            if (clientes[i] != null && clientes[i].getCuenta().getTipoCliente() == 'E')
                clienteE.add(clientes[i]);
        }
        switch (tipo) {
            case 'C':
                System.out.println(clienteC);
                break;
            case 'B':
                System.out.println(clienteB);
                break;
            case 'E':
                System.out.println(clienteE);
                break;
        }
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
