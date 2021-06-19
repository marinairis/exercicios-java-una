package Pratica02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/* Em linguagem de programa��o Java, implemente um algoritmo que retorne o 
		 * valor da fun��o abaixo ap�s receber um valor qualquer de entrada:
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo responda 'Sim' ou 'N�o' quando perguntado");

		double x, f;
		String resposta;

		do {

			System.out.println("\nInforme um valor para o ' X ': ");
			x = teclado.nextDouble();

			if (x < -2) {
				System.out.println("\nf(" + x + ") = " + (2 * x) + 2);
			} else if (x >= 2 && x < 3) {
				System.out.println("\nf(" + x + ") = " + 3);
			} else {
				System.out.println("\nf(" + x + ") = " + (-x));
			}

			System.out.println("\nDeseja continuar o programa? [Sim] ou [N�o] ");
			resposta = teclado.next();

		} while (resposta.equalsIgnoreCase("s") | resposta.equalsIgnoreCase("sim"));

		System.out.println("\nAlgoritmo finalizado!");
	}
}
