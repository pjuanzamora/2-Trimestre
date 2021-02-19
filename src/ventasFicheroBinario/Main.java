package ventasFicheroBinario;

public class Main {

	private static double calcularTotalCliente(String nombreCliente, Venta[] vVentas) {
		double total = 0;

		for (Venta venta : vVentas) {
			if (venta != null && venta.getCliente().equalsIgnoreCase(nombreCliente)) {
				total += venta.getPrecio() * venta.getCantidad();
			}
		}

		return total;
	}

	private static int calcularClientesDiferentes(Venta[] vVentas) {
		int total = 0;
		String[] vNombres = new String[vVentas.length];

		for (Venta venta : vVentas) {
			if (venta != null) {
				for (int i = 0; i < vNombres.length; i++) {
					if (vNombres[i] != null) {
						if (venta.getCliente().equalsIgnoreCase(vNombres[i])) {
							break;
						}
					} else {
						total++;
						vNombres[i] = venta.getCliente();
						break;
					}
				}
			} else {
				break;
			}
		}

		return total;
	}

	public static void main(String[] args) {
		Venta[] vVentas = IODatos.cargarDatos("ventas.dat");

		double total = calcularTotalCliente("juan", vVentas);
		System.out.println("El total de ventas a juan es " + total);

		System.out.println("Clientes de programa = " + calcularClientesDiferentes(vVentas));
		/*
		 * vVentas[0] = new Venta("Juan", 1, 1, 10); 
		 * vVentas[1] = new Venta("Juan", 1, 2, 20);
		 *  vVentas[2] = new Venta("Pepe", 2, 1, 10);
		 *   vVentas[3] = new Venta("Jose", 1, 1, 10);
		 *    vVentas[4] = new Venta("Isa", 1, 1, 10);
		 */

		// IODatos.guardarDatos("ventas.dat", vVentas);

	}

}
