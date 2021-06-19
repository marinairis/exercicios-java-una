package Pratica09_Exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Altere o algoritmo da atividade anterior. Nesta nova vers�o, crie duas
		 * classes: 
		 * a. A classe principal que cont�m o m�todo �main� e faz o tratamento
		 * da exce��o. 
		 * b. A classe secund�ria que cont�m o m�todo que efetua a divis�o.
		 * Tal m�todo deve repassar (throws) a exce��o do tipo ArithmeticException
		 * quando o dividendo for igual a zero ou quando o divisor for menor que 10.
		 * c.Os n�meros devem ser lidos a partir do teclado.
		 */

		Scanner teclado = new Scanner(System.in);

		try {

			System.out.println("Informe dois n�meros INTEIROS para serem dividos:\n");
			int num1, num2;

			System.out.println("Informe o Primeiro n�mero:");
			num1 = teclado.nextInt();

			System.out.println("Informe o Segundo n�mero:");
			num2 = teclado.nextInt();

			Divisao dividir = new Divisao();
			dividir.operacaoDividir(num1, num2);

			System.out.format("A divis�o dos n�meros " + num1 + " e " + num2 + " � igual a:" + "\n %.2f",
					dividir.operacaoDividir(num1, num2));

		} catch (InputMismatchException input) {

			throw new ArithmeticException("N�mero inv�lido." + " Informe somente numeros INTEIROS!");

		} finally {

			System.out.println("\nPrograma finalizado!");
			teclado.close();
		}

	}

}
