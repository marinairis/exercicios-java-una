/*
1)Em linguagem de programação Java, escreva um algoritmo que leia 10 números e imprima 
  quantos números negativos foram lidos.
 */
package Pratica05;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        
        Double numero;
        int i, 
            contador = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        for (i = 0; i < 10; i++) {
            System.out.println("Digite um númeor: ");
            numero = teclado.nextDouble();
            
            if (numero < 0) {
                contador++;
            }
        }
        
        System.out.println("\nA quantidade de númeors negativos informados foram: " + contador);
        System.out.println("\nFim do programa!");
    }
    
}
