package pkgHumb;

public class BatataFrita extends Produtos {  
  private String Tamanho;
  
	BatataFrita() {}
  BatataFrita(String tamanho, int id, String nome, double preco, double estoque) {
    super(id,nome,preco, estoque);

    this.Tamanho = tamanho;
  }

  public String getTamanho() {
    return this.Tamanho;
  }
  
  public void setTamanho(String tamanho) {
    this.Tamanho = tamanho;
  }  

  public String getDescription() {
    String description = this.getNome() + " tamanho " + this.Tamanho;
    return description;
  }
}
