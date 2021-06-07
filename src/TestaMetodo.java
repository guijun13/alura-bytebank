
public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo = 100;
		// invoca metodo deposita
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		// invoca metodo saca
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoJun = new Conta();
		contaDoJun.deposita(1000);
				
		if(contaDoJun.transfere(300, conta)) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(conta.saldo);
		System.out.println(contaDoJun.saldo);

	}

}
