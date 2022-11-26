
public class ItemPedido extends Produtos {
	
	private int id;
	private Produtos produto;
	private double quantidade;
	
	
	ItemPedido(){}
	
	ItemPedido(int id, Produtos produto, double quantidade){
		this.id =id;
		this.produto = produto;
		this.quantidade = quantidade;
	
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
	
			this.quantidade = quantidade;
	}


	public void printDadosItem() {
		System.out.printf("Id: %d Nome: %s Quantidade: %.0f\n", this.id, this.produto.getNome(), this.quantidade);
	}
}