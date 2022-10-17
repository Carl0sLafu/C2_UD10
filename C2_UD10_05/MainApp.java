package C2_UD10_05;

public class MainApp {

	public static void main(String[] args) {
		
		Password contrasena[] = new Password[10];
		boolean strong[] = new boolean[contrasena.length];
		
		for (int i = 0; i < contrasena.length; i++) {
			
			contrasena[i] = new Password(10 + i);
			System.out.println(contrasena[i].getPassword());
			
		}
		
		for (int i = 0; i < strong.length; i++) {
			
			strong[i] = contrasena[i].esFuerte();
			System.out.println("Contraseña " + (i+1) + (strong[i]?" es fuerte":" no es fuerte"));
			
		}
 
	}

}
