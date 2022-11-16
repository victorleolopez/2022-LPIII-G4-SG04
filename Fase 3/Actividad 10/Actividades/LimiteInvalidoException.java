public class LimiteInvalidoException extends Exception {
    public LimiteInvalidoException() {
    }

    public LimiteInvalidoException(String message) {
        super(message);
    }

    public LimiteInvalidoException(Throwable cause) {
        super(cause);
    }

    public LimiteInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public LimiteInvalidoException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
