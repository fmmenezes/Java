package services;

import java.security.InvalidParameterException;

public class ServicoJurosBrasil {
	
	private double taxaJuros;

	public ServicoJurosBrasil(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double pagamento (double valorPagamento, int quantidadeMeses) {
		
		if (quantidadeMeses < 1) {
			throw new InvalidParameterException("Quantidade de meses deve ser maior que zero");
		}
		return valorPagamento * Math.pow(1.0 + taxaJuros / 100.0, quantidadeMeses);
	}

}
