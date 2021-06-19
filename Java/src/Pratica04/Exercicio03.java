package Pratica04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		 * Em linguagem de programação Java, escreva um algoritmo para a prefeitura de uma cidade que deseja realizar 
		 * uma pesquisa entre os seus habitantes. A prefeitura irá coletar dados sobre o salário e o número de filhos da população. 
		 * A prefeitura deseja saber:
		 * 
		 * a. A média salarial da população.
		 * b. A média do número de filhos.
		 * O final da leitura de dados dar-se-á com a entrada de um salário negativo.
		 */
		
		int somaFilhos=0, contador=0;
		double salario, somaSalario=0;
		String resp;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Caso queira 'Encerrar' o programa digite um número 'Negativo'. \nInforme um Salário:");
		resp = teclado.next();
		salario = Double.parseDouble(resp);
		
		while (salario >= 0) {
			somaSalario += salario;
			
			System.out.println("Informe o número de Filhos: ");
			resp = teclado.next();
			somaFilhos += Integer.parseInt(resp);
			
			contador++;
			
			System.out.println("Informe um Salário:");
			resp = teclado.next();
			salario = Double.parseDouble(resp);
		}
		
		if (contador > 0) {
			System.out.println(
					String.format("Média Salarial: %30.2f \nMédia de Filhos: %10.2f",
							(double) somaSalario / (double) contador,
							(double) somaFilhos / (double) contador));
		}
		System.out.println("Fim do programa!");
	}

}
