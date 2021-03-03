package ventasFicheroBinario;

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

	public static void guardarDatos(String ruta, Venta[] vVentas) {
		File f = new File(ruta);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Venta venta : vVentas) {
				if (venta != null) {
					escribir.writeUTF(venta.getCliente());
					escribir.writeInt(venta.getCod());
					escribir.writeInt(venta.getCantidad());
					escribir.writeDouble(venta.getPrecio());
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
	
	public static void guardarObjetos(String ruta, Venta[] vVentas) {
		File f = new File(ruta);
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
			
			for (Venta venta : vVentas) {
				if (venta != null) {
					escribir.writeObject(venta);
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

	public static Venta[] cargarDatos(String ruta) {
		Venta[] vVentas = new Venta[10];
		String cliente;
		int cod, cantidad,pos=0;
		double precio;
		
		File f = new File(ruta);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream leer = new DataInputStream(fi)) {
			
			while (true) {
				cliente = leer.readUTF();
				cod = leer.readInt();
				cantidad = leer.readInt();
				precio = leer.readDouble();
				vVentas[pos] = new Venta(cliente, cod, cantidad, precio);
				pos++;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("Datos cargados de disco");
		}
		
		
		return vVentas;
	}
	
	public static Venta[] cargarObjetos(String ruta) {
		Venta[] vVentas = new Venta[10];
		String cliente;
		int cod, cantidad,pos=0;
		double precio;
		
		File f = new File(ruta);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 ObjectInputStream leer = new ObjectInputStream(fi)) {
			
			while (true) {
				
				vVentas[pos] = (Venta) leer.readObject(); 
				pos++;
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("Datos cargados de disco");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return vVentas;
	}
}
