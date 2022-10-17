package C2_UD10_02;

public class MainApp {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Mensaje mostrado por pantalla");
			throw new CustomException();
			
		} catch (Exception e) {
			
			System.out.println("Excepcion capturada con mensaje: " + e.getMessage());
			
		} finally {
			
			System.out.println("Programa terminado");
			
		}

	}

}
