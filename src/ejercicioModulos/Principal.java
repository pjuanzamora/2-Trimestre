package ejercicioModulos;

public class Principal {

	public static void main(String[] args) {
		int suma=0;
		Modulo vModulos[] = new Modulo[10];
		Modulo m = new Modulo("Programación", "PRG", 300);
		
		vModulos[0] = m;
		vModulos[4] = new Modulo("Entornos", "ED", 100);
		// [m, null, null, null, ed, --.......]
		
		for (Modulo mo : vModulos) {
			if (mo != null) {
				suma += mo.getNumHoras();
				System.out.println(mo.toString());
			}
		}
		
		
		System.out.println("Numero de horas del ciclo: " + suma);

	}

}
