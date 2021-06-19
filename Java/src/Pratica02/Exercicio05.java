package Pratica02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/* Em linguagem de programa��o Java, implemente um algoritmo que, informados tr�s valores X, Y e Z, 
		 * verifique e informe se eles podem, ou n�o, ser os comprimentos dos lados de um tri�ngulo. 
		 * Em um triangulo, cada lado � menor que a soma dos outros dois lados.
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo informe um valor igual ou menor que Zero");

		int x, y, z;

		System.out.println("\nInforme um valor para o Primeiro lado do Tri�ngulo (x): ");
		x = teclado.nextInt();

		System.out.println("Informe um valor para o Segundo lado do Tri�ngulo (y): ");
		y = teclado.nextInt();

		System.out.println("Informe um valor para o Terceiro lado do Tri�ngulo (z): ");
		z = teclado.nextInt();

		while (x > 0 && y > 0 && z > 0) {

			if (x < z + y && z < y + x && y < x + z) {
				System.out.println("\nEste � um Tri�ngulo V�lido");
			} else {
				System.out.println("\nEste � um Tri�ngulo Inv�lido");
			}

			System.out.println("\nInforme um valor para o Primeiro lado do Tri�ngulo (x): ");
			x = teclado.nextInt();

			System.out.println("Informe um valor para o Segundo lado do Tri�ngulo (y): ");
			y = teclado.nextInt();

			System.out.println("Informe um valor para o Terceiro lado do Tri�ngulo (z): ");
			z = teclado.nextInt();

		}
	}
}
