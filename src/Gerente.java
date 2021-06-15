
public class Gerente extends Funcionario { // Classe Gerente herda as caracteristicas da classe Funcionario

	private int senha;	
	
	public Gerente() {
		
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		// super -> fala que o atributo eh da classe mae
		// super.getBonificacao() chama o metodo da classe mae
		return super.getBonificacao() + super.getSalario();
	}

	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
