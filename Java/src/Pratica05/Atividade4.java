/*
O fatorial de um n�mero n � representado por n! e � calculado como apresentado abaixo:
n! = n x (n � 1) x (n � 2) x ... x 2 x 1, para n > 0 e 0! = 1.
Exemplos:
5! = 5 x 4 x 3 x 2 x 1 = 120
4! = 4 x 3 x 2 x 1 = 24
3! = 3 x 2 x 1 = 6
2! = 2 x 1 = 2
1! = 1
0! = 1 (OBS: o fatorial de 0 � sempre 1).
Em linguagem de programa��o Java, escreva um algoritmo que leia um n�mero natural informado pelo usu�rio a partir do 
teclado e que informe o fatorial desse n�mero. Se o usu�rio inserir um n�mero negativo, informe que o n�mero � inv�lido.
 */
package Pratica05;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {

		int i, numero;

		double fatorial = 1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		numero = teclado.nextInt();

		if (numero < 0) {
			System.out.println("N�mero inv�lido");
		} else if (numero == 0) {
			System.out.println("O fatorial do n�mero informado � 1 ");
		} else {
			for (i = numero; i > 0; i--) {
				fatorial = fatorial * i;
			}
		}

		System.out.printf("O fatorial de " + numero + " � %.0f ", fatorial);
		System.out.println("\nFim do programa!");

	}

}
