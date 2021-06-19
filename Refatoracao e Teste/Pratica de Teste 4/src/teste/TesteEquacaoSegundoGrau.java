package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import entidades.ServicoEquacaoSegundoGrau;
import entidades.EquacaoSegundoGrauInterface;


public class TesteEquacaoSegundoGrau {
	ServicoEquacaoSegundoGrau ses;
	
	@Before
	public void setUp() throws Exception {
		ses = new ServicoEquacaoSegundoGrau();
		
	}

	@Test
	public void testDelta() {
		EquacaoSegundoGrauInterface Iequa = Mockito.mock(EquacaoSegundoGrauInterface.class);
		Mockito.when(Iequa.getDelta()).thenReturn(2.0);
				
		assertEquals(2.0, Iequa.getDelta()  ,0);
	}

	
	@Test
	public void testX() {
		EquacaoSegundoGrauInterface Iequa = Mockito.mock(EquacaoSegundoGrauInterface.class);
		Mockito.when(Iequa.getX()).thenReturn(4.0);
		
		ses.setEquacao(Iequa);
		
		assertEquals(4.0,ses.x(),0);
	}

	@Test
	public void testX1() {
		EquacaoSegundoGrauInterface Iequa = Mockito.mock(EquacaoSegundoGrauInterface.class);
		Mockito.when(Iequa.getX1()).thenReturn(5.0);
		
		ses.setEquacao(Iequa);
		
		assertEquals(5.0,ses.x1(),0);
	}

	@Test
	public void testX2() {
		EquacaoSegundoGrauInterface Iequa = Mockito.mock(EquacaoSegundoGrauInterface.class);
		Mockito.when(Iequa.getX2()).thenReturn(6.0);
		
		ses.setEquacao(Iequa);
		
		assertEquals(6.0,ses.x2(),0);
	}
	
	
}
