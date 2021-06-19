package principal;

public class calcularMedia {

	/*
	 * Esta classe foi criada para calcular os valores, estes, com valores passados
	 * como parâmetros na classe main. Nesta classe, há também o calculo da média,
	 * de forma a não ser necessária a repetição do cálculo, como era feito no
	 * algorítmo original. Assim evitamos a repetição de código, não sendo
	 * necessário declarar dois vetores, assim como codificar o cálculo duas vezes.
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
