package horasNocheVieja;

public class Tiempo {

	private int horas;
	private int minutos;
	private final int MINUTOS_TOTAL_DIA = 1440;
	
	//Dato con formato XX:XX
	public Tiempo(String dato) {
		String hora, minutos;
		try {
			hora = dato.substring(0, 2);
			minutos = dato.substring(3);
			this.horas = Integer.parseInt(hora);
			this.minutos = Integer.parseInt(minutos);
			if (horas > 23 || horas < 0 || this.minutos < 0 || this.minutos > 59) {
				this.horas = 0;
				this.minutos = 0;
			}
		}catch (Exception e) {
			System.out.println("Error en el formato");
			this.horas = 0;
			this.minutos = 0;
			
		}
		
	}
	
	public int minutosDiferencia() {
		int minutosTotales = horas * 60 + minutos;
		
		return MINUTOS_TOTAL_DIA - minutosTotales;
	}

	//Devuelve false si falla
	public boolean esCorrecto() {
		if (horas == 0 && minutos == 0) {
			return false;
		}
		return true;
	}
	
	public int getHoras() {
		return horas;
	}
	public int getMinutos() {
		return minutos;
	}
	
}
