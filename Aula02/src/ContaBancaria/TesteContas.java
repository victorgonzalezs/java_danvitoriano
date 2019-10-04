package ContaBancaria;

public class TesteContas {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca("Victor");
		ContaCorrente c2 = new ContaCorrente("Tiago", 12345);

		c1.depositar(100);
		c2.depositar(100);
		c2.saque(5);
		c1.saque(10);
		c2.saque(5);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		System.out.println(c1.getTipo());
		System.out.println(c2.getTipo());
	}
}
