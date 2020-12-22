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
	
	//3 mayusculas - 2 minusculas - 6 números
	public boolean esFuerte() {
		String letraMin = "abcdefghijklemnñopqrstuvwxyz";
		String letraMay = letraMin.toUpperCase();
		String numeros = "0123456789";
		int contLetraMin=0, contLetraMay=0, contNumeros=0;
		
		for (int i = 0; i < longitud; i++) {
			//Comparo con las letras minúsculas y mayusculas
			for (int j = 0; j < letraMin.length(); j++) {
				if (contrasena.substring(i, i+1).equals(letraMin.substring(j,j+1))) {
					contLetraMin++;
				}
				if (contrasena.substring(i, i+1).equals(letraMay.substring(j,j+1))) {
					contLetraMay++;
				}
			}
			
			//Comparo con los números
			for (int j = 0; j < numeros.length(); j++) {
				if (contrasena.substring(i, i+1).equals(numeros.substring(j,j+1))) {
					contNumeros++;
				}
			}
		}
		
		if ((contLetraMay > 2) && (contLetraMin > 1) && (contNumeros > 5 )) {
			return true;
		}
		
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
