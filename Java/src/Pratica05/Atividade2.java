/*
2)Em linguagem de programa��o Java, escreva um algoritmo que calcule e imprima a 
  soma dos n�meros inteiros entre 7 e 20, inclusive.22
 */
package Pratica05;

public class Atividade2 {
    public static void main(String[] args) {

        int i, 
            contador = 0,
            soma = 0;

        for (i = 7; i < 21; i++) {
            soma = soma + i;
        }

        System.out.println("\nA soma dos n�meros inteiros entre 7 e 20 s�o: " + soma);
        System.out.println("\nFim do programa!");
        
        }    
}
