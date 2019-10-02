public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Victor");
		Pessoa p2 = new Pessoa("Victor");
		Pessoa p3 = new Pessoa("Victor");
		Pessoa p4 = new Pessoa("Victor");
		Pessoa p5 = new Pessoa("Victor");
		Pessoa p6 = new Pessoa("Victor");
		Pessoa p7 = new Pessoa("Victor");
		System.out.println(p1.getNome());
		p1.setNome("Victor Gonzalez");
		System.out.println(p1.getNome());
		System.out.println(p1.getIdentificador());

	}
}
