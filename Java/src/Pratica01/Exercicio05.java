package Pratica01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/* Em linguagem de programação Java, escreva um algoritmo que receba o raio, calcule e apresente:
		 * 	a. O comprimento de uma esfera: C = 2 * π * R.
		 * 	b. A área de uma esfera: A = π * R2
		 * 	c. O volume de uma esfera: V = ¾ * π * R3.
		 */

		//Declaração das variáveis:
		double raio, comprimento, area, volume;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada de Dados:
		System.out.println("\nDigite o valor do Raio: ");
		raio = teclado.nextDouble();
		
		//Calculo (processamento):
		comprimento = 2 * Math.PI * raio;
		System.out.format("\na. O Comprimento da Esfera é (C = 2 * π * R) = %.2f",comprimento);
		area = Math.PI * Math.pow(raio, 2);
		System.out.format("\nb. A Área da Esfera é (A = π * R2) = %.2f",area);
		
		volume = (double) 3/4 * Math.PI * Math.pow(raio, 3); 
		//ou transforma o 3/4 para 0,75
		System.out.format("\nc. O Volume da Esfera é (V = ¾ * π * R3) = %.2f",volume);
		System.out.println("\nFim do programa! ");
		
	}

}
