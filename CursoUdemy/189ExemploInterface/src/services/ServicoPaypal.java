package services;

public class ServicoPaypal implements ServicoPagamentoOnline {
	
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double taxaPagamento(double valor) {
		return valor * FEE_PERCENTAGE;
	}
	
	@Override
	public double juro(double valor, int meses) {
		return valor = MONTHLY_INTEREST * meses;
	}
	

}
