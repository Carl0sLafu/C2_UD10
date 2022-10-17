package C2_UD10_03;

import java.util.Random;

public class RandomNumber extends Exception{

	private Random random = new Random();
	private int number = random.nextInt(999);
	
	public RandomNumber() {}
	
	@Override
	public String getMessage() {
		
		String message = "Es impar";
		
		if (number % 2 == 0) {
			
			message = "Es par";
			
		}
		
		return message;
		
	}
	
	public int getNumber() {
		
		return number;
		
	}
	
}
