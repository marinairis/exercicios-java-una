package Pratica09_Exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Altere o algoritmo da atividade anterior. Nesta nova versão, crie duas
		 * classes: 
		 * a. A classe principal que contém o método “main” e faz o tratamento
		 * da exceção. 
		 * b. A classe secundária que contém o método que efetua a divisão.
		 * Tal método deve repassar (throws) a exceção do tipo ArithmeticException
		 * quando o dividendo for igual a zero ou quando o divisor for menor que 10.
		 * c.Os números devem ser lidos a partir do teclado.
		 */

		Scanner teclado = new Scanner(System.in);

		try {

			System.out.println("Informe dois números INTEIROS para serem dividos:\n");
			int num1, num2;

			System.out.println("Informe o Primeiro número:");
			num1 = teclado.nextInt();

			System.out.println("Informe o Segundo número:");
			num2 = teclado.nextInt();

			Divisao dividir = new Divisao();
			dividir.operacaoDividir(num1, num2);

			System.out.format("A divisão dos números " + num1 + " e " + num2 + " é igual a:" + "\n %.2f",
					dividir.operacaoDividir(num1, num2));

		} catch (InputMismatchException input) {

			throw new ArithmeticException("Número inválido." + " Informe somente numeros INTEIROS!");

		} finally {

			System.out.println("\nPrograma finalizado!");
			teclado.close();
		}

	}

}
