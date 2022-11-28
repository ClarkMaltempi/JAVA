package pkgHumb;

public class Refrigerante extends Produtos {
  private String Marca;
  
	Refrigerante() {}
  Refrigerante(String marca, int id, String nome, double preco, double estoque) {
    super(id,nome,preco, estoque);

    this.Marca = marca;
  }

  public String getMarca() {
    return this.Marca;
  }
  
  public void setMarca(String marca) {
    this.Marca = marca;
  } 

  public String getDescription() {
    return String.format("%s %s", this.getNome(),this.Marca); // formatação de string
  } 
}
