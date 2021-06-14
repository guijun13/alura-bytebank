
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(1332, 1111);
		conta.deposita(100);
		System.out.println(conta.saca(200)); // nao acontece pois 200>100
		// conta.saldo() -> nao funciona mais pq saldo eh privado a classe Conta
		System.out.println(conta.getSaldo());
//		conta.setNumero(1223);
		System.out.println(conta.getNumero());
		
		Cliente jun = new Cliente();
		jun.setNome("Guilherme Jun Grillo");
		conta.setTitular(jun);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("estudante");
		
		Conta conta2 = new Conta(1321,132);
		
		System.out.println("Total de contas: " + Conta.getTotal());
		
		
	}
}
