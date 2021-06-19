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
        					+ "\nCalorias diárias necessárias"
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
        	System.err.println("Esta idade está fora do calculável de forma precisa");
        	System.out.println("Finalizando aplicação");
        	System.exit(0);
        }
        
        System.out.println("\nInforme a opção que mais se enquadra ao caso:\n");
    	System.out.println(""
    			+ "[1] Fica a maior parte do tempo sentada(o) e não pratica atividades físicas programadas.\n"
    			+ "[2] Dia-a-dia movimentado – dirige, cozinha, caminha até o ponto de \n"
    			+ "    ônibus, mas sem atividades físicas programadas OU dia-a-dia sedentário e exercícios físicos três \n"
    			+ "    vezes por semana, cerca de 30 minutos por dia.\n"
    			+ "[3] Dia-a-dia movimentado e atividades físicas três vezes por \n"
    			+ "    semana, cerca de 30 minutos por dia.\n"
    			+ "[4] De uma a duas horas e meia de atividades físicas diárias.\n"
    			+ "[5] Atividade física diária por mais de três horas.");
    	opcao = teclado.nextInt();
    	
        

        IMC = pesoIdeal.classificaçãoPeso(peso, alt);
        PId = pesoIdeal.pesoIdeal(sexo, idade, alt);
        TMB = necessidadeDiaria.calculaTmb(idade, peso, sexo);
        FA 	= necessidadeDiaria.calculaFA(sexo, opcao);
        NecDia = necessidadeDiaria.calculoCalorias(TMB, FA);
        
        
        
        System.out.println(	"\r"
        					+ "IMC: " + IMC  
        					+ "\nPeso Ideal: " + PId + "Kg"
        					+ "\nCalorias diárias: " + NecDia + " calorias");
        
        System.out.println("Finalizando aplicação");
        
        teclado.close();
	} 
	
}
