package model.entities;

import java.util.Date;

public class AluguelCarro {
	
	private Date inicioLocacao;
	private Date fimLocacao;
	
	private Veiculo veiculo;
	private Pagamento pagamento;
	
	public AluguelCarro() {
		
	}

	public AluguelCarro(Date inicioLocacao, Date fimLocacao, Veiculo veiculo) {
		this.inicioLocacao = inicioLocacao;
		this.fimLocacao = fimLocacao;
		this.veiculo = veiculo;
	}

	public Date getInicioLocacao() {
		return inicioLocacao;
	}

	public void setInicioLocacao(Date inicioLocacao) {
		this.inicioLocacao = inicioLocacao;
	}

	public Date getFimLocacao() {
		return fimLocacao;
	}

	public void setFimLocacao(Date fimLocacao) {
		this.fimLocacao = fimLocacao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	

}
