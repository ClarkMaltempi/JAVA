
public class ItemPedido {
	
	private int id;
	private String nome;
	private Produtos produto;
	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private Produtos Tipo;
	private double quantidade;
	
	
	ItemPedido(){}
	
	ItemPedido(int id, Produtos Tipo, double quantidade){
		this.id =id;
		this.Tipo = Tipo;
		this.quantidade = quantidade;
	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Produtos getTipo() {
		return Tipo;
	}

	public void setTipo(Produtos tipo) {
		Tipo = tipo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
	
			this.quantidade = quantidade;
	}

}
