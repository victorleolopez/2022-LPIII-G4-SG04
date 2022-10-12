public class Excepcion_blanco extends Exception  {

    public Excepcion_blanco() {
    }

    public Excepcion_blanco(String message) {
        super(message);
    }

    public Excepcion_blanco(Throwable cause) {
        super(cause);
    }

    public Excepcion_blanco(String message, Throwable cause) {
        super(message, cause);
    }

    public Excepcion_blanco(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
