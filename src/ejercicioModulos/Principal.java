package ejercicioModulos;

import java.util.Scanner;

public class Principal {

	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		do {
			System.out.println("Men� Gesti�n Curso");
			System.out.println("1- A�adir un nuevo m�dulo");
			System.out.println("2- Ver todos los m�dulos");
			System.out.println("3- Ver horas del curso");
			System.out.println("4- Salir");
			try {
				opc = leer.nextInt();
			}catch (Exception e) {
				opc = 0;
				leer = new Scanner(System.in);
				System.out.println("No puedese escribir ese dato");
			}
			
		} while (opc < 1 || opc > 4);
		
		return opc;
	}

	public static void main(String[] args) {

		pintaMenu();
		Curso c = new Curso("1� DAW", "Jos� Micolau");
		System.out.println(c.toString());

	}

}
