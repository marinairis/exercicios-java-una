package Pratica07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio01 {


		/*
		 * Em linguagem de programação Java, escreva um algoritmo que leia os elementos de uma matriz 5 x 5 a partir do teclado. O algoritmo deve:
		 * a. Imprimir a matriz informada. Exemplo:
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 16 17 18 19 20
		 * 21 22 23 24 25
		 * 
		 * b. Imprimir os elementos armazenados nas posições em que o índice da linha é par e o índice da coluna é ímpar. Exemplo:
		 * 1'2' 3 '4' 5
		 * 6 7 8 9 10
		 * 11 '12' 13 '14' 15
		 * 16 17 18 19 20
		 * 21 '22' 23 '24' 25
		 * 
		 * c. Imprimir a matriz transposta a matriz informada. OBS: na matriz transposta, as linhas da matriz tornam-se colunas e as colunas, linhas.
		 * 1 6 11 16 21
		 * 2 7 12 17 22
		 * 3 8 13 18 23
		 * 4 9 14 19 24
		 * 5 10 15 20 25
		 * 
		 * d. Trocar os elementos da diagonal principal com os elementos da diagonal secundária. Imprimir a matriz resultante.
		 * '5' 2 3 4 '1'
		 * 6 '9' 8 '7' 10
		 * 11 12 '13' 14 15
		 * 16 '19' 18 '17' 20
		 * '25' 22 23 24 '21'
		 */

		public static void main(String[] args) {
            
	        int i,j;
	        int [][] matriz = new int [5][5];
	        String resposta;
	        
	        
	        //recebendo valores
	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 5; j++) {
	                resposta = JOptionPane.showInputDialog("Digite o valor inteiro");
	                matriz[i][j] = Integer.parseInt(resposta);
	            }        
	        }
	        
	        
	        //Imprimindo matriz
	        resposta = "Valores informados:\n";
	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 5; j++) {
	                resposta += String.format("%5d", matriz[i][j]); 
	            }
	            resposta += "\n";
	        }
	        JOptionPane.showMessageDialog(null, resposta);
	        
	        
	        //Valores informados onde o indice da linha é par e o indice da coluna é ímpar
	        resposta = "Valores informados onde o indice da linha é par e o indice da coluna é ímpar:\n";
	        for (i = 0; i < 5; i += 2) {
	            for (j = 1; j < 5; j += 2) {
	                resposta += String.format(" %5d", matriz[i][j]);
	            }
	            resposta += "\n";           
	        }
	        JOptionPane.showMessageDialog(null, resposta);
	        
	       
	        //Imprimindo a matriz transposta
	        resposta = "Matriz transposta:\n";
	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 5; j++) {
	                resposta += String.format("%5d", matriz[j][i]); 
	            }
	            resposta += "\n";
	        }
	        JOptionPane.showMessageDialog(null, resposta);
	        
	        
	        //trocando posição diagonal
	        for (i = 0; i < matriz.length; i++) {
	            int posicao = (matriz.length - 1) - i;
	            int valorTemp = matriz[i][posicao];
	            matriz[i][posicao] = matriz[i][i];
	            matriz[i][i] = valorTemp;      
	            
	        }
	        
	        //Matriz com os elementos da diagonal principal e os elementos da diagonal secundária trocados
	        resposta = "Matriz com os elementos da diagonal principal e os elementos da diagonal secundária trocados:\n";
	        for (i = 0; i < 5; i++) {
	            for (j = 0; j < 5; j++) {
	                resposta += String.format("%5d", matriz[i][j]); 
	            }
	            resposta += "\n";
	        }
	        JOptionPane.showMessageDialog(null, resposta);
	       
	    }

	}
