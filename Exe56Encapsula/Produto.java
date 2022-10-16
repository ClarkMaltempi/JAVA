
public class Produto {
	
	private String nome;
	private double preco;
	private double quantidade;
	private Categoria categoria;
	
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	Produto(){}
	
	Produto(int id, String nome, double preco, double quantidade, Categoria categoria){}
	
	public String exibirNomePreco() {
		
		return "";
	}

	public String exibirNomeQuantidade() {
		return "";
	}
}
