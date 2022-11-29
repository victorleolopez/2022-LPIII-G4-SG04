public class ObjectNoExist extends Exception {

	public ObjectNoExist() {
		super("Error: El contacto no existe");
	}

	public ObjectNoExist(String message) {
		super(message);
	}

	public ObjectNoExist(Throwable cause) {
		super(cause);
	}

	public ObjectNoExist(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNoExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
