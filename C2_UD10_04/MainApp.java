package C2_UD10_04;

public class MainApp {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		double a = 12;
		double b = 6;
		double c = 0;
		double d = -3;
		
		double suma = calculadora.Suma(a, b);
		double resta = calculadora.Resta(a, b);
		double plus = calculadora.Plus(a, b);
		double division = calculadora.Division(a, c);
		double potencia = calculadora.Pow(a);
		double sqrt = calculadora.Sqrt(d);
		double cbrt = calculadora.Cbrt(d);
		
		System.out.println(division);
	}

}
