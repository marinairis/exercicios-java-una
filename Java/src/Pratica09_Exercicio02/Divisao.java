package Pratica09_Exercicio02;

public class Divisao {

	public double operacaoDividir(double x, int y) throws ArithmeticException {
		if (x <= 0 | y <= 0) {
			throw new ArithmeticException("Você não pode dividir por ZERO!");
		} else if (y < 10) {
			throw new ArithmeticException("O 'divisor' deve ser MAIOR que 10!");
		} else {
			double divisao = (x / y);
			return divisao;
		}
	}
}
