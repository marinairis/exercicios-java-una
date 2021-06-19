package principal;

public class Main {

	public static void main(String[] args) {

		/*
		 * Foram refatoradas: repetições de declaração de vetor repetições de cálculo de
		 * media. 
		 */
		calcularMedia vet1 = new calcularMedia();
		System.out.println("MÃ©dia do vetor 1: " + vet1.calcuMedia(90, 88, 78, 76));

		calcularMedia vet2 = new calcularMedia();
		System.out.println("MÃ©dia do vetor 2: " + vet2.calcuMedia(865, 564, 43, 12));

	}
}
