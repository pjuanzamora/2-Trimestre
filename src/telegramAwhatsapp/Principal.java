package telegramAwhatsapp;

public class Principal {

	public static void main(String[] args) {
		IODatos cargar = new IODatos();
		
		Mensaje vMensajes[] = cargar.cargarMensajesTelegram("telegram.txt");
	
		for (Mensaje mensaje : vMensajes) {
			if (mensaje!= null)
				System.out.println(mensaje.mensajeWhatsapp());
		}
		
		cargar.guardarDatos(vMensajes, "Whatsapp.txt");

	}

}
