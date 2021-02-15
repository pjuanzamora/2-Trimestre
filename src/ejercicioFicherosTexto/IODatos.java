package ejercicioFicherosTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

	public static void mostrar(String nombreFichero, int longitudLinea) {
		File f = new File(nombreFichero);
		
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		try (FileReader fr = new FileReader(f);
			 Scanner leer = new Scanner(fr)) {
			
			while(leer.hasNext()) {
				String linea = leer.nextLine();
				//Tratamos las lineas
				formatearLinea(linea,longitudLinea);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
	
	private static void formatearLinea(String linea, int longitudLinea) {
		Persona p;
		String nombre, apellido, aux, puntos="";
		int pos;
		int nip;
		nip = Integer.parseInt(linea.substring(0, 6));
		//Necesitamos sacar el Nombre y el apellido
		aux = linea.substring(7).trim();
		pos = aux.indexOf(",");
		apellido = aux.substring(0, pos+1);
		nombre = aux.substring(pos+2);
		
		for (int i=0; i<(longitudLinea-nombre.length()-apellido.length()-
				Integer.toString(nip).length());i++) {
			puntos += ".";
		}
		
		System.out.println(apellido + " " + nombre + " " + puntos + " " +nip);
		
		//p = new Persona(nombre,apellido,nip);
		//System.out.println(p.mostarDatos(longitudLinea));
	}
	
}
