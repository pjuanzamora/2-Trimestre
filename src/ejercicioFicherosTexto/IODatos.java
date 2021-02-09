package ejercicioFicherosTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

	public static void mostrar(String nombreFichero, int longitudLinea) {
		File f = new File(nombreFichero);
		FileReader fr =null;
		Scanner leer = null;
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		try {
			fr = new FileReader(f);
			leer = new Scanner(fr);
			
			while(leer.hasNext()) {
				String linea = leer.nextLine();
				//Tratamos las lineas
				formatearLinea(linea,longitudLinea);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				leer.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static void formatearLinea(String linea, int longitudLinea) {
		Persona p;
		String nombre, apellido;
		int nip;
		nip = Integer.parseInt(linea.substring(0, 6));
		//Necesitamos sacar el Nombre y el apellido
		
		p = new Persona(nombre,apellido,nip);
		System.out.println(p.mostarDatos(longitudLinea));
	}
	
}
