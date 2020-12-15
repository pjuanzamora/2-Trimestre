package controlErrores;

import java.util.Scanner;

public class Errores {

	public static void main(String[] args){

		Scanner leer = new Scanner(System.in);
		int opc = 0;
		
		do {
			
			try {
				System.out.println("1- Dime un numero");
				System.out.println("2- Dime un numero");
				System.out.println("Dime un numero");
				opc = leer.nextInt();
				
				opc = leer.nextInt();
			} catch (Exception e) {
				System.out.println("Error al leer, tienes que escribir un número");
				leer = new Scanner(System.in);
			}
			
			
		}while(opc < 1 || opc > 2);
		
		

	}

}
