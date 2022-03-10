package Collections;

public class EstoqueLoja {

	private String produto;
	private double valor;
	private int quantidade;

	public EstoqueLoja(String produto, double valor, int quantidade) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "\n(Produto: " + produto + ", Valor: " + valor + ", quantidade: " + quantidade + ")";
	}

}
