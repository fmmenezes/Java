package model.services;

import model.entities.AluguelCarro;

public class ServicoAluguel {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	private BrasilTaxaServico taxaServico;
	
	private ServicoAluguel() {
		
	}

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, BrasilTaxaServico taxaServico) {

		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxaServico = taxaServico;
		
	}
	
	public void processaPagamento(AluguelCarro aluguelCarro) {
		
	}
	
	

}
