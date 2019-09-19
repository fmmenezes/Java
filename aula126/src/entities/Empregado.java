package entities;

public class Empregado {
	private String nome;
	private Integer hora;
	private Double valorHora;
	
	public Empregado() {
		
	}

	public Empregado(String nome, Integer hora, Double valorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagamento() {
		return hora * valorHora;
	}

}
