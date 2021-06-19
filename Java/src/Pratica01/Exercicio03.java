package Pratica01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {


		/* Em linguagem de programa��o Java, escreva um algoritmo que receba o valor do sal�rio
		 * m�nimo e o valor do sal�rio de um funcion�rio. O algoritmo deve calcular e apresentar a
		 * quantidade de sal�rios m�nimos que esse funcion�rio recebe. 
		 */

		//Declara��o das vari�veis:
		double salMinino, salFuncionario, quantidadeSalarios;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada de Dados:
		System.out.println("\nQual o nome do funcion�rio(a)? ");
		nome = teclado.next();
		
		System.out.println("Digite o valor do Sal�rio Min�mo atual: ");
		salMinino = teclado.nextDouble();
		
		System.out.println("Digite o valor do Sal�rio Atual do Funcion�rio(a) "+nome+" :");
		salFuncionario = teclado.nextDouble();
		
		//Calculo (processamento):
		quantidadeSalarios =  salFuncionario / salMinino;
		
		System.out.format("\nO funcion�rio(a) "+nome+" ganha "+quantidadeSalarios+" sal�rios min�mos.");
		System.out.println("Fim do programa! ");
				
	}

}
