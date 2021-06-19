package Pratica04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/* Foi realizada uma pesquisa de audi�ncia de canal de TV em v�rias casas de uma cidade, em um determinado dia. 
		 * Para cada casa consultada, foram fornecidos: o n�mero do canal (4,5,7,12) e o n�mero de pessoas que estavam assistindo �quele canal. 
		 * Em linguagem de programa��o Java, escreva um algoritmo que:
		 * 
		 * a. Leia um n�mero indeterminado de dados: n�mero do canal e n�mero de pessoas assistindo o canal.
		 * b. Calcule e apresente o percentual de audi�ncia de cada canal.
		 * c. Encerre o processamento quando o usu�rio informar o n�mero do canal igual a ZERO.
		 * 
		 */
		
		int channel, numberPeople = 0, caneView4 = 0, caneView5 = 0, caneView7 = 0, caneView12 = 0;
		String answer;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n�mero do canal: [4,5,7 ou 12]");
		System.out.println("Caso queira sair informe o n�mero '0'.");
		answer = teclado.next();
		channel = Integer.parseInt(answer);
		
		while (channel != 0) {
			switch(channel) {
			case 4:
				System.out.println("Informe o n�mero de pessoas assistindo o canal 4: ");
				answer = teclado.next();
				caneView4 = Integer.parseInt(answer);
				numberPeople += Integer.parseInt(answer);
				break;
			case 5:
				System.out.println("Informe o n�mero de pessoas assistindo o canal 5: ");
				answer = teclado.next();
				caneView5 = Integer.parseInt(answer);
				numberPeople += Integer.parseInt(answer);
				break;
			case 7:
				System.out.println("Informe o n�mero de pessoas assistindo o canal 7: ");
				answer = teclado.next();
				caneView7 = Integer.parseInt(answer);
				numberPeople += Integer.parseInt(answer);
				break;
			case 12:
				System.out.println("Informe o n�mero de pessoas assistindo o canal 12: ");
				answer = teclado.next();
				caneView12 = Integer.parseInt(answer);
				numberPeople += Integer.parseInt(answer);
				break;
			default:
				System.out.println("N�mero de canal inv�lido.");
			}

			System.out.println("Informe o n�mero do canal: [4,5,7 ou 12]");
			System.out.println("Caso queira sair informe o n�mero '0'.");
			answer = teclado.next();
			channel = Integer.parseInt(answer);
		}
			
			if (numberPeople >0) {
				System.out.println(
				String.format("Pecentual de audi�ncia de cada canal: \nCanal %3d: %9.2f%% \nCanal %3d: %9.2f%% \nCanal %3d: %9.2f%% \nCanal %3d: %9.2f%%",
						4, ((double) caneView4 / (numberPeople)) * 100,
						5, ((double) caneView5 / (numberPeople)) * 100,
						7, ((double) caneView7 / (numberPeople)) * 100,
						12, ((double) caneView12 / (numberPeople)) * 100));
		}
		System.out.println("Fim do programa!");
	}

}
