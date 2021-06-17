
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(111, 232);
		contaCorrente.deposita(100);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(121, 333);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10, contaPoupanca);
		
		System.out.println("CC: "+ contaCorrente.getSaldo());
		System.out.println("CP: "+ contaPoupanca.getSaldo());

	}

}
