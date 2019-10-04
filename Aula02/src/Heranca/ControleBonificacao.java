package Heranca;

public class ControleBonificacao {
	private int totalBonificacao = 0;
	
	void registra(Funcionario f) {
		totalBonificacao += f.getBonificacao();
	}
	
	public int getTotalBonificacao() {
		return totalBonificacao;
	}
}
