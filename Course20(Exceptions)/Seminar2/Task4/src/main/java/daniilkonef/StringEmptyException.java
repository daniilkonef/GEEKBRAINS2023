package daniilkonef;

public class StringEmptyException extends RuntimeException {


    public StringEmptyException() {
        System.out.println("Исключение: Введена пустая строка");
    }

    public StringEmptyException(String message) {
        super(message);

    }

    public StringEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringEmptyException(Throwable cause) {
        super(cause);
    }

    public StringEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
