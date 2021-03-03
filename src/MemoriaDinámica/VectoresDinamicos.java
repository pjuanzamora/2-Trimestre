package MemoriaDin�mica;

import java.util.ArrayList;
import java.util.Iterator;


public class VectoresDinamicos {

	public static void main(String[] args) {
		//Declaraci�n e inicializaci�n Vector dinamico
		ArrayList<String> vNombres = new ArrayList();

		//Asignaci�n
		vNombres.add("Juan");
		vNombres.add("Pepe");
		vNombres.add("Ana");
		
		
		//Guardar en una posici�n determinado
		vNombres.add(0, "Jose");
		
		//Sobreescribir un dato en una posici�n
		vNombres.set(0, "Kasper");
		
		//Borrar dato
		//vNombres.remove(0);
		vNombres.remove("Kasper");
		
		//Ver el tama�o del vector
		System.out.println(vNombres.size());
		
		//Buscar un dato
		int pos = vNombres.indexOf("Pepe");
		vNombres.set(pos, "Nuevo");
		
		/*for (String s : vNombres) {
			System.out.println(s);
		}*/
		String dato = "Nuevo";
		for (int i = 0; i < vNombres.size(); i++) {
			if (vNombres.get(i).equalsIgnoreCase(dato)){
				vNombres.set(i, "Viejo");
			}
		}
		
		Iterator it = vNombres.iterator();
		while (it.hasNext()) {
			String dato1 = (String) it.next();
			if (dato1.equalsIgnoreCase("Ana")) {
				it.remove();
			}
			
		}
		
		//Mostrar la informaci�n
		System.out.println(vNombres);
		
	}

}
