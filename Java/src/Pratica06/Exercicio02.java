package Pratica06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {


		/*
		 * Em linguagem de programação Java, escreva um algoritmo que leia 10 números reais a partir do teclado 
		 * e os armazene em um vetor. O algoritmo deve imprimir o vetor e as posições do vetor que armazenam números negativos.
		 */

		 Scanner teclado = new Scanner(System.in);
	        
	        int i;
	        double [] vetor = new double[10];
	        
	        System.out.println("Informe 10 números inteiros!");
	        
	        for (i = 0; i < 10; i++) {
	            System.out.println("Digite um número: ");
	            vetor[i] = teclado.nextDouble();
	        }
	        
	        System.out.println("\nNúmeros informados: ");
	        for (i = 0; i < 10; i++) {
	            System.out.printf("numero %d = %.2f\n", i + 1,vetor[i]);
	        }
	        
	        System.out.println("\nNúmeros negativos informados");
	        for (i = 0; i < 10; i++) {
	            if (vetor[i] < 0) {
	                System.out.printf("numero %d = %.2f\n", i + 1,vetor[i]);
	            }
	        }
	        System.out.println("\nFim do programa!");        
	    }      
	}	