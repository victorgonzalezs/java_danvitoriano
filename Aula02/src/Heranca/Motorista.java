package Heranca;

public class Motorista extends Funcionario {

	Motorista() {
		super();
	}

	Motorista(int xNumero, String xNome) {
		super(xNumero, xNome);
	}

	void dirige() {
		System.out.println("Motorista que dirige");
	}

	@Override
	void trabalha() {
		System.out.println("Motorista que trabalha");
	}
	
	public int getBonificacao() {
		return 60;
	}

}
