package pod.one.exceptions;

public class EmailNotValidException extends Exception {
	
	private String message;
	
	public EmailNotValidException() {
		this.message = "Email Not Valid Exception";
	}

	public EmailNotValidException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmailNotValidException [message=" + message + "]";
	}

}
