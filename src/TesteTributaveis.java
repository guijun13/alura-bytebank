
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1212, 2121);
		cc.deposita(100);
		
		SeguroVida seguroVida = new SeguroVida();
		
		CalculadorImposto calculadoraImposto = new CalculadorImposto();
		calculadoraImposto.registra(cc);
		calculadoraImposto.registra(seguroVida);
		
		System.out.println(calculadoraImposto.getTotalImposto());
	}

}
