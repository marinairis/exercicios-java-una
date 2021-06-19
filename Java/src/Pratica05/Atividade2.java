/*
2)Em linguagem de programação Java, escreva um algoritmo que calcule e imprima a 
  soma dos números inteiros entre 7 e 20, inclusive.22
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

        System.out.println("\nA soma dos números inteiros entre 7 e 20 são: " + soma);
        System.out.println("\nFim do programa!");
        
        }    
}
