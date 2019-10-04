package Heranca;

public class Funcionario {
	private int numero;
	private String nome;

	Funcionario() {

	}

	Funcionario(int xNumero, String xNome) {
		this.numero = xNumero;
		this.nome = xNome;
	}

	void trabalha() {
		System.out.println("Funcion�rio trabalha");
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public int getBonificacao() {
		return 10;
	}

}
