
public class Hamburger extends Produtos {
	private String Tipo;

	Hamburger() {}
  Hamburger(String tipo, int id, String nome, double preco, double estoque) {
    super(id,nome,preco, estoque);
    
    this.Tipo = tipo;
  }

  public String getTipo() {
    return this.Tipo;
  }
  
  public void setTipo(String tipo) {
    this.Tipo = tipo;
  }  
  
  public String getDescription() {
    String description = this.getNome() + " (" + this.Tipo + ")";
    return description;
  } 
}