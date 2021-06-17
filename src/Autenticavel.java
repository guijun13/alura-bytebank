// Interface -> classe abstrata com metodos abstratos
public abstract interface Autenticavel {
	
	// somente os metodos abstratos
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
