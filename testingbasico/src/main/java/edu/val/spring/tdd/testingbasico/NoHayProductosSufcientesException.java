package edu.val.spring.tdd.testingbasico;

public class NoHayProductosSufcientesException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message = null;
	public NoHayProductosSufcientesException() { super(); }
	public NoHayProductosSufcientesException(String message) {
		super(message);
		this.message = message;
	}
	public NoHayProductosSufcientesException(Throwable cause)
	{
		super(cause);
	}
	@Override
	public String toString() {
		return message;
	}
}
