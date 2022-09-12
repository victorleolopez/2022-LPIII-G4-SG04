public class Agenda {

    private Contacto contactos[];

    // le establecemos un tamaño por defecto de 10 contactos
    public Agenda() {
        contactos = new Contacto[10];
    }

    public Agenda(int tamaño) {
        contactos = new Contacto[tamaño];
    }

    // 1. Creamos el método para añdir contactos a la agenda
    public void añadirContacto(Contacto contacto) {
        if (comprobarSiExisteContacto(contacto)) {
            System.out.println("\nYa existe un contacto con ese nombre, por favor digite otro nombre");
        } else if (comprobarSiLaAgendaEstaLlena()) {
            System.out.println("\nLa agenda esta llena");
        } else {
            boolean registrado = false;
            for (int i = 0; i < contactos.length && !registrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = contacto;
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

    // 2. Creamos el método para buscar un contacto por nombre
    public void buscarContacto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("\n¡Contacto encontrado!");
                System.out.println("\nTelefono: " + contactos[i].getTelefono());
                System.out.println("Direccion: " + contactos[i].getDireccion());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nNo se ha encontrado el contacto");
        }
    }

    // 3. Creamos el metodo para modificar datos del contactos
    public void modificarContacto(Contacto contacto) {
        if (comprobarSiExisteContacto(contacto)) {
            boolean modificado = false;
            for (int i = 0; i < contactos.length && !modificado; i++) {
                if (contactos[i] != null && contactos[i].equals(contacto)) {
                    contactos[i] = contacto;
                    modificado = true;
                }
            }
            if (modificado == true) {
                System.out.println("\nEl contacto se ha modificado");
            } else {
                System.out.println("\nEl contacto no se ha modificado");
            }
        }
    }

    // 4 y 5 Creamos el método para eliminar o borrar contacto
    public void eliminarContacto(Contacto contacto) {
        boolean eliminado = false;
        for (int i = 0; i < contactos.length && !eliminado; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                contactos[i] = null;
                eliminado = true;
            }
        }

        if (eliminado == true) {
            System.out.println("\nEl contacto se ha eliminado");
        } else {
            System.out.println("\nEl contacto no se ha eliminado");
        }
    }

    // 6. Creamos el método para mostrar los contactos
    public void listarContactos() {
        if (comprobarSiHayHuecosLibres() == contactos.length) {
            System.out.println("\nNo hay contactos para mostrar");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    System.out.println("Nombre : " + contactos[i].getNombre());
                    System.out.println("Telefono : " + contactos[i].getTelefono());
                    System.out.println("Direccion : " + contactos[i].getDireccion());
                    System.out.println("");
                }
            }
        }
    }

    // Creamos el método para comprobar si existe un contacto con el mismo nombre
    public boolean comprobarSiExisteContacto(Contacto contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals(contacto)) {
                return true;
            }
        }
        return false;
    }

    // Creamos el método para comprobar si la agenda esta llena
    public boolean comprobarSiLaAgendaEstaLlena() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }
        return true;
    }

    // Creamos para comprobar si hay espacios libres en el arreglo
    public int comprobarSiHayHuecosLibres() {
        int contadorVacios = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contadorVacios++;
            }
        }
        return contadorVacios;
    }
}
