package Pratica06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {


		/*
		 * Em linguagem de programa��o Java, escreva um algoritmo que leia 10 n�meros reais a partir do teclado 
		 * e os armazene em um vetor. O algoritmo deve imprimir o vetor, o menor e o maior n�mero informado.
		 */

		 Scanner teclado = new Scanner(System.in);
	        
	        int i;
	        double maior,menor;
	        double [] vetor = new double[10];
	        
	        System.out.println("Informe 10 n�meros inteiros!");
	        
	        for (i = 0; i < 10; i++) {
	            System.out.println("Digite um n�mero:");
	            vetor[i] = teclado.nextDouble();
	        }
	        
	        maior = vetor[0];
	        menor = vetor[0];
	        System.out.println("\nN�meros informados: ");
	        for (i = 0; i < 10; i++) {
	            System.out.printf("numero %d = %.2f\n", i + 1,vetor[i]);
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	            }
	            else if (vetor[i] < menor) {
	                menor = vetor[i];
	            }
	        }
	        
	        System.out.println("\nMaior n�mero informado: " + maior + "\nMenor n�mero informado: " + menor);
	        System.out.println("\nFim do programa!");        
	    }
	}