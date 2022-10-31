import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GianCarlos
 */
public class Archivo {

    private File fichero;
    private String contenido;

    public Archivo() {

    }

    public Archivo(File fichero) {
        this.fichero = fichero;
        this.contenido = "";
        leerContenido();
    }

    public void leerContenido() {
        String linea = null;
        FileReader f = null;
        BufferedReader b = null;
        StringBuilder aux = new StringBuilder();
        try {
            f = new FileReader(this.fichero);
            b = new BufferedReader(f);
            try {

                while ((linea = b.readLine()) != null) {
                    aux.append(linea);
                    aux.append("\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(DemoWordCount.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoWordCount.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.contenido = aux.toString();
    }

    public String getContenido() {
        return contenido;
    }

    public int getLineas() {
        if (this.contenido.equals("")) {
            return 0;
        } else {
            return this.contenido.split("\n").length;
        }
    }

    public int getPalabras() {
        if (this.contenido.equals("")) {
            return 0;
        } else {
            return this.contenido.replaceAll("´", " ").replace("\n", " ").split("\\s+").length;
        }
    }

    public int getCaracteres() {
        return this.contenido.replace("\n", "").length();// .replaceAll("\\s+", "")
    }

}
