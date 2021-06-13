
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200)); // nao acontece pois 200>100
		// conta.saldo() -> nao funciona mais pq saldo eh privado a classe Conta
		System.out.println(conta.getSaldo());
		
		conta.setNumero(1223);
		System.out.println(conta.getNumero());
		
		Cliente jun = new Cliente();
		jun.setNome("Guilherme Jun Grillo");
		conta.setTitular(jun);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("estudante");
	}
}
