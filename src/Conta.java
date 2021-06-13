class Conta { 
	// atributos
    private double saldo; // quando um atributo eh privado, ele nao pode ser lido nem alterado em outra classe
    int agencia;
    int numero;
//    String titular;
    Cliente titular;
    
    // métodos
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    public boolean saca(double valor) {
    	if(this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean transfere(double valor, Conta destino) {
//    	if(this.saldo >= valor) {
//    		this.saldo -= valor;
//    		destino.deposita(valor);
//    		return true;
//    	}
//    	return false;
    	if(this.saca(valor)) {
    		destino.deposita(valor);
    		return true;
    	}
    	return false;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
}