// com abstract, nao permite instanciar objetos (new) dessa classe
// nao funciona mais -> Funcionario f = new Funcionario();
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario; // protected -> public para os filhos, mas private para outras classes
	
	public Funcionario() {
		
	}
		
	// metodo abstrato
	// aqui nao ha uma implementacao, mas sim nos filhos	
	public abstract double getBonificacao();
			
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
