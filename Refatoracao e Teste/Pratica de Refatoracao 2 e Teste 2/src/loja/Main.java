package loja;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("Arroz", 5, 18.75);
		Produto p2 = new Produto("Feijão", 1, 4.95);
		Produto p3 = new Produto("Leite", 1, 3.49);
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);

		double somaprecos1, desconto1, totalFinal;

		/*
		 * Foram refatoradas os calculos de processamento na classe main para a classe
		 * relatorio.
		 */

		Relatorio produto1 = new Relatorio();
		somaprecos1 = produto1.calculaSomatorioPrecos(produtos);

		desconto1 = produto1.aplicaDesconto(somaprecos1);

		totalFinal = produto1.adicionaTaxaEntrega(desconto1);

		System.out.println(totalFinal);

	}
}