package ExceptionHandling;

public class AgeOutOfBoundException extends RuntimeException{
	public AgeOutOfBoundException(String message)
	{
		super(message);
	}

}
