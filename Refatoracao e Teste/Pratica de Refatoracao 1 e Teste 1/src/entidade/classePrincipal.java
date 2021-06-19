package entidade;

/*
 * Em linguagem de programação Java, implemente um algoritmo que resolva uma
 * equação de segundo grau, realizando consistências dos valores dos
 * coeficientes (“a”, “b” e “c”) e do discriminante (delta), conforme descrito
 * abaixo. 
 * a. Se os coeficientes “a” e “b” forem iguais a zero e o coeficiente
 * “c” for diferente de zero, apresentar a mensagem “Coeficientes informados
 * incorretamente”. Se o coeficiente “c” for zero, apresentar a mensagem
 * "Igualdade confirmada: 0 = 0". 
 * b. Caso o coeficiente “a” seja igual a zero e
 * o coeficiente “b” for diferente de zero, deverá ser impressa a mensagem:
 * “Esta é uma equação de primeiro grau” e deverá ser apresentado o valor da
 * raiz real da equação. 
 * c. Caso o discriminante seja negativo, deverá ser
 * impressa a mensagem: “Esta equação não possui raízes reais”. 
 * d. Caso o discriminante seja zero, apresentar a mensagem “Esta equação possui duas
 * raízes reais iguais”. Em seguida, apresentar o valor das raízes da equação.
 * e. Caso o discriminante seja maior que zero, apresentar a mensagem “Esta
 * equação possui duas raízes reais diferentes”. Em seguida, apresentar o valor
 * das raízes da equação. 
 * Equação do segundo grau: ax2 + bx + c = 0
 * Discriminante:  = b2 – 4ac
 */
import java.util.Scanner;

public class classePrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double a, b, c;
		String resposta = "";

		Imprimir copy = new Imprimir();

		System.out.println("Para 'Finalizar' o algoritmo digite um valor 'Negativo'." + "\r");

		copy.imprimirCoeficiente("a");
		a = teclado.nextDouble();

		copy.imprimirCoeficiente("b");
		b = teclado.nextDouble();

		copy.imprimirCoeficiente("c");
		c = teclado.nextDouble();

		do {
			Calculo calcular = new Calculo();
			System.out.println(calcular.bhaskara(a, b, c));

			System.out.println("Deseja continuar o programa? [Sim] ou [Não]");
			resposta = teclado.next();

			if (resposta.equalsIgnoreCase("sim") | resposta.equalsIgnoreCase("s")) {

				copy.imprimirCoeficiente("a");
				a = teclado.nextDouble();

				copy.imprimirCoeficiente("b");
				b = teclado.nextDouble();

				copy.imprimirCoeficiente("c");
				c = teclado.nextDouble();

			} else {
				System.out.println("\n// FIM DO PROGRAMA //");
				teclado.close();
			}

		} while (resposta.equalsIgnoreCase("sim") | resposta.equalsIgnoreCase("s"));

	}

}
