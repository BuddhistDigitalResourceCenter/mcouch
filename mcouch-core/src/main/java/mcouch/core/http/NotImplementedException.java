package mcouch.core.http;

public class NotImplementedException extends RuntimeException {
	private static final long serialVersionUID = 4096483018000222823L;

	public NotImplementedException() {
    }

    public NotImplementedException(String message) {
        super(message);
    }
}