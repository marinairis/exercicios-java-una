package Pratica03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {


		/* Em linguagem de programação Java, escreva um algoritmo que leia e valide os seguintes dados:
		 * 
		 * a. Nota: entre 0 e 10.
		 * b. Salário: maior que zero.
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
			System.out.println("A nota "+nota+" é VÁLIDA");
		} else {
			System.out.println("A nota "+nota+" é INVÁLIDA");
		}
		
		//INFORMANDO A IDADE
		System.out.println("Digite uma idade: ");
		idade = teclado.nextInt();
		
		if (idade >= 0 && idade <= 150 ) {
			System.out.println("A idade informada "+idade+" é VÁLIDA");
		}else {
			System.out.println("A idade informada "+idade+" é INVÁLIDA");
		}
		
		//INFORMANDO O SEXO
		System.out.println("Digite um sexo: [Masculino] ou [Feminino] ");
		sexo = teclado.next();
		
		if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")) {
			System.out.println("O sexo informado Masculino é VÁLIDO");
		} else if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")){
			System.out.println("O sexo informado Feminino é VÁLIDO");
		} else {
			System.out.println("O sexo informado é INVÁLIDO");
		}
		
		//INFORMANDO O SALÁRIO
		System.out.println("Digite um salário: ");
		salario = teclado.nextDouble();

		if (salario > 0) {
			System.out.println("O salário informado "+salario+" é VÁLIDO");
		} else {
			System.out.println("O salário informado "+salario+" é INVÁLIDO");
		}
		
		System.out.println("Fim do programa!");
	}

}
