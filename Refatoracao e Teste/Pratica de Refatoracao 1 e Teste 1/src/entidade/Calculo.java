package entidade;

public class Calculo {

	/*
	 * Esta fun��o do c�digo foi transformada em um m�todo em outra classe para
	 * simplificar a leitura da classe principal, al�m de que agora este c�lculo
	 * poder� ser reutilizado em outras clases ou partes do c�digo.
	 */

	public String bhaskara(double x, double y, double z) {

		double a = x, b = y, c = z, delta;

		if (a == 0)
			if (b == 0)
				if (c == 0)
					return "Igualdade confirmada: 0 = 0";
				else
					return "Coeficientes informados incorretamente.";
			else {
				return "Esta � uma equa��o de primeiro grau. \n " + "Raiz da equa��o:" + (-c / b);
			}
		else {
			System.out.println("Esta � uma equa��o de segundo grau.");
			;

			delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0)
				return "Esta equa��o n�o possui ra�zes reais. \n delta < 0. Delta: " + delta;
			else if (delta == 0) {
				return "Esta equa��o possui duas ra�zer reais iguais." + "\n Delta = 0" + "\n x' = x'' = "
						+ (-b / (2 * a));
			} else {
				return "Esta equa��o possui duas ra�zes reais diferentes." + "\n Delta = " + delta + "\n x' = "
						+ ((-b + Math.sqrt(delta)) / 2 * a) + "\n x'' = " + ((-b - Math.sqrt(delta)) / 2 * a);
			}
		}

	}

}
