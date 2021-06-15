
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario jun = new Funcionario();
		jun.setNome("Guilherme Jun");
		jun.setCpf("828291028-98");
		jun.setSalario(3000);
		
		System.out.println(jun.getNome());
		System.out.println(jun.getCpf());
		System.out.println(jun.getSalario());
	}

}
