package principal;

public class Main {

	public static void main(String[] args) {

		/*
		 * Foram refatoradas: repeti��es de declara��o de vetor repeti��es de c�lculo de
		 * media. 
		 */
		calcularMedia vet1 = new calcularMedia();
		System.out.println("Média do vetor 1: " + vet1.calcuMedia(90, 88, 78, 76));

		calcularMedia vet2 = new calcularMedia();
		System.out.println("Média do vetor 2: " + vet2.calcuMedia(865, 564, 43, 12));

	}
}
