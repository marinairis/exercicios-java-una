package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import principal.calcularMedia;

public class TesteCalcularMediaVetor1 {
	calcularMedia vet1;
	
	@Before
	public void setUp() throws Exception {
		vet1 = new calcularMedia();
	}

	@Test
	public void testCalcuMedia() {
		double valor = vet1.calcuMedia(90, 88, 78, 76);
		assertEquals(83, valor, 0);
	}

}