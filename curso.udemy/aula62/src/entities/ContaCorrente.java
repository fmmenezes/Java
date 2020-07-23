package entities;

public class ContaCorrente {

	private int conta;
	private String titular;
	private double saldo;

	public ContaCorrente(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public ContaCorrente(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor + 5;
	}

	public String toString() {

		return "Conta " + conta + ", Titular: " + titular + ", Saldo: $ " + String.format("%.2f", saldo);
	}

}
