package services;

public interface ServicoPagamentoOnline {
	
	double taxaPagamento(double valor);
	double juro(double valor, int meses);

}
