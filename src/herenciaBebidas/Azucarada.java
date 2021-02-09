package herenciaBebidas;

public final class Azucarada extends Bebida{
	
	private float azucar;
	private boolean promocion;
	
	public Azucarada(String nombre, float precio, float azucar, boolean promocion) {
		super(nombre, precio);
		this.azucar = azucar;
		this.promocion = promocion;
	}
	
	@Override
	public float getPrecio() {
		if (promocion) {
			return super.getPrecio() * 0.9f;
		}else {
			return super.getPrecio();
		}
		
	}
	
	
}
