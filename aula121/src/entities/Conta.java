package entities;

public class Conta {
	private Integer numero;
	private String titular;
	private Double Saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.Saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return Saldo;
	}

	//public void setSaldo(Double saldo) {
	//	Saldo = saldo;
	//}
	
	public void saque(Double valor) {
		Saldo -= valor;
	}
	
	public void deposito(Double valor) {
		Saldo += valor;
	}
	
}
