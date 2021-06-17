// Classe Gerente herda as caracteristicas da classe Funcionario
// e assina o contrato da interface Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();		
	}
	
	public double getBonificacao() {
		System.out.println("Metodo de bonificacao do gerente");
		// super -> fala que o atributo eh da classe mae
		// super.getBonificacao() chama o metodo da classe mae
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
