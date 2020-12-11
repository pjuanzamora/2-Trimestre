package recreativos;

public class Juego {
	
	//Atributos de la clase
	private String nombre;
	private int record;
	private boolean multijugador;
	
	//M�todos de la clase ------
	
	public Juego(String nombre) {
		this.nombre = nombre;
		this.record = 0;
		multijugador = false;
	}
	
	public void ponerRecord(int puntuacion) {
		record = puntuacion;
	}
	
	public void setRecord(int record) {
		this.record = record;
	}

	public String getNombre() {
		return nombre;
	}


	public int getRecord() {
		return record;
	}

	

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	@Override
	public String toString() {
		return  nombre + " --- " + record;
	}

	
	
	
	
}
