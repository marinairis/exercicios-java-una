package Pratica02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {


		/* Em linguagem de programação Java, escreva um algoritmo que 
		 * receba 3 notas no intervalo [0, 10] de um aluno, calcule e apresente uma mensagem de 
		 * acordo com sua média:
		 * 
		 * MÉDIA          MENSAGEM 
		 * >= 0 e < 3      REPROVADO
		 * >= 3 e < 7      EXAME
		 * >= 7 e <= 10    APROVADO
		 */
		
		Double nota1, nota2, nota3, media;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo digite o valor um valor Negativo");

		System.out.println("\nInforme a Primeira nota:");
		nota1 = teclado.nextDouble();

		System.out.println("\nInforme a Segunda nota:");
		nota2 = teclado.nextDouble();

		System.out.println("\nInforme a Terceira nota: ");
		nota3 = teclado.nextDouble();

		while (nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {

			media = (nota1 + nota2 + nota3) / 3;

			if (media >= 0 && media < 3) {
				System.out.println("\nReprovado");
			} else if (media > 3 && media < 7) {
				System.out.println("\nExame");
			} else {
				System.out.println("\nAprovado");
			}

			System.out.println("\nInforme a Primeira nota:");
			nota1 = teclado.nextDouble();

			System.out.println("\nInforme a Segunda nota:");
			nota2 = teclado.nextDouble();

			System.out.println("\nInforme a Terceira nota:");
			nota3 = teclado.nextDouble();

		}

		System.out.println("\nAlgoritmo finalizado!");

	}
}
