import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contacto {


    private String nombre;
    private String telefono;
    private String direccion;
    Contacto[] lista_contactos = new Contacto[99];
    private int contador_contactos = 0; // Contador de objetos creados. Variable muy importante.

    public void Consultar(String nombre, int telefono) {
        for (int i = 0; i < this.contador_contactos; i++) {

            if (nombre.equals(this.lista_contactos[i].getNombre())) {
                System.out.println("Ya existe un contacto con ese nombre");
            }
        }


    public Contacto(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void set_nombre(String nomb) {
        this.nombre = nomb.toUpperCase();
    }

    public void set_telefono(String telefone) {
        this.telefono = telefone;
    }

    public void set_direccion(String direcString) {
        this.direccion = direcString;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    }

    public void Anadir(String nombre,String telefono,String direccion) {
        if (contador_contactos < 99) {
            this.lista_contactos[contador_contactos] = new Contacto();
            this.lista_contactos[contador_contactos].set_nombre(nombre);
            this.lista_contactos[contador_contactos].set_telefono(telefono);
            this.contador_contactos++;
            Ordenar();
        } else {
            System.out.println("La Contacto está llena");
        }

    }

    public void Buscar(String nombre) {
        boolean encontrado = false;

        for (int i = 0; i < contador_contactos; i++) {
            if (nombre.equals(this.lista_contactos[i].getNombre())) {
                System.out.println(
                        this.lista_contactos[i].getNombre() + "-" + "Tf:" + this.lista_contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contacto inexistente");
        }
    }

    public void Ordenar() {
        // Este método ordenará el array de contacos por el nombre mediante el Método
        // Burbuja
        int N = this.contador_contactos;
        String nombre1;
        String nombre2;
        // Optimizo para cuando tenga más de dos elementos al menos.
        if (contador_contactos >= 2) {
            for (int i = 1; i <= N - 1; i++) {
                for (int j = 1; j <= N - i; j++) {
                    nombre1 = this.lista_contactos[j - 1].getNombre();
                    nombre2 = this.lista_contactos[j].getNombre();
                    if (nombre1.charAt(0) > nombre2.charAt(0)) {
                        Contacto tmp = this.lista_contactos[j - 1];
                        this.lista_contactos[j - 1] = this.lista_contactos[j];
                        this.lista_contactos[j] = tmp;
                    }
                }
            }
        }
    }

    public void Mostrar() {
        if (this.contador_contactos == 0) {
            System.out.println("No hay contactos");
        } else {
            for (int t = 0; t < this.contador_contactos; t++) {
                // Es necesario por precaución usar el this para el metodo, puesto que si se
                // ejecuta muchas veces la referencias a memoria pueden fallar.
                System.out.println(this.lista_contactos[t].getNombre() + "-" + "Tf:"
                        + Integer.toString(this.lista_contactos[t].getTelefono()));
            }
        }
    }

    public void Vaciar() {
        try {
            System.out.println("Se eliminarán todos los contactos");
            System.out.println("¿Estas seguro (S/N)?");
            String respuesta;
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            respuesta = teclado.readLine();
            respuesta = respuesta.toUpperCase();
            if (respuesta.equals("S")) {

                // Lo hago por mera formalidad porque java se encarga de liberar los objetos no
                // referenciados creados. El garbage collector
                for (int i = 0; i < this.contador_contactos; i++) {
                    this.lista_contactos[i].set_nombre("");
                    this.lista_contactos[i].set_telefono(0);
                }
                contador_contactos = 0;
                System.out.println("Contacto vaciada correctamente");
            } else {
                System.out.println("Acción cancelada");
            }
        } catch (IOException ex) {
            Logger.getLogger(Contacto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Eliminar() {
        try {
            boolean encontrado = false;
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Nombre de contacto a eliminar:");
            String eliminar = teclado.readLine().toUpperCase();
            if (contador_contactos == 0) {
                System.out.println("No hay contactos");
            } else {
                for (int i = 0; i < contador_contactos; i++) {

                    if (eliminar.equals(this.lista_contactos[i].getNombre())) {
                        System.out.println(i + 1 + ". " + this.lista_contactos[i].getNombre() + "-" + "Tf:"
                                + this.lista_contactos[i].getTelefono());
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    System.out.println("¿Qué contacto quieres eliminar, introduce el número asociado?");
                    int eliminar_numero = Integer.parseInt(teclado.readLine());
                    eliminar_numero--;
                    System.out.println("¿Estas seguro (S/N)?");
                    String respuesta;
                    respuesta = teclado.readLine();
                    respuesta = respuesta.toUpperCase();
                    if (respuesta.equals("S")) {
                        Contacto[] temporal = new Contacto[99];
                        int ii = 0;
                        boolean encontrado2 = false;
                        for (int i = 0; i < this.contador_contactos; i++) {

                            if (i != eliminar_numero) {
                                // Creo el objeto temporal para el borrado
                                if (!encontrado2) {
                                    temporal[ii] = this.lista_contactos[ii];
                                    ii++;
                                } else {
                                    if (ii < this.contador_contactos) {
                                        temporal[ii] = this.lista_contactos[ii + 1];
                                        ii++;
                                    }
                                }

                            } else {
                                temporal[ii] = this.lista_contactos[ii + 1];
                                ii++;
                                encontrado2 = true;

                            }
                        }
                        this.contador_contactos--;
                        System.out.println("Contacto eliminado correctamente");
                        for (int j = 0; j < this.contador_contactos; j++) {
                            this.lista_contactos[j] = temporal[j];

                        }

                    }

                } else {
                    System.out.println("Lo siento, No se ha encontrado el nombre");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Contacto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
