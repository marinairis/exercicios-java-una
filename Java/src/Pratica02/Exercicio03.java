package Pratica02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/* Em linguagem de programa��o Java, escreva um algoritmo que determine a situa��o de peso de um indiv�duo 
		 * determinada atrav�s do IMC (�ndice de Massa Corp�rea).  O IMC � definido como a rela��o entre o peso (em kg) 
		 * e o quadrado da Altura (em m) do indiv�duo: IMC = PESO / ALTURA2. A situa��o do peso � indicada na tabela ao lado:
		 * 
		 * Condi��o             Situa��o
		 * IMC abaixo de 20     Abaixo do Peso
		 * IMC de 20 at� 25     Normal
		 * IMC de 25 at� 30     Sobrepeso
		 * IMC de 30 at� 40     Obesidade
		 * IMC acima de 40      Obesidade M�rbida
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
				System.out.println("\nObesidade M�rbida");
			}

			System.out.println("\nInforme o Peso:");
			peso = teclado.nextDouble();

			System.out.println("\nInforme a Altura:");
			Alt = teclado.nextDouble();

		}

		System.out.println("\nAlgoritmo finalizado!");

	}

}
