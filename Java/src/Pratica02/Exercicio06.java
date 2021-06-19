package Pratica02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Em linguagem de programação Java, implemente um algoritmo que resolva uma
		 * equação de segundo grau, realizando consistências dos valores dos
		 * coeficientes (“a”, “b” e “c”) e do discriminante (delta), conforme descrito
		 * abaixo. 
		 * a. Se os coeficientes “a” e “b” forem iguais a zero e o coeficiente
		 * “c” for diferente de zero, apresentar a mensagem “Coeficientes informados
		 * incorretamente”. Se o coeficiente “c” for zero, apresentar a mensagem
		 * "Igualdade confirmada: 0 = 0". 
		 * b. Caso o coeficiente “a” seja igual a zero e
		 * o coeficiente “b” for diferente de zero, deverá ser impressa a mensagem:
		 * “Esta é uma equação de primeiro grau” e deverá ser apresentado o valor da
		 * raiz real da equação. 
		 * c. Caso o discriminante seja negativo, deverá ser
		 * impressa a mensagem: “Esta equação não possui raízes reais”. 
		 * d. Caso o discriminante seja zero, apresentar a mensagem “Esta equação possui duas
		 * raízes reais iguais”. Em seguida, apresentar o valor das raízes da equação.
		 * e. Caso o discriminante seja maior que zero, apresentar a mensagem “Esta
		 * equação possui duas raízes reais diferentes”. Em seguida, apresentar o valor
		 * das raízes da equação. 
		 * Equação do segundo grau: ax2 + bx + c = 0
		 * Discriminante:  = b2 – 4ac
		 */

		Scanner teclado = new Scanner(System.in);

		double a, b, c, delta;
		String resposta = "";

		System.out.println("\nInforme um valor para o coeficiente de ' a ': ");
		a = teclado.nextDouble();

		System.out.println("\nInforme um valor para o coeficiente de ' b ': ");
		b = teclado.nextDouble();

		System.out.println("\nInforme um valor para o coeficiente de ' c ': ");
		c = teclado.nextDouble();

		do {

			if (a == 0)
				if (b == 0)
					if (c == 0)
						System.out.println("Igualdade confirmada: 0 = 0");
					else
						System.out.println("Coeficientes informados incorretamente.");
				else {
					System.out.println("Esta não é uma equação de primeiro grau.");
					System.out.println("Raiz da equação: " + (-c / b));
				}
			else {
				System.out.println("Esta não é uma equação de segundo grau.");

				delta = Math.pow(b, 2) - 4 * a * c;

				if (delta < 0)
					System.out.println("\nEsta equação não possui raízes reais. \n delta < 0");
				else if (delta == 0) {
					System.out.println("\nEsta equação possui duas raízes reais iguais." + "\n Delta = 0"
							+ "\n x' = x'' = " + (-b / (2 * a)));
				} else {
					System.out.println("Esta equação possui duas raízes reais diferentes." + "\n Delta = " + delta
							+ "\n x' = " + ((-b + Math.sqrt(delta)) / 2 * a) + "\n x'' = "
							+ ((-b - Math.sqrt(delta)) / 2 * a));
				}

				System.out.println("Deseja continuar o programa? [Sim] ou [Não] ");
				resposta = teclado.next();

				if (resposta.equalsIgnoreCase("sim") | resposta.equalsIgnoreCase("s")) {
					System.out.println("\nInforme um valor para o coeficiente de ' a ': ");
					a = teclado.nextDouble();

					System.out.println("\nInforme um valor para o coeficiente de ' b ': ");
					b = teclado.nextDouble();

					System.out.println("\nInforme um valor para o coeficiente de ' c ': ");
					c = teclado.nextDouble();
				}

			}
		} while (resposta.equalsIgnoreCase("s") | resposta.equalsIgnoreCase("sim"));

		System.out.println("Fim do programa!");
	}
}
