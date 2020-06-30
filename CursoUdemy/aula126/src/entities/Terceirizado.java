package entities;

public class Terceirizado extends Empregado{
	
	private Double valorAdicional;
	
	public Terceirizado() {
		super();
	}

	public Terceirizado(String nome, Integer hora, Double valorHora, Double valorAdicional) {
		super(nome, hora, valorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}

	

}
