package Pratica02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/* Em linguagem de programação Java, implemente um algoritmo que, informados três valores X, Y e Z, 
		 * verifique e informe se eles podem, ou não, ser os comprimentos dos lados de um triângulo. 
		 * Em um triangulo, cada lado é menor que a soma dos outros dois lados.
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo informe um valor igual ou menor que Zero");

		int x, y, z;

		System.out.println("\nInforme um valor para o Primeiro lado do Triângulo (x): ");
		x = teclado.nextInt();

		System.out.println("Informe um valor para o Segundo lado do Triângulo (y): ");
		y = teclado.nextInt();

		System.out.println("Informe um valor para o Terceiro lado do Triângulo (z): ");
		z = teclado.nextInt();

		while (x > 0 && y > 0 && z > 0) {

			if (x < z + y && z < y + x && y < x + z) {
				System.out.println("\nEste é um Triângulo Válido");
			} else {
				System.out.println("\nEste é um Triângulo Inválido");
			}

			System.out.println("\nInforme um valor para o Primeiro lado do Triângulo (x): ");
			x = teclado.nextInt();

			System.out.println("Informe um valor para o Segundo lado do Triângulo (y): ");
			y = teclado.nextInt();

			System.out.println("Informe um valor para o Terceiro lado do Triângulo (z): ");
			z = teclado.nextInt();

		}
	}
}
