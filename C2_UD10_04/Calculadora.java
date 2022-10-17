package C2_UD10_04;

public class Calculadora extends Exception {

	//Constructor
	public Calculadora() {}
	
	public double Suma(double a, double b) {
		
		return a+b;
		
	}
	
	public double Resta(double a, double b) {
		
		return a-b;
		
	}

	public double Plus(double a, double b) {
	
		return a*b;
	
	}

	public double Pow(double a) {
	
		return a*a;
	
	}
	
	public double Sqrt(double a) {
		
		try {
			
			return Math.sqrt(a);
			
		} catch (ArithmeticException e) {
			
			System.out.println(getMessage());
			System.out.println("Has introducido una operación de un número imaginario");
			return 0;
			
		}
	
	}
	
	public double Cbrt(double a) {
		
		return Math.cbrt(a);
	
	}
	
	public double Division(double a, double b) {
		
		try {
			
			return a/b;
			
		} catch (ArithmeticException e) {
			
			System.out.println(getMessage());
			System.out.println("Has intentado dividir por 0");
			return 0;
			
		}
	
	}
	
	@Override
	public String getMessage() {
		
		String message = "Ha ocurrido una excepción.";
		
		return message;
		
	}
	
}
