package mcouch.core.http;

public class MCouchException extends RuntimeException {
	private static final long serialVersionUID = 4388645513051181412L;

	public MCouchException(Throwable cause) {
        super(cause);
    }

    public MCouchException(String message, Throwable cause) {
        super(message, cause);
    }
}