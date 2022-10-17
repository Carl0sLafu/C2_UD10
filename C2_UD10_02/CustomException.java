package C2_UD10_02;

public class CustomException extends Exception {

	private int exceptionCode;
	
	public CustomException () {
		
	}
	
	public CustomException (int exceptionCode) {
		
		this.exceptionCode = exceptionCode;
		
	}
	
	@Override
	public String getMessage() {
		
		String message = "Esto es un objeto Exception";
		
		return message;
		
	}
	
}
