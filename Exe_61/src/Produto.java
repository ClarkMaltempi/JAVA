import java.util.*;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private double estoque;
	
	Produto(){}
	
	Produto(int id, String nome, double preco, double estoque){
		
		this.id =id;
		this.nome =nome;
		this.preco =preco;
		this.estoque =estoque;
	}

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

	public double getEstoque() {
			
		return this.estoque;

	}

	public void setEstoque(double estoque) {
		
			this.estoque = estoque;
		
	}
	

}
