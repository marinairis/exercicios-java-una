package Pratica02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		/* Em linguagem de programa��o Java, escreva um algoritmo que informe o pre�o dos produtos de uma loja, 
		 * conforme indicado na tabela abaixo. O algoritmo deve receber o c�digo do produto como entrada.
		 * 
		 * C�digo     Produto     Pre�o
		 *   1        Sapato     R$ 99,99
		 *   2        Bolsa      R$ 103,89
		 *   3        Camisa     R$ 49,98 
		 *   4        Cal�a      R$ 89,72 
		 *   5        Blusa      R$ 97,35
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo informe o valor do c�digo menor ou igual a Zero");

		int codigo;

		System.out.println("\nInforme o c�digo do produto: ");
		codigo = teclado.nextInt();

		while (codigo > 0) {

			switch (codigo) {
			case 1:
				System.out.println("\nSapato: R$ 99,99.");
				break;
			case 2:
				System.out.println("\nBolsa: R$ 103,89.");
				break;
			case 3:
				System.out.println("\nCamisa: R$ 49,98.");
				break;
			case 4:
				System.out.println("\nCal�a: R$ 89,72.");
				break;
			case 5:
				System.out.println("\nSapato: R$ 97,35.");
				break;
			default:
				System.out.println("\nC�digo inv�lido");
			}

			System.out.println("\nInforme o c�digo do produto: ");
			codigo = teclado.nextInt();

		}

		System.out.println("\nAlgoritmo finalizado!");

	}
}
