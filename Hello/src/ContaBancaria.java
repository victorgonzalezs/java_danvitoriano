public class ContaBancaria {

	private String titular;
	private double saldo;
	private int numero;

	ContaBancaria(String nome) {
		this.titular = nome;
	}

	ContaBancaria(String nome, int numero) {
		this.titular = nome;
		this.numero = numero;
	}

	public String getSaldo() {
		return "Saldo de " + this.saldo + " para " + this.titular + " na conta " + this.numero;
	}

	public void depositar(double valor) {
		System.out.println("Recebido deposito de " + valor + " para " + this.titular + " na conta " + this.numero);
		this.saldo += valor;
	}

	public void saque(double valor) {
		System.out.println("Realizado saque de " + valor + " para " + this.titular + " na conta " + this.numero);
		this.saldo -= valor;
	}
}
