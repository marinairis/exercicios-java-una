/*
1)Em linguagem de programa��o Java, escreva um algoritmo que leia 10 n�meros e imprima 
  quantos n�meros negativos foram lidos.
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
            System.out.println("Digite um n�meor: ");
            numero = teclado.nextDouble();
            
            if (numero < 0) {
                contador++;
            }
        }
        
        System.out.println("\nA quantidade de n�meors negativos informados foram: " + contador);
        System.out.println("\nFim do programa!");
    }
    
}
