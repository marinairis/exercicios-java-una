package Pratica01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* Em linguagem de programa��o Java, escreva um algoritmo que calcule e apresente a
		 * �rea de um losango. As diagonais maior e menor do losango devem ser informadas pelo
		 * usu�rio. OBS: AREA = (DIAGONAL MAIOR * DIAGONAL MENOR) / 2.
		 */
		
		//Declara��o das vari�veis:
		int dig1, dig2, area;
		
		Scanner teclado = new Scanner (System.in);
		
		//Entrada de Dados:
		System.out.println("Digite um valor para a Primeira Diagonal: ");
		dig1 = teclado.nextInt();
		
		System.out.println("Digite um valor para a Seguda Diagonal: ");
		dig2 = teclado.nextInt();
		
		//Calculo (processamento):
		area = (dig1 * dig2) / 2;
		
		System.out.println("O valor da �rea do Losango �: "+area);
		System.out.println("Fim do programa! ");
		
	}

}
