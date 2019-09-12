package entities;

public class ContaEmpresa extends Conta{
	
	private Double limiteCredito;
	
	public ContaEmpresa() {
		super();	
	}

	public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteCredito) {
		super(numero, titular, saldo);
		this.limiteCredito = limiteCredito;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void Emprestimo(double valor) {
		if(valor <= limiteCredito) {
			//deposito(valor);
			saldo += valor - 10.0;
		}
	}

}
