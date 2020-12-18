package paswword;

import java.util.Random;

public class Password {
	
	private int longitud;
	private String contrasena;

	public Password() {
		longitud = 11;
		contrasena = "AAAaa111111"; //Borrar luego despues de pruebas
	}

	public Password(int longitud) {
		this.longitud = longitud;
		contrasena = "";
		generarPassword();
		
	}
	
	private void generarPassword() {
		//Genero el password con la longitud
		String letraMin = "abcdefghijklemnñopqrstuvwxyz";
		String letraMay = letraMin.toUpperCase();
		String numeros = "0123456789";
		String posi = letraMin + letraMay + numeros;
		Random r = new Random();
		int aleatorio=0;
		
		for (int i = 0; i < longitud; i++) {
			aleatorio = r.nextInt(posi.length());
			contrasena += posi.substring(aleatorio, aleatorio+1);
		}
		
	}
	
	public boolean esFuerte() {
		
		
		return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}
	
	
	
}
