// Classe Gerente herda as caracteristicas da classe Funcionario
// e assina o contrato da interface Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	public Gerente() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Metodo de bonificacao do gerente");
		// super -> fala que o atributo eh da classe mae
		// super.getBonificacao() chama o metodo da classe mae
		return super.getSalario();
	}

	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
