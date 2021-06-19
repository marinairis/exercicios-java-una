package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CalculosABC.NecessidadeDiaria;

public class TesteNecessidadeDiaria {

	private NecessidadeDiaria objNecessidadeDiaria;
	
	@Before
	public void setUp() throws Exception {
		objNecessidadeDiaria = new NecessidadeDiaria();
	}

	@Test
	public void testCalculaTmb() {
		
		double resultado = objNecessidadeDiaria.calculaTmb(15, 42, "feminino");
		assertEquals(1258.4, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaTmb(25, 69, "feminino");
		assertEquals(1510.3, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaTmb(31, 69, "feminino");
		assertEquals(1429.3, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaTmb(67, 69, "feminino");
		assertEquals(1320.5, resultado, 0);
		
		
		resultado = objNecessidadeDiaria.calculaTmb(15, 50, "masculino");
		assertEquals(1526, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaTmb(25, 89, "masculino");
		assertEquals(2040.7, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaTmb(31, 89, "masculino");
		assertEquals(1653.3, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaTmb(67, 89, "masculino");
		assertEquals(1688.5, resultado, 0);
	}

	@Test
	public void testCalculaFA() {
		double resultado = objNecessidadeDiaria.calculaFA("f", 1);
		assertEquals(1.2, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("f", 2);
		assertEquals(1.3, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("f", 3);
		assertEquals(1.45, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("f", 4);
		assertEquals(1.5, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("f", 5);
		assertEquals(1.7, resultado, 0);
		
		
		resultado = objNecessidadeDiaria.calculaFA("m", 2);
		assertEquals(1.4, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("m", 3);
		assertEquals(1.5, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("m", 4);
		assertEquals(1.6, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("m", 5);
		assertEquals(1.8, resultado, 0);
		
		resultado = objNecessidadeDiaria.calculaFA("m", 7);
		assertEquals(0, resultado, 0);
	}

	@Test
	public void testCalculoCalorias() {
		double resultado = objNecessidadeDiaria.calculoCalorias(1429.3, 1.2);
		assertEquals( 1715.16, resultado, 0.1);
	}

}
