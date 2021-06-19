package Pratica02;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/* Em linguagem de programação Java, escreva um algoritmo que leia os três lados de um triângulo 
		 * e imprima o tipo de triângulo:
		 *		a. Equilátero: os três lados são iguais.
		 *		b. Isósceles: 2 lados são iguais.
		 *		c. Escaleno: 3 lados diferentes.
		 */
		
		Double lado1, lado2, lado3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Para 'Finalizar' o algoritmo digite o valor igual ou menor que Zero");

		do {
			System.out.println("\nInforme o Primeiro lado: ");
			lado1 = teclado.nextDouble();

			System.out.println("\nInforme o Segundo lado: ");
			lado2 = teclado.nextDouble();

			System.out.println("\nInforme o Terceiro lado: ");
			lado3 = teclado.nextDouble();

			if (Objects.equals(lado1, lado2) && Objects.equals(lado2, lado3)) {
				System.out.println("\nTriângulo Equilátero");
			} else if (Objects.equals(lado1, lado2) || Objects.equals(lado1, lado3) || Objects.equals(lado2, lado3)) {
				System.out.println("\nTriângulo Isósceles");
			} else {
				System.out.println("\nTriângulo Escaleno");

			}

		} while (lado1 > 0 && lado2 > 0 && lado3 > 0);

		System.out.println("\nAlgoritmo finalizado!");

	}

}
