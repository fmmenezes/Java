package entities;

public class ProdutoImportado extends Produto{
	private Double taxaImportacao;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	public double precoTotal() {
		return getPreco() + taxaImportacao;
	}
	
	@Override
	public String precoEtiqueta() {

		return getNome() + " $ " + String.format("%.2f", precoTotal()) + " (Customs fee: $ " + String.format("%.2f", taxaImportacao) + ")";

	}

}

