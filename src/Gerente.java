
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
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

//	public double getBonificacao() {
//		return this.salario;			
//	}
}
