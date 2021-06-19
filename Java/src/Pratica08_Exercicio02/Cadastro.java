package Pratica08_Exercicio02;

public class Cadastro {
	
	private int quantPessoaF, quantPessoaJ;
	private String nomePessoaF[];
	private String cpfPessoaF[];
	private String nomePessoaJ[];
	private String cnpjPessoaJ[];

	public void setQuantPessoaF(int quantPessoaF) {
		this.quantPessoaF = quantPessoaF;
		this.nomePessoaF = new String[quantPessoaF];
		this.cpfPessoaF = new String[quantPessoaF];
	}

	public void setQuantPessoaJ(int quantPessoaJ) {
		this.quantPessoaJ = quantPessoaJ;
		this.nomePessoaJ = new String[quantPessoaJ];
		this.cnpjPessoaJ = new String[quantPessoaJ];
	}

	public void implementarPessoaF(int i, PessoaFisica pessoaFisica) {
		this.nomePessoaF[i] = pessoaFisica.getNome();
		this.cpfPessoaF[i] = pessoaFisica.getCpf();

	}

	public void implementarPessoaJ(int i, PessoaJuridica pessoaJuridica) {
		this.nomePessoaJ[i] = pessoaJuridica.getNome();
		this.cnpjPessoaJ[i] = pessoaJuridica.getCnpj();

	}

	public void imprimirPessoaF() {

		System.out.println("\n---- Pessoa Física -----");
		for (int i = 0; i < quantPessoaF; i++) {
			System.out.println("\nNome: " + nomePessoaF[i] + " CPF: " + cpfPessoaF[i]);

		}
	}

	public void imprimirPessoaJ() {

		System.out.println("\n---- Pessoa Jurídica ----");
		for (int i = 0; i < quantPessoaJ; i++) {
			System.out.println("\nNome: " + nomePessoaJ[i] + " CPF: " + cnpjPessoaJ[i]);

		}
	}

}
