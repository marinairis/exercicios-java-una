package Pratica04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Em linguagem de programa��o Java, escreva um algoritmo para a prefeitura de uma cidade que deseja realizar 
		 * uma pesquisa entre os seus habitantes. A prefeitura ir� coletar dados sobre o sal�rio e o n�mero de filhos da popula��o. 
		 * A prefeitura deseja saber:
		 * 
		 * a. A m�dia salarial da popula��o.
		 * b. A m�dia do n�mero de filhos.
		 * O final da leitura de dados dar-se-� com a entrada de um sal�rio negativo.
		 */
		
		int somaFilhos=0, contador=0;
		double salario, somaSalario=0;
		String resp;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Caso queira 'Encerrar' o programa digite um n�mero 'Negativo'. \nInforme um Sal�rio:");
		resp = teclado.next();
		salario = Double.parseDouble(resp);
		
		while (salario >= 0) {
			somaSalario += salario;
			
			System.out.println("Informe o n�mero de Filhos: ");
			resp = teclado.next();
			somaFilhos += Integer.parseInt(resp);
			
			contador++;
			
			System.out.println("Informe um Sal�rio:");
			resp = teclado.next();
			salario = Double.parseDouble(resp);
		}
		
		if (contador > 0) {
			System.out.println(
					String.format("M�dia Salarial: %30.2f \nM�dia de Filhos: %10.2f",
							(double) somaSalario / (double) contador,
							(double) somaFilhos / (double) contador));
		}
		System.out.println("Fim do programa!");
	}

}
