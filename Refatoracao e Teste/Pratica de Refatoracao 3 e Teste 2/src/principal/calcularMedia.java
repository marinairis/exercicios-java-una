package principal;

public class calcularMedia {

	/*
	 * Esta classe foi criada para calcular os valores, estes, com valores passados
	 * como par�metros na classe main. Nesta classe, h� tamb�m o calculo da m�dia,
	 * de forma a n�o ser necess�ria a repeti��o do c�lculo, como era feito no
	 * algor�tmo original. Assim evitamos a repeti��o de c�digo, n�o sendo
	 * necess�rio declarar dois vetores, assim como codificar o c�lculo duas vezes.
	 */
	
	public double calcuMedia(int a, int b, int c, int d) {
		double vet[] = { a, b, c, d };
		double soma = 0, media = 0;

		for (int i = 0; i < 4; i++) {
			soma = soma + vet[i];
			media = soma / 4;
		}
		return media;
	}
}
