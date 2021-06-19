package Pratica06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {


		/*
		 * Em linguagem de programação Java, escreva um algoritmo que leia 10 números reais a partir do teclado 
		 * e os armazene em um vetor. O algoritmo deve imprimir o vetor, o menor e o maior número informado.
		 */

		 Scanner teclado = new Scanner(System.in);
	        
	        int i;
	        double maior,menor;
	        double [] vetor = new double[10];
	        
	        System.out.println("Informe 10 números inteiros!");
	        
	        for (i = 0; i < 10; i++) {
	            System.out.println("Digite um número:");
	            vetor[i] = teclado.nextDouble();
	        }
	        
	        maior = vetor[0];
	        menor = vetor[0];
	        System.out.println("\nNúmeros informados: ");
	        for (i = 0; i < 10; i++) {
	            System.out.printf("numero %d = %.2f\n", i + 1,vetor[i]);
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	            }
	            else if (vetor[i] < menor) {
	                menor = vetor[i];
	            }
	        }
	        
	        System.out.println("\nMaior número informado: " + maior + "\nMenor número informado: " + menor);
	        System.out.println("\nFim do programa!");        
	    }
	}