
public class ContaPoupanca extends Conta {
	// como construtores nao sao herdados, é necessario fazer essa chamada
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
}
