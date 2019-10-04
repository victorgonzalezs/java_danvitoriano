package Heranca;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(123, "Victor");

		Motorista m1 = new Motorista(4456, "Gonzalez");

		Funcionario[] arrayFunc = new Funcionario[3];
		arrayFunc[0] = f1;
		arrayFunc[1] = m1;
		arrayFunc[2] = new Funcionario(666, "Satan");

		System.out.println(arrayFunc[0].getNome());
		arrayFunc[1].trabalha();
		arrayFunc[2].trabalha();
		
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(f1);
		cb.registra(arrayFunc[1]);
		
		System.out.println(cb.getTotalBonificacao());
		
	}
}
