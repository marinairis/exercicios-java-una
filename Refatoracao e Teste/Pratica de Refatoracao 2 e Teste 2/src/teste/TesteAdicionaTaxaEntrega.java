package teste;

import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import loja.Relatorio;

public class TesteAdicionaTaxaEntrega {
	Relatorio produto;
	
	@Before
	public void setUp() throws Exception {
		produto = new Relatorio();
	}

	@Test
	public void testAdicionaTaxaEntrega() {
		double valor;
		DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();

		valor = produto.adicionaTaxaEntrega(97.0805);

		if (diaSemana == DayOfWeek.SUNDAY) {
			assertEquals(107.0805, valor, 0.0001);
		} else {
			assertEquals(102.0805, valor, 0.0001);

		}
	}
}