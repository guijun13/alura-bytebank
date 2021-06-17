
public class ContaCorrente extends Conta {
	// como construtores nao sao herdados, é necessario fazer essa chamada
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
}
