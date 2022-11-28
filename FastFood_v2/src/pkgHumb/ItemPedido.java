package pkgHumb;

public class ItemPedido {
	
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
		System.out.printf("Id: %d \nNome Produto: %s \nQuantidade: %.0f\n", this.id, this.produto.getNome(), this.quantidade);
	}
	
	public double Calcpreco(){ //Valor dos Itens Pedidos
		
		System.out.printf("Subtotal: %.2f\n", this.quantidade*this.produto.getPreco());
		System.out.println("----------------------------------");
		double soma=0;
		soma += this.quantidade*this.produto.getPreco();//Armazena em uma variável a soma total dos Produtos
		
		return soma;
	}
	
	
}