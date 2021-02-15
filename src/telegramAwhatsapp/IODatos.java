package telegramAwhatsapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IODatos {
	private File f;
	private FileReader fr;
	private Scanner leer;
	private FileWriter fw;
	private PrintWriter escribir;
	
	public IODatos() {
		this.f = null;
		this.fr = null;
		this.leer = null;
		this.fw = null;
		this.escribir = null;
	}
	
	public Mensaje[] cargarMensajesTelegram(String nombreFichero) {
		Mensaje vMensajes[] = new Mensaje[10];
		
		f = new File(nombreFichero);
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
			int pos = 0;
			while(leer.hasNext()) {
				String linea = leer.nextLine();
				vMensajes[pos] = new Mensaje(linea);
				pos++;
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
		
		return vMensajes;  
	}
	
	
	public void guardarDatos(Mensaje[] vMensajes, String nombreFichero) {
		
		f = new File(nombreFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fw = new FileWriter(f);
			escribir = new PrintWriter(fw);
			
			for (Mensaje m : vMensajes) {
				if (m!=null) {
					escribir.println(m.mensajeWhatsapp());
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				escribir.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    
		
	}
	
	
}
