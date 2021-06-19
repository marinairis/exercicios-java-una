package entidade;

public class Calculo {

	/*
	 * Esta função do código foi transformada em um método em outra classe para
	 * simplificar a leitura da classe principal, além de que agora este cálculo
	 * poderá ser reutilizado em outras clases ou partes do código.
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
				return "Esta é uma equação de primeiro grau. \n " + "Raiz da equação:" + (-c / b);
			}
		else {
			System.out.println("Esta é uma equação de segundo grau.");
			;

			delta = Math.pow(b, 2) - 4 * a * c;

			if (delta < 0)
				return "Esta equação não possui raízes reais. \n delta < 0. Delta: " + delta;
			else if (delta == 0) {
				return "Esta equação possui duas raízer reais iguais." + "\n Delta = 0" + "\n x' = x'' = "
						+ (-b / (2 * a));
			} else {
				return "Esta equação possui duas raízes reais diferentes." + "\n Delta = " + delta + "\n x' = "
						+ ((-b + Math.sqrt(delta)) / 2 * a) + "\n x'' = " + ((-b - Math.sqrt(delta)) / 2 * a);
			}
		}

	}

}
