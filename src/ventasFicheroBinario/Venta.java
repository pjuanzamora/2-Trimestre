package ventasFicheroBinario;

public class Venta {

	private String cliente;
	private int cod;
	private int cantidad;
	private double precio;
	
	public Venta(String cliente, int cod, int cantidad, double precio) {
		this.cliente = cliente;
		this.cod = cod;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Venta [cliente=" + cliente + ", cod=" + cod + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
}
