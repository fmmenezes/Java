package model.services;

import model.entities.Aluguel;

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
		
	}
	

}
