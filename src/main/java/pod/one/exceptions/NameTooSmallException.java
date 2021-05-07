package pod.one.exceptions;

public class NameTooSmallException extends Exception{
	private String message;
	
	public NameTooSmallException() {
		message = "Name Too Small Exception";
	}
	
	public NameTooSmallException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "NameTooSmallException [message=" + message + "]";
	}
	
}
