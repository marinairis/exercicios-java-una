package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import loja.Relatorio;

public class TesteAplicaDesconto {
	Relatorio produto;
	
	@Before
	public void setUp() throws Exception {
		produto = new Relatorio();
	}
	
	@Test
	public void testAplicaDesconto() {
		 double valor;
		valor = produto.aplicaDesconto(102.19);
		assertEquals(97.0805, valor, 0.0001);
		
	}

}
