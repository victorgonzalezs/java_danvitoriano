package ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

	ContaPoupanca(String nome) {
		super(nome);
	}

	ContaPoupanca(String nome, int numero) {
		super(nome, numero);
	}

	public String getTipo() {
		return "Conta Poupança";
	}
}
