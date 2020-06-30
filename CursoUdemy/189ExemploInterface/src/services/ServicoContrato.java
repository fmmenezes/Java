package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contrato;
import entities.Parcela;

public class ServicoContrato {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processaContrato(Contrato contrato, int meses) {
		double valorBasicoCota = contrato.getValorTotalContrato() / meses;
		
		for(int i = 1; i <= meses; i++) {
			Date data = addMeses(contrato.getDataContrato(), i);
			double atualizaCota = valorBasicoCota + servicoPagamentoOnline.juro(valorBasicoCota, i);
			double valorTotalCota = atualizaCota + servicoPagamentoOnline.taxaPagamento(atualizaCota);
			contrato.addParcela(new Parcela(data, valorTotalCota));
			
		}
					
	}
	
	private Date addMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
		
	}

}
