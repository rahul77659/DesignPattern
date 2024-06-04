package BuilderDesignPattern;

public class InvalidgradYearException extends RuntimeException{
    public InvalidgradYearException() {
    }

    public InvalidgradYearException(String message) {
        super(message);
    }

    public InvalidgradYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidgradYearException(Throwable cause) {
        super(cause);
    }

    public InvalidgradYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
