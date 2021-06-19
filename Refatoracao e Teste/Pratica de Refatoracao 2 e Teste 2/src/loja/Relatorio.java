package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Relatorio implements InterfaceRelatorio {

	/*
	 * Nesta classe foram implementados os métodos listados na Interfacerelatório e
	 * que foram refatorados da classe Main (principal)
	 */

	public double calculaSomatorioPrecos(ArrayList<Produto> produtos) {
		double total = 0.0;
		for (Produto produto : produtos) {
			total += produto.getPreco() * produto.getQuantidade();
		}
		return total;
	}

	public double aplicaDesconto(double total) {
		boolean clienteVIP = false;
		if (clienteVIP) {
			total *= 0.90;
		} else {
			total *= 0.95;
		}
		return total;
	}

	public double adicionaTaxaEntrega(double total) {
		DayOfWeek diaSemana = LocalDate.now().getDayOfWeek();
		if (diaSemana == DayOfWeek.SUNDAY) {
			total += 10.00;
		} else {
			total += 5.00;
		}
		return total;
	}

}
