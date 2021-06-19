package loja;

import java.util.ArrayList;

public interface InterfaceRelatorio {
	
	/*
	 * Esta interface foi criada para listar quais os m�todos que devem ser 
	 * implementados na classe Relat�rio
	 */

	public double calculaSomatorioPrecos(ArrayList<Produto> produtos);
	
	public double aplicaDesconto(double valor);
	
	public double adicionaTaxaEntrega(double total);
}
