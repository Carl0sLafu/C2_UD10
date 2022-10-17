package C2_UD10_01;

public class RandomNumberGenerator {

	private int number = (int)Math.floor(Math.random() * (499)) + 1;
	private int intentosParaAdivinar = 0;
	
	public RandomNumberGenerator() {}
	
	public boolean heAcertado(int num) {
		
		if (num == number) {
			
			return true;
			
		} else {
			
			pista(num);
			intentosParaAdivinar++;
			return false;
			
		}
		
	}
	
	private void pista(int num) {
		
		System.out.println("Te has quedado " + (num>number?"arriba.":"corto."));
		
	}

	public int getIntentosParaAdivinar() {
		
		return intentosParaAdivinar;
		
	}
	
	
	
}
