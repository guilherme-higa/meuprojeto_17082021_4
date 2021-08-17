package entities;

public class OrdemPedido {

	private Integer quantidade;
	private double preco;

	private Produto produto;
	
	public OrdemPedido() {
	}

	public OrdemPedido(Integer quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		return produto.getNome() + ", "+preco +", "+ "Quantidade: " +quantidade + ", "  + "Subtotal: "+subTotal() ;
	}
	
	

}
