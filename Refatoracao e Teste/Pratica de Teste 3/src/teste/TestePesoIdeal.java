package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CalculosABC.PesoIdeal;


public class TestePesoIdeal {
	private PesoIdeal objPesoIdeal;
	
	@Before
	public void setUp() throws Exception {
		objPesoIdeal = new PesoIdeal();
	}

	@Test
	public void testClassificaçãoPeso() {
		String resultado  = objPesoIdeal.classificaçãoPeso(72, 1.87);
		assertEquals("Normal", resultado );
		
		resultado  = objPesoIdeal.classificaçãoPeso(64, 1.87);
		assertEquals("Abaixo do peso", resultado );
		
		resultado  = objPesoIdeal.classificaçãoPeso(72, 1.60);
		assertEquals("Sobrepeso", resultado );
		
		resultado  = objPesoIdeal.classificaçãoPeso(89, 1.60);
		assertEquals("Obesidade", resultado );
		
		resultado  = objPesoIdeal.classificaçãoPeso(112, 1.60);
		assertEquals("Obesidade Mórbida", resultado );
		
	}

	
	@Test
	public void testPesoIdeal() {
		double resultado  = objPesoIdeal.pesoIdeal("f", 8, 1.40);
		assertEquals(25, resultado , 0);
		
		resultado  = objPesoIdeal.pesoIdeal("f", 19, 1.76);
		assertEquals(65.0496, resultado , 0);
		
		resultado  = objPesoIdeal.pesoIdeal("f", 65, 1.76);
		assertEquals(82.0864, resultado , 0);
		
		resultado  = objPesoIdeal.pesoIdeal("f", 70, 1.76);
		assertEquals(78.36928, resultado , 0);
		
		resultado  = objPesoIdeal.pesoIdeal("f", 75, 1.76);
		assertEquals(80.84736, resultado , 0.1);
		
		resultado  = objPesoIdeal.pesoIdeal("f", 80, 1.76);
		assertEquals(73.41312, resultado , 0.1);
		
		resultado  = objPesoIdeal.pesoIdeal("f", 86, 1.76);
		assertEquals(71.55456, resultado , 0.1);
		
		
		resultado  = objPesoIdeal.pesoIdeal("m", 19, 1.66);
		assertEquals(60.6232, resultado , 0.1);
		
		resultado  = objPesoIdeal.pesoIdeal("m", 65, 1.66);
		assertEquals(66.96108, resultado , 0.1);
		
		resultado  = objPesoIdeal.pesoIdeal("m", 70, 1.66);
		assertEquals(69.16556, resultado , 0);
		
		resultado  = objPesoIdeal.pesoIdeal("m", 75, 1.66);
		assertEquals(68.61444, resultado , 0.1);
		
		resultado  = objPesoIdeal.pesoIdeal("m", 80, 1.66);
		assertEquals(65.30772, resultado , 0.1);
		
		resultado  = objPesoIdeal.pesoIdeal("m", 86, 1.66);
		assertEquals(63.65436, resultado , 0.1);
	}

}
