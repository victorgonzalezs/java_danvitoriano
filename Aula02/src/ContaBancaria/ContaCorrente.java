package ContaBancaria;

public class ContaCorrente extends ContaBancaria {

	private double tarifaSaque = 0.10;
	
	ContaCorrente(String nome) {
		super(nome);
	}

	ContaCorrente(String nome, int numero) {
		super(nome, numero);
	}

	public void saque(double valor) {
		super.saque(valor, tarifaSaque);
	}

	public String getTipo() {
		return "Conta Corrente";
	}
}
