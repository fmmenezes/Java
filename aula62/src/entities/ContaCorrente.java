package entities;

public class ContaCorrente {

	public int conta;
	public String titular;
	public double saldo;

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= valor;
	}

	public String toString() {
		
		return "Conta " + conta + ", Titular: " + titular + ", Saldo: $ " + saldo;
	}

}
