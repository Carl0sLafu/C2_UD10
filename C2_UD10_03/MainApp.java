package C2_UD10_03;

public class MainApp {

	public static void main(String[] args) {
		
		RandomNumber i = new RandomNumber();
		
		try {
			
			System.out.println("Generando n�mero aleatorio...");
			System.out.println("El n�mero aleatorio generado es: " + i.getNumber());
			throw i;
			
		} catch (Exception e) {
			
			System.out.println(i.getMessage());
			
		}

	}

}
