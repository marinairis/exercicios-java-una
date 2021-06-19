package Pratica04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Em linguagem de programação Java, escreva um algoritmo que receba a nota
		 * final e o total de faltas de um conjunto indeterminado de alunos.
		 * 
		 * Imprima: 
		 * a. A quantidade de alunos que obtiveram nota final maior ou igual a 90. 
		 * b. A quantidade de alunos que foram reprovados por nota (nota menor que  70) ou por falta (quantidade de faltas maior ou igual a 20). 
		 * c. A maior e a menor nota. d. A média de notas da turma.
		 * 
		 * O programa deverá terminar quando o usuário informar uma nota negativa.
		 */

		int nota = 0, faltas = 0, soma = 0, contador = 0, contador90 = 0, contadorReprovados = 0, maiorNota, menorNota;
		double media;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' a contagem de notas, digite um número 'Negativo'.");

		maiorNota = 0;
		menorNota = 1000;

		while (nota >= 0 && faltas >= 0) {

			System.out.println("\nDigite a nota:");
			nota = teclado.nextInt();

			System.out.println("\nDigite a quantidade de faltas:");
			faltas = teclado.nextInt();

			if (nota >= 0 && faltas >= 0) {

				if (nota > maiorNota) {
					maiorNota = nota;
				} else if (nota < menorNota) {
					menorNota = nota;
				}

				if (nota >= 90) {
					contador90++;
				} else if (nota < 70 || faltas >= 20) {
					contadorReprovados++;
				}

				soma = soma + nota;
				contador++;

			} else {
				System.out.println("\nPrograma finalizado");
			}

		}

		media = soma / contador;

		if (contador != 0) {
			System.out.println("Número de alunos aprovados com mais de 90 pontos: " + contador90);
			System.out.println("Número de alunos reprovados: " + contadorReprovados);
			System.out.println("A maior nota é: " + maiorNota);
			System.out.println("A menor nota é: " + menorNota);
			System.out.format("A média das notas é: %.2f", media);
		}
		System.out.println("Fim do programa!");
	}

}
