package Pratica06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {


		/*
		 * Em linguagem de programa��o Java, escreva um algoritmo que leia 10 n�meros inteiros a partir do teclado 
		 * e os armazene em um vetor. O algoritmo deve imprimir o vetor e apresentar a soma dos n�meros pares.
		 */
		Scanner teclado = new Scanner(System.in);
        
        int i, soma = 0;
        int [] vetor = new int[10];
        
    	System.out.println("Informe 10 n�meros inteiros!");
        
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite um n�mero inteiro: ");
            vetor[i] = teclado.nextInt();
        }
        
        System.out.println("\nN�meros informados: ");
        for (i = 0; i < vetor.length; i++) {
            System.out.printf("numero %d = %2d\n", i + 1,vetor[i]);
        }
        
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
        }
        
        System.out.println("\nA soma dos n�meros pares informados �: " + soma); 
        System.out.println("\nFim do programa!");
    }    
}
