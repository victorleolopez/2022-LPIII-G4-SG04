import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerEntrada {
    // atributos
    private Reader stream;

    // métodos
    /**
     * Constructor
     *
     * @param fuente la fuente de datos
     */
    public LeerEntrada(InputStream fuente) {
        stream = new InputStreamReader(fuente);
    }

    /**
     * Obtiene el siguiente carácter del teclado.
     *
     * @return el carácter escrito
     * @throws IOException
     */
    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}