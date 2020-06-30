package model.services;

import model.entities.AluguelCarro;
import model.entities.Pagamento;

public class ServicoAluguel {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	private BrasilTaxaServico taxaServico;
	
	public ServicoAluguel() {
		
	}

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, BrasilTaxaServico taxaServico) {

		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
		
	}
	
	public void processaPagamento(AluguelCarro aluguelCarro) {
		
		long tempoInicio = aluguelCarro.getInicioLocacao().getTime();
		long tempoFim = aluguelCarro.getFimLocacao().getTime();
		double horasDif = (double)(tempoFim - tempoInicio) / 1000 / 60 / 60;
		
		double valorBruto;
		if(horasDif < 12.0) {
			valorBruto = Math.ceil(horasDif) * precoPorHora;
		} else {
			valorBruto = Math.ceil(horasDif / 24) * precoPorDia;
		}
		
		double taxaPagamento = taxaServico.taxa(valorBruto);
		
		aluguelCarro.setPagamento(new Pagamento(valorBruto,taxaPagamento));
		
	}
	
	

}
