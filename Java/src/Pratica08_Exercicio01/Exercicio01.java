package Pratica08_Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * Em linguagem de programação Java, escreva um algoritmo que cadastre veículos
	 * em um vetor de cadastro. O algoritmo deve permitir que o usuário cadastre
	 * quantos veículos forem necessários. Após cadastrar todos os veículos, o
	 * algoritmo deve imprimir o vetor de cadastro. A classe Veiculo deve possuir as
	 * propriedades: número do chassi e placa. Todas as propriedades devem ser
	 * privadas.
	 */

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();

		Scanner teclado = new Scanner(System.in);

		int i, quant;
		String numChassi, placa;

		System.out.println("Informe a 'Quantidade' de veiculos que deseja cadastrar:");
		quant = teclado.nextInt();
		veiculo.setValor(quant);

		for (i = 0; i < quant; i++) {
			System.out.println("Informe o Chassi:");
			numChassi = teclado.next();

			System.out.println("Informe a Placa:");
			placa = teclado.next();

			veiculo.setNumChassi(numChassi);
			veiculo.setPlaca(placa);

			veiculo.implementar(i);

		}

		veiculo.imprimir1();
		
		System.out.println("Programa finalizado!");
	}
}
