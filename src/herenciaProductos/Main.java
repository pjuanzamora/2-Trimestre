package herenciaProductos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p[][] = new Producto[10][10];
		p[0][0] = new Producto("Caramelo", 10);
		p[4][0] = new Producto("Caramelo1", 10);
		p[2][3] = new Producto("Caramelo2", 10);
		for (Producto[] fila : p) {
			for(Producto producto: fila) {
				if (producto!=null)
					System.out.println(producto.toString());
			}
		}
		
		/*
		p[0] = new Perecedero("Caramelo", 10.5f, 3);
		
		System.out.println(p[0].calcular(1));
		
		Producto nuevo = new Producto(p[0]);
		nuevo.setNombre("Nuevo");
		System.out.println(p[0].getNombre());*/
	}

}
