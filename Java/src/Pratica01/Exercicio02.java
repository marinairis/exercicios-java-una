package Pratica01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*Em linguagem de programa��o Java, escreva um algoritmo que receba uma temperatura
		 * em Celsius, calcule e mostre essa temperatura em Fahrenheit. OBS: F = (C * 1,8) + 32.
		 */
		
		//Declara��o das vari�veis:
		double c, f;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada de Dados:
		System.out.println("\nDigite a tempratura em Celsius: ");
		c = teclado.nextDouble();
		
		//Calculo (processamento):
		f = (c * 1.8) + 32;
		
		System.out.println("Esta temperatuda em Fahrenheit �: "+f);
		System.out.println("Fim do programa! ");

	}

}
