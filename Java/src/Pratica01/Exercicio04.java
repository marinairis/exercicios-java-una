package Pratica01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*Em linguagem de programa��o Java, escreva um algoritmo que receba os valores dos
		 * dois catetos de um tri�ngulo, calcule e apresente o valor da hipotenusa. 
		 * OBS - Teorema de Pit�goras: a2 = b2 + c2. 
		 */
		
		//Declara��o das vari�veis:
		double a;
		int b, c;
		
		Scanner teclado = new Scanner(System.in);
		
		//Entrada de Dados:
		System.out.println("Digite o valor do cateto ' b ': ");
		b = teclado.nextInt();
		
		System.out.println("Digite o valor do cateto ' c ': ");
		c = teclado.nextInt();
		
		//Calculo (processamento):
		a = Math.pow(b, 2) + Math.pow(c, 2);
		
		System.out.println("O valor da Hipotenusa (a) �: "+a);
		System.out.println("Fim do programa! ");

	}

}
