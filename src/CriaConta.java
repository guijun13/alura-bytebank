
public class CriaConta {
	public static void main(String[] args) {
		// instancia/cria um objeto do tipo Conta
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;		
		primeiraConta.saldo += 100;
		System.out.println("primeira conta: "+ primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("segunda conta: " + segundaConta.saldo);
		
		
	}
}
