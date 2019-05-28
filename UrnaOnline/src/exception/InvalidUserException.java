package exception;

import javax.servlet.ServletException;

@SuppressWarnings("serial")
public class InvalidUserException extends ServletException {
	public InvalidUserException(String message) {
		super(message);
		System.out.println("chegou aqui no erro?");
	}

}
