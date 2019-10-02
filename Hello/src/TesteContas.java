
public class TesteContas {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("Victor");
		ContaBancaria c2 = new ContaBancaria("Tiago", 12345);

		c1.depositar(100.50);
		c2.depositar(20500);
		c2.saque(2000);
		c1.depositar(500);
		c2.saque(300);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}
}
