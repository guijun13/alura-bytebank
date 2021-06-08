
public class TestaBanco {

	public static void main(String[] args) {
		// instanciando um cliente
		Cliente jun = new Cliente();
		jun.nome = "Guilherme Jun";
		jun.cpf = "111.111.111.-11";
		jun.profissao = "estudante";
		
		// instanciando uma conta
		Conta contaDoJun = new Conta();
		contaDoJun.deposita(100);
		
		contaDoJun.titular = jun;
		System.out.println(contaDoJun.titular.nome);
		
		// instancia uma nova Conta e Cliente, associando-os
		Conta contaDoRyo = new Conta();
		contaDoRyo.titular = new Cliente();
		contaDoRyo.titular.nome = "Gustavo Ryo";
		System.out.println(contaDoRyo.titular.nome);
	}

}
