package C2_UD10_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	
	private int length;
	private String password;
	
	public Password() {
		
		this(8);
		
	}
	
	public Password(int length) {

		this.length = length;
		generarPassword();
		
	}
	
	//Metodos
	private void generarPassword() {
		
		//Inicializo porque si no sale null al empezar
		password = "";
		
		for (int i = 0; i < length; i++) {
			
			//Genero un numero
			int num = (int)Math.floor(Math.random() * (29));
			
			//Con esto digo que hay un 33% de que ponga numero, si no pone caracter
			if (num <= 9) {
				
				password += num; 
				
			} else {
					
				password += (char)Math.floor(Math.random() * (126 - 33) + 33);
			
			}
			
		}
		
	}
	
	public boolean esFuerte() {
		
		if (getLength() > 11) {
			
			int countMayusculas = 0;
			int countMinusculas = 0;
			int countNumbers = 0;
			
			for (int i = 0; i < getLength(); i++) {
				
				//Mayusculas
				if (getPassword().indexOf(i) <= 65 && getPassword().indexOf(i) >= 90) {
					
					countMayusculas++;
					
				}
				
				//Numbers
				if (getPassword().indexOf(i) <= 48 && getPassword().indexOf(i) >= 57) {
					
					countNumbers++;
					
				}
				
				//Minusculas
				if (getPassword().indexOf(i) <= 97 && getPassword().indexOf(i) >= 122) {
	
					countMinusculas++;
	
				}
				
			}
			
			if (countMayusculas > 2 && countMinusculas > 1 && countNumbers > 5) {
				
				return true;
				
			}
			
		} 
			
		return false;
		
	}
	
	public int getLength() {
		
		return length;
		
	}

	public void setLength(int length) {
		
		this.length = length;
		
	}

	public String getPassword() {
		
		return password;
		
	}

	@Override
	public String toString() {
		
		return "Password [length=" + length + ", password=" + password + "]";
	
	}
	
	

}
