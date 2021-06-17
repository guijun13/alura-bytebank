
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Pedro o Gerente");
		g1.setCpf("9039021212-1");
		g1.setSalario(9000);
		
//		System.out.println(g1.getNome());
//		System.out.println(g1.getCpf());
//		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
//		System.out.println(autenticou);
		
//		System.out.println(g1.getBonificacao());
		
		// ---------------------------------------------
		
		Funcionario g2 = new Gerente();
		g2.setNome("Marcos o Gerente 2");
		g2.setCpf("9039021212-1");
		g2.setSalario(9000);
		
		// nao funciona pq a classe Funcionario tem abstract
//		Funcionario f = new Funcionario();
//		f.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(controle.getSoma());
		
	}

}
