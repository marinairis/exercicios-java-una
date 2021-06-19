package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import loja.Produto;
import loja.Relatorio;

public class TesteCalculaSomatorioPreco {
	Relatorio produto;
	
	@Before
	public void setUp() throws Exception {
		produto = new Relatorio();
	}

	@Test
	public void testCalculaSomatorioPrecos() {
		Produto p1 = new Produto("Arroz", 5, 18.75);
		Produto p2 = new Produto("Feijão", 1, 4.95);
		Produto p3 = new Produto("Leite", 1, 3.49);
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		 double valor;
		valor = produto.calculaSomatorioPrecos(new ArrayList<Produto>(produtos));
		
		assertEquals(102,19, valor);
	}

}
