import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class LeerEntrada {
    private Reader stream;
    /**
     * contructor
     * 
     * @param fuente la fuente de datos
     */
    public LeerEntrada(InputStream Fuente){
        stream = new InputStreamReader(Fuente);
        /**
         * Obtiene el siguiente caracter del teclado
         * 
         * @return el caracter escrito
         * @thwos IOException
         */
        public char getChar() throw IOException{
            return (char) this.stream.read();

        }
    }
    
}
