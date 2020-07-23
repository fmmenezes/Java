package entities;

import java.util.Date;

public class ContratoHora {
	
	private Date dataContrato;
	private Double valorHora;
	private Integer hora;
	
	public ContratoHora() {
		
	}

	public ContratoHora(Date dataContrato, Double valorHora, Integer hora) {
		this.dataContrato = dataContrato;
		this.valorHora = valorHora;
		this.hora = hora;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
	public double valorTotal() {
		
		return valorHora * hora;
	}

}
