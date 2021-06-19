package Pratica09_Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Em linguagem de programa��o Java, implemente um algoritmo para efetuar a
		 * divis�o entre dois n�meros inteiros. No m�todo �main� da classe principal,
		 * leia os dois n�meros e efetue a divis�o. Realize o tratamento de exce��o:
		 * empregue uma ArithmeticException. Os n�meros devem ser lidos a partir do
		 * teclado
		 */
		Scanner teclado = new Scanner(System.in);

		try {

			System.out.println("Informe dois n�meors INTEIROS para serem dividos:\n");
			int num1, num2;
			double divisao = 0;

			System.out.println("Informe o Primeiro n�mero:");
			num1 = teclado.nextInt();

			System.out.println("Informe o Segundo n�mero:");
			num2 = teclado.nextInt();

			divisao = ((double) num1 / num2);

			System.out.format("A divis�o dos n�meros " + num1 + " e " + num2 + " � igual a:" + "\n %.2f", divisao);

		} catch (ArithmeticException Divisao_zero) {

			System.err.println("\nDivis�o inv�lida, n�mero dividido por zero.");

		} catch (InputMismatchException input) {

			System.err.println("\nN�mero inv�lido." + "\nInforme somente n�meros INTEIROS!!!");

		} finally {

			System.out.println("\nPrograma finalizado!");
			teclado.close();
		}

	}

}