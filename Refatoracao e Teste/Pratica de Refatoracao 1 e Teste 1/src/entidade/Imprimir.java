package entidade;

public class Imprimir {

	/*
	 * Este m�todo de refatora��o utilizado foi " acrescentar par�metro" para que se
	 * fosse poss�vel evitar a repeti��o de c�digo "Print"
	 */

	public void imprimirCoeficiente(String x) {

		System.out.println("\n_________________________________________");
		System.out.println("Informe um valor para o coeficiente de " + x + " :");
	}

}
