package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidade.Calculo;

class CalculoTest {
	Calculo objeto;

	@BeforeEach
	void setUp() throws Exception {
		objeto = new Calculo();
	}

	@Test
	void testBhaskara() {
		String valor;

		valor = objeto.bhaskara(0, 0, 0);
		assertEquals("Igualdade confirmada: 0 = 0", valor);

		valor = objeto.bhaskara(0, 0, 8);
		assertEquals("Coeficientes informados incorretamente.", valor);

		valor = objeto.bhaskara(0, 2, -8);
		assertEquals("Esta é uma equação de primeiro grau. \n " + "Raiz da equação:" + 4.0, valor);

		valor = objeto.bhaskara(10, -4, 12);
		assertEquals("Esta equação não possui raízes reais. \n delta < 0. Delta: " + (-464.0), valor);

		valor = objeto.bhaskara(4, -4, 1);
		assertEquals("Esta equação possui duas raízer reais iguais." + "\n Delta = 0" + "\n x' = x'' = " + 0.5, valor);

		valor = objeto.bhaskara(1, 6, 7);
		assertEquals("Esta equação possui duas raízes reais diferentes." + "\n Delta = " + 8.0 + "\n x' = "
				+ -1.5857864376269049 + "\n x'' = " + -4.414213562373095, valor);

	}

}
