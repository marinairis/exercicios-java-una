package Pratica09_Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Em linguagem de programação Java, implemente um algoritmo para efetuar a
		 * divisão entre dois números inteiros. No método “main” da classe principal,
		 * leia os dois números e efetue a divisão. Realize o tratamento de exceção:
		 * empregue uma ArithmeticException. Os números devem ser lidos a partir do
		 * teclado
		 */
		Scanner teclado = new Scanner(System.in);

		try {

			System.out.println("Informe dois númeors INTEIROS para serem dividos:\n");
			int num1, num2;
			double divisao = 0;

			System.out.println("Informe o Primeiro número:");
			num1 = teclado.nextInt();

			System.out.println("Informe o Segundo número:");
			num2 = teclado.nextInt();

			divisao = ((double) num1 / num2);

			System.out.format("A divisão dos números " + num1 + " e " + num2 + " é igual a:" + "\n %.2f", divisao);

		} catch (ArithmeticException Divisao_zero) {

			System.err.println("\nDivisão inválida, número dividido por zero.");

		} catch (InputMismatchException input) {

			System.err.println("\nNúmero inválido." + "\nInforme somente números INTEIROS!!!");

		} finally {

			System.out.println("\nPrograma finalizado!");
			teclado.close();
		}

	}

}