package CalculosABC;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        
        PesoIdeal pesoIdeal = new PesoIdeal();
        NecessidadeDiaria necessidadeDiaria = new NecessidadeDiaria();
        
        double peso, alt, PId, NecDia, TMB, FA;
        String sexo, IMC;
        int idade, opcao;
        
        System.out.println("Para calcular os seus:\n"
        					+ "---------------------------------------"
        					+ "\nIMC"
        					+ "\nPeso Ideal"
        					+ "\nCalorias di�rias necess�rias"
        					+ "---------------------------------------");
        
        System.out.println("\nInforme o sexo");
        sexo = teclado.next();
        
        System.out.println("\nInforme o peso");
        peso = teclado.nextDouble();

        System.out.println("\nInforme a altura");
        alt = teclado.nextDouble();
        
        System.out.println("\nInforme a idade");
        idade = teclado.nextInt();
        
        if (idade >= 11 && idade <= 17 ) {
        	System.err.println("Esta idade est� fora do calcul�vel de forma precisa");
        	System.out.println("Finalizando aplica��o");
        	System.exit(0);
        }
        
        System.out.println("\nInforme a op��o que mais se enquadra ao caso:\n");
    	System.out.println(""
    			+ "[1] Fica a maior parte do tempo sentada(o) e n�o pratica atividades f�sicas programadas.\n"
    			+ "[2] Dia-a-dia movimentado � dirige, cozinha, caminha at� o ponto de \n"
    			+ "    �nibus, mas sem atividades f�sicas programadas OU dia-a-dia sedent�rio e exerc�cios f�sicos tr�s \n"
    			+ "    vezes por semana, cerca de 30 minutos por dia.\n"
    			+ "[3] Dia-a-dia movimentado e atividades f�sicas tr�s vezes por \n"
    			+ "    semana, cerca de 30 minutos por dia.\n"
    			+ "[4] De uma a duas horas e meia de atividades f�sicas di�rias.\n"
    			+ "[5] Atividade f�sica di�ria por mais de tr�s horas.");
    	opcao = teclado.nextInt();
    	
        

        IMC = pesoIdeal.classifica��oPeso(peso, alt);
        PId = pesoIdeal.pesoIdeal(sexo, idade, alt);
        TMB = necessidadeDiaria.calculaTmb(idade, peso, sexo);
        FA 	= necessidadeDiaria.calculaFA(sexo, opcao);
        NecDia = necessidadeDiaria.calculoCalorias(TMB, FA);
        
        
        
        System.out.println(	"\r"
        					+ "IMC: " + IMC  
        					+ "\nPeso Ideal: " + PId + "Kg"
        					+ "\nCalorias di�rias: " + NecDia + " calorias");
        
        System.out.println("Finalizando aplica��o");
        
        teclado.close();
	} 
	
}
