package Pratica02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/* Em linguagem de programação Java, escreva um algoritmo que determine a situação de peso de um indivíduo 
		 * determinada através do IMC (Índice de Massa Corpórea).  O IMC é definido como a relação entre o peso (em kg) 
		 * e o quadrado da Altura (em m) do indivíduo: IMC = PESO / ALTURA2. A situação do peso é indicada na tabela ao lado:
		 * 
		 * Condição             Situação
		 * IMC abaixo de 20     Abaixo do Peso
		 * IMC de 20 até 25     Normal
		 * IMC de 25 até 30     Sobrepeso
		 * IMC de 30 até 40     Obesidade
		 * IMC acima de 40      Obesidade Mórbida
		 */
		
		Double peso, Alt, imc;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo digite o valor um valor igual ou menor que Zero");

		System.out.println("\nInforme o Peso:");
		peso = teclado.nextDouble();

		System.out.println("\nInforme a Altura:");
		Alt = teclado.nextDouble();

		while (peso > 0 && Alt > 0) {

			imc = peso / Math.pow(Alt, 2);

			if (imc < 20) {
				System.out.println("\nAbaixo do peso");
			} else if (imc >= 20 && imc < 25) {
				System.out.println("\nNormal");
			} else if (imc >= 25 && imc < 30) {
				System.out.println("\nSobrepeso");
			} else if (imc >= 30 && imc < 40) {
				System.out.println("\nObesidade");
			} else {
				System.out.println("\nObesidade Mórbida");
			}

			System.out.println("\nInforme o Peso:");
			peso = teclado.nextDouble();

			System.out.println("\nInforme a Altura:");
			Alt = teclado.nextDouble();

		}

		System.out.println("\nAlgoritmo finalizado!");

	}

}
