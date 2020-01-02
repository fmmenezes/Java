package model.entities;

public class Fatura {
	
	private Double valorBasico;
	private Double taxa;
	
	public Fatura() {
		
	}

	public Fatura(Double valorBasico, Double taxa) {
		
		this.valorBasico = valorBasico;
		this.taxa = taxa;
	}

	public Double getValorBasico() {
		return valorBasico;
	}

	public void setValorBasico(Double valorBasico) {
		this.valorBasico = valorBasico;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double valorTotal() {
		
		return getValorBasico() + getTaxa();
	}
	
	

}
