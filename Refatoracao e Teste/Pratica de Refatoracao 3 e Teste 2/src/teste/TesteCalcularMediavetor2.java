package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import principal.calcularMedia;

public class TesteCalcularMediavetor2 {
	calcularMedia vet2;
	
	@Before
	public void setUp() throws Exception {
		vet2 = new calcularMedia();
	}

	@Test
	public void testCalcuMedia() {
		double valor = vet2.calcuMedia(865, 564, 43, 12);
		assertEquals(371, valor, 0);
	}
}
