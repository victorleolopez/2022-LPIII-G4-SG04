import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Agenda {
    ArrayPersona lista;
    FileInputStream agendaFile;
    final int longLinea = 32;

    public Agenda() {
        this.lista = cargaContactos();
    }

    public void bucle() {
        String nombre;
        System.out.println("Introduzca un nombre o <Enter>");
        try {
            while (!"".equals(nombre = LeeEntrada(System.in))) {
                lista.printArray(nombre);
                System.out.println("Introduzca un nombre o <Enter>");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String LeeEntrada(InputStream entrada) throws IOException {
        byte chars[] = new byte[longLinea];
        int contador = 0;
        while (contador < longLinea && (chars[contador++] = (byte) entrada.read()) != '\n')
            if (chars[contador - 1] == -1)
                return null;
        return (new String(chars, 0, contador - 1));
    }

    private Persona cargaAgenda() throws IOException {
        String nombre = LeeEntrada(agendaFile);
        if (nombre == null)
            return null;

        String telefono = LeeEntrada(agendaFile);
        String direccion = LeeEntrada(agendaFile);

        return new Persona(nombre, telefono, direccion);
    }

    private ArrayPersona cargaContactos() {
        ArrayPersona directorio = new ArrayPersona();
        Persona nuevaPersona;
        try {
            agendaFile = new FileInputStream("ficheros/agenda.txt");
            while (true) {
                nuevaPersona = cargaAgenda();
                if (nuevaPersona == null)
                    return (directorio);
                directorio.addArray(nuevaPersona);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No hay archivo de agenda");
        } catch (Exception e) {
            System.out.println("Error en la carga de los contactos");
            System.exit(1);
        }
        return directorio;
    }
}
