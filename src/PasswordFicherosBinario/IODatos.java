package PasswordFicherosBinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IODatos {

	public static void guardarDatos(String rutaFichero, Password[] datos) {
		
		File f = new File(rutaFichero);
		if (!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Password p : datos) {
				if (p!=null) {
					escribir.writeUTF(p.getUsuario());
					escribir.writeInt(p.getPassword());
					escribir.writeBoolean(p.isSegura());
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public static Password[] cargarDatos(String rutaFichero) {
		Password[] vPass = new Password[10];
		int cont=0;
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream leer = new DataInputStream(fi)){
			
			while (true) {
				String usuario = leer.readUTF();
				int pass = leer.readInt();
				boolean seguro = leer.readBoolean();
				vPass[cont] = new Password(usuario, pass, seguro);
				cont++;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Fin de lectrua del fichero");
		}
		
		return vPass;
	}
	
	public static Password[] cargarObjetos(String rutaFichero) {
		Password[] vPass = new Password[10];
		int cont=0;
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 ObjectInputStream leer = new ObjectInputStream(fi)){
			
			while (true) {
				vPass[cont] = (Password) leer.readObject();
				cont++;
			}
			//vPass = (Password[]) leer.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Fin de lectrua del fichero");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vPass;
	}
	
	public static void guardarObjetos(String rutaFichero, Password[] datos) {
		
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 ObjectOutputStream escribir = new ObjectOutputStream(fo)){
			
			for (Password p: datos) {
				if (p!=null) {
					escribir.writeObject(p);
				}
			}
			//escribir.writeObject(datos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
