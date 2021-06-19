package Pratica08_Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Em linguagem de programação Java, escreva um algoritmo que: a. Possua uma
		 * classe Pessoa com o atributo nome e os modificadores de acesso setNome() e
		 * getNome(). b. Possua uma classe PessoaFisica com o atributo CPF e os
		 * modificadores de acesso setCPF() e getCPF(). A classe PessoaFisica deve
		 * estender a classe Pessoa. c. Possua uma classe PessoaJuridica com o atributo
		 * CNPJ e os modificadores de acesso setCNPJ() e getCNPJ(). A classe
		 * PessoaJuridica também deve estender a classe Pessoa. d. Permita informar os
		 * dados de entrada a partir do teclado e os armazene nos objetos das classes
		 * PessoaFisica e PessoaJuridica. e. Possua uma classe Cadastro que permita
		 * cadastrar pessoas físicas e jurídicas. As pessoas devem ser armazenas em um
		 * vetor. f. A classe Cadastro deve permitir imprimir o vetor de cadastro. g.
		 * OBS: as propriedades das classes devem ser privadas.
		 */

		PessoaFisica pessoaFisica = new PessoaFisica();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		Cadastro cadastro = new Cadastro();

		Scanner teclado = new Scanner(System.in);

		String nome, cpf, cnpj;
		int quantPessoaF, quantPessoaJ;

		System.out.println("Informe a quantidade de pessoas FÍSICAS para cadastro:");
		quantPessoaF = teclado.nextInt();
		cadastro.setQuantPessoaF(quantPessoaF);

		System.out.println("Informe a quantidade de pessoas JURÍDICAS para cadastro:");
		quantPessoaJ = teclado.nextInt();
		cadastro.setQuantPessoaJ(quantPessoaJ);

		for (int i = 0; i < quantPessoaF; i++) {
			System.out.println("\nInforme o NOME da Pessoa FÍSICA:");
			nome = teclado.next();

			System.out.println("Informe o CPF da Pessoa FÍSICA:");
			cpf = teclado.next();

			pessoaFisica.setNome(nome);
			pessoaFisica.setCpf(cpf);

			cadastro.implementarPessoaF(i, pessoaFisica);

		}

		for (int i = 0; i < quantPessoaJ; i++) {
			System.out.println("\nInforme o NOME da Pessoa JURÍDICA:");
			nome = teclado.next();

			System.out.println("Informe o CNPJ da Pessoa JURÍDICA");
			cnpj = teclado.next();

			pessoaJuridica.setNome(nome);
			pessoaJuridica.setCnpj(cnpj);

			cadastro.implementarPessoaJ(i, pessoaJuridica);

		}

		cadastro.imprimirPessoaF();
		cadastro.imprimirPessoaJ();
		teclado.close();

		System.out.println("Programa finalizado!");
	}

}
