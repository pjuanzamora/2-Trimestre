package herenciaBebidas;

public class Almacen {

	private Bebida almacen[][];
	private String nombre;
	
	public Almacen(String nombre) {
		this.nombre = nombre;
		almacen = new Bebida[5][5];
		almacen[0][0] = new Azucarada("Cocacola", 10, 12, true);
		almacen[2][4] = new Azucarada("Cocacola", 10, 12, false);
	}
	
	public float calcularPrecioTotal() {
		float precioTotal=0;
		
		for (Bebida[] bebidas : almacen) {
			for (Bebida bebida : bebidas) {
				if (bebida != null && bebida instanceof Agua) {
					precioTotal+=bebida.getPrecio();
				}
			}
		}
		return precioTotal;
	}
	
	
}
