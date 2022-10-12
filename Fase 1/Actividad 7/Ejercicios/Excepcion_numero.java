public class Excepcion_numero extends Exception  {

    public Excepcion_numero() {
    }

    public Excepcion_numero(String message) {
        super(message);
    }

    public Excepcion_numero(Throwable cause) {
        super(cause);
    }

    public Excepcion_numero(String message, Throwable cause) {
        super(message, cause);
    }

    public Excepcion_numero(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
