package pod.one.exceptions;

public class PasswordNotStrongException {
	private String message;
	
	public PasswordNotStrongException() {
		message = "Password Not Strong Exception";
	}

	public PasswordNotStrongException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "PasswordNotStrongException [message=" + message + "]";
	}
	
}
