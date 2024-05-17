
public class CaixaEletronico {
	
	private float saida;
	private float entrada;
	ContaTerminal conta;
	
	
	public void depositar(float entrada) {
		conta.setSaldo(entrada);
	}
	
	
	public CaixaEletronico() {
		
	}	
	
	

	public CaixaEletronico(float saida, float entrada, ContaTerminal conta) {
		super();
		this.saida = saida;
		this.entrada = entrada;
		this.conta = conta;
	}


	public float getSaida() {
		return saida;
	}
	
	public void setSaida(float saida) {
		this.saida = saida;
	}
	public float getEntrada() {
		return entrada;
	}
	public void setEntrada(float entrada) {
		this.entrada = entrada;
	}
	
}
