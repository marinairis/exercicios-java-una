package CalculosABC;

public class NecessidadeDiaria {
    double TMB;
    
    public double calculaTmb(int idade, double peso, String sexo){
        
        if (sexo.equalsIgnoreCase("masculino")) {
            if (idade >= 10 && idade <= 18) {
                this.TMB = 17.5 * peso + 651;
            }
            else if (idade >= 18 && idade <= 30) {
                this.TMB = 15.3 * peso + 679;
            }
            else if (idade >= 30 && idade <= 60) {
                this.TMB = 8.7 * peso + 879;
            }
            else if (idade > 65) {
                this.TMB = 13.5 * peso + 487;
            }
        }
        else {
            if (idade >= 10 && idade <= 18) {
                this.TMB = 12.2 * peso + 746;
            }
            else if (idade >= 18 && idade <= 30) {
                this.TMB = 14.7 * peso + 496;
            }
            else if (idade >= 30 && idade <= 60) {
                this.TMB = 8.7 * peso + 829;
            }
            else if (idade > 65) {
                this.TMB = 10.5 * peso + 596;
            }
            
        } 
        return this.TMB;
    }
    
    public double calculaFA(String sexo, int opcao) {
    	
    	switch (opcao) {
    	case 1:
    		return 1.2;

    	case 2: 
    		if (sexo.equalsIgnoreCase("masculino")|| sexo.equalsIgnoreCase("m"))
    			return 1.4;
    		else
    			return 1.3;
    	case 3: 
    		if (sexo.equalsIgnoreCase("masculino")|| sexo.equalsIgnoreCase("m"))
    			return 1.5;
    		else
    			return 1.45;
    	case 4:
    		if (sexo.equalsIgnoreCase("masculino")|| sexo.equalsIgnoreCase("m"))
    			return 1.6;
    		else
    			return 1.5;
		case 5:
    		if (sexo.equalsIgnoreCase("masculino")|| sexo.equalsIgnoreCase("m"))
    			return 1.8;
    		else
    			return 1.7; 
    	default:
    		return 0;
    	} 
    	
    }
    
    public double calculoCalorias (double TMB, double FA) {
    	return TMB * FA;	
    } 
    
}
