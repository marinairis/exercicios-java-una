/*
3)Em linguagem de programação Java, escreva um algoritmo que leia 2 números inteiros 
  positivos e que imprima todos os números inteiros existentes entre esses dois limites
  informados.
 */
package Pratica05;

import java.util.Scanner;

public class Atividade3 {
	 public static void main(String[] args) {

	        int i, 
	            numero1,
	            numero2,    
	            maior,
	            menor;
	        
	        Scanner teclado = new Scanner(System.in);
	        
	        System.out.println("Digite o Primeiro n�mero:");
	        numero1 = teclado.nextInt();
	        
	        System.out.println("Digite o Segundo n�mero");
	        numero2 = teclado.nextInt();
	        
	        if (numero1 > numero2) {
	            maior = numero1;
	            menor = numero2;
	        }
	        else {
	            maior = numero2;
	            menor = numero1;    
	        }
	        
	        System.out.println("Os n�meros inteiros entre "+numero1+" e "+numero2+" �:");
	        for (i = menor; i <= maior; i++) {
	            System.out.println(i);
	        }
	        System.out.println("\nFim do programa!");
	         
	    }       
	}
