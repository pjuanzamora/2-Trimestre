package horasNocheVieja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTiempo {
	
	private Tiempo t;
	
	@Test
	void comprobarConstructor() {
		t = new Tiempo("23:00");
		
		if (!t.esCorrecto()) {
			fail();
		}
	}
	
	@Test
	void comprobarConstructor1() {
		t = new Tiempo("aa:bb");
		
		if (t.esCorrecto()) {
			fail();
		}
	}

}
