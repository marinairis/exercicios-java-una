package CalculosABC;

public class PesoIdeal {
    
    public String classificaçãoPeso(double peso, double alt){
        
    	String resultado;
    	
        double imc = peso / Math.pow(alt, 2);
            
        if (imc < 20) {
                resultado = "Abaixo do peso"; 
            }
            else if (imc >= 20 && imc < 25) {
                resultado = "Normal";
            }
            else if (imc >= 25 && imc < 30) {
                resultado = "Sobrepeso";
            }
            else if (imc >= 30 && imc < 40) {
                resultado = "Obesidade";
            }
            else{
                resultado = "Obesidade Mórbida";
            }
        
       return resultado;
        
    }
    
    
    public double pesoIdeal (String sexo, int idade, double alt) {
        
    	double pesoIdeal = 0;
    	
        if (idade >= 3 && idade <= 10) {
            pesoIdeal = idade * 2 + 9;
            
        } else 
        	if (sexo.equalsIgnoreCase("masculino")||sexo.equalsIgnoreCase("m")) {
        		if (idade >= 18 && idade <= 64) {
        			pesoIdeal = 22 * (alt * alt);
        		}
        		else if (idade >= 65 && idade <= 69) {
        			pesoIdeal = 24.3 * (alt * alt);
        		}
        		else if (idade >= 70 && idade <= 74) {
        			pesoIdeal = 25.1 * (alt * alt);
        		}
        		else if (idade >= 75 && idade <= 79) {
        			pesoIdeal = 24.9 * (alt * alt);
        		}
        		else if (idade >= 80 && idade <= 84) {
        			pesoIdeal = 23.7 * (alt * alt);
        		}
        		else if (idade > 85){
        			pesoIdeal = 23.1 * (alt * alt);
        		}
        }
        	else {
        		if (idade >= 18 && idade <= 64) {  
        			pesoIdeal = 21 * (alt * alt);
            	}

        		else if (idade >= 65 && idade <= 69) {
        			pesoIdeal = 26.5 * (alt * alt);
        		}
        		else if (idade >= 70 && idade <= 74) {
        			pesoIdeal = 25.3 * (alt * alt);
        		}
        		else if (idade >= 75 && idade <= 79) {
        			pesoIdeal = 26.1 * (alt * alt);
        		}
        		else if (idade >= 80 && idade <= 84) {
        			pesoIdeal = 23.7 * (alt * alt);
        		}
        		else if (idade > 85){
        			pesoIdeal = 23.1 * (alt * alt);
        		}
        } 
        return pesoIdeal;      
    }
}

