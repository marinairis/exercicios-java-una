package Pratica03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {


		/* Em linguagem de programa��o Java, escreva um algoritmo que leia e valide os seguintes dados:
		 * 
		 * a. Nota: entre 0 e 10.
		 * b. Sal�rio: maior que zero.
		 * c. Sexo: m ou f.
		 * d. Idade: entre 0 e 150.
		 */
		
		int idade, nota;
		double salario;
		String sexo;
		
		Scanner teclado = new Scanner(System.in);
		
		//INFORMANDO A NOTA 
		System.out.println("Digite uma nota: ");
		nota = teclado.nextInt();
		
		if (nota >= 0 && nota <= 10) {
			System.out.println("A nota "+nota+" � V�LIDA");
		} else {
			System.out.println("A nota "+nota+" � INV�LIDA");
		}
		
		//INFORMANDO A IDADE
		System.out.println("Digite uma idade: ");
		idade = teclado.nextInt();
		
		if (idade >= 0 && idade <= 150 ) {
			System.out.println("A idade informada "+idade+" � V�LIDA");
		}else {
			System.out.println("A idade informada "+idade+" � INV�LIDA");
		}
		
		//INFORMANDO O SEXO
		System.out.println("Digite um sexo: [Masculino] ou [Feminino] ");
		sexo = teclado.next();
		
		if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
			System.out.println("O sexo informado Masculino � V�LIDO");
		} else if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")){
			System.out.println("O sexo informado Feminino � V�LIDO");
		} else {
			System.out.println("O sexo informado � INV�LIDO");
		}
		
		//INFORMANDO O SAL�RIO
		System.out.println("Digite um sal�rio: ");
		salario = teclado.nextDouble();

		if (salario > 0) {
			System.out.println("O sal�rio informado "+salario+" � V�LIDO");
		} else {
			System.out.println("O sal�rio informado "+salario+" � INV�LIDO");
		}
		
		System.out.println("Fim do programa!");
	}

}
