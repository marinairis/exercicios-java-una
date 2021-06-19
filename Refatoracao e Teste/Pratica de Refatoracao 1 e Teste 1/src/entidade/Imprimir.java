package entidade;

public class Imprimir {

	/*
	 * Este método de refatoração utilizado foi " acrescentar parâmetro" para que se
	 * fosse possível evitar a repetição de código "Print"
	 */

	public void imprimirCoeficiente(String x) {

		System.out.println("\n_________________________________________");
		System.out.println("Informe um valor para o coeficiente de " + x + " :");
	}

}
