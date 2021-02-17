package PasswordFicherosBinario;

public class Main {

	public static void main(String[] args) {
		/*
		Password vPassword[] = new Password[10];
		vPassword[0] = new Password("Juan", 1, false);
		vPassword[1] = new Password("Pepe", 2, true);
		vPassword[2] = new Password("Adelin", 3, true);
		vPassword[3] = new Password("Jordi", 4, false);
		*/
		//Password vPassword[] = IODatos.cargarDatos("pass.dat");
		Password vPassword[] = IODatos.cargarObjetos("objetos2.dat");
		//Mostarlos por pantalla
		for (Password p : vPassword) {
			if (p!=null)
				System.out.println(p);
		}
		
		//IODatos.guardarDatos("pass.dat", vPassword);
		//IODatos.guardarObjetos("objetos2.dat", vPassword);
	}

}
