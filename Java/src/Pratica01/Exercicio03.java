package Pratica01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {


		/* Em linguagem de programação Java, escreva um algoritmo que receba o valor do salário
		 * mínimo e o valor do salário de um funcionário. O algoritmo deve calcular e apresentar a
		 * quantidade de salários mínimos que esse funcionário recebe. 
		 */

		//Declaração das variáveis:
		double salMinino, salFuncionario, quantidadeSalarios;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada de Dados:
		System.out.println("\nQual o nome do funcionário(a)? ");
		nome = teclado.next();
		
		System.out.println("Digite o valor do Salário Minímo atual: ");
		salMinino = teclado.nextDouble();
		
		System.out.println("Digite o valor do Salário Atual do Funcionário(a) "+nome+" :");
		salFuncionario = teclado.nextDouble();
		
		//Calculo (processamento):
		quantidadeSalarios =  salFuncionario / salMinino;
		
		System.out.format("\nO funcionário(a) "+nome+" ganha "+quantidadeSalarios+" salários minímos.");
		System.out.println("Fim do programa! ");
				
	}

}
