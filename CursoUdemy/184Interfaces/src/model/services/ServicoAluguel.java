package model.services;

import model.entities.Aluguel;
import model.entities.Fatura;

public class ServicoAluguel {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	private ServicoTaxa servicoTaxa;
	
	public ServicoAluguel() {
		 
	} 

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, ServicoTaxa servicoTaxa) {
		
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.servicoTaxa = servicoTaxa;
	}
	
	public void processaFatura(Aluguel aluguel) {
		
		long dataInicioMs = aluguel.getInicio().getTime();
		long dataFimMs = aluguel.getFim().getTime();
		Double valorPagamento;
		
		double horas = (double)(dataFimMs - dataInicioMs) / 1000 / 60 / 60; 
		
		if (horas <= 12.0) {
			valorPagamento = Math.ceil(horas) * precoPorHora;
		}
		else {
			valorPagamento = Math.ceil(horas / 24) * precoPorDia;
		}
		
		double taxa = servicoTaxa.taxa(valorPagamento);
		
		aluguel.setFatura(new Fatura(valorPagamento, taxa));
		
	}
	

}
