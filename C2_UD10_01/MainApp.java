package C2_UD10_01;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		RandomNumberGenerator adivina = new RandomNumberGenerator();
		Scanner keyboard = new Scanner(System.in);
		boolean acertado = false;
		
		do {
			
			try {
			
				System.out.println("Introduce n�mero:");
				System.out.print("- ");
				int intentoNumero = keyboard.nextInt();
				acertado = adivina.heAcertado(intentoNumero);
			
			} catch (Exception e) {
			
				keyboard.nextLine();
				System.out.println("Has introducido algo que no es un n�mero entero.");
			
			}
		
		} while (!acertado);
		
		keyboard.close();
		
		System.out.println("Has acertado, te ha tomado " + adivina.getIntentosParaAdivinar() + " intentos");

	}

}
