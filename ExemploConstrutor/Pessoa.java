
public class Pessoa {
	
	public int id;
	public String nome;
	public Dependente dependente;
	
	
	Pessoa(){}//Construtor padrão - default
	
	Pessoa(int id, String nome, Dependente dep){//Construtor não padrão com assinatura "entrada de paramentros"
        this.id = id;
        this.nome = nome;
        this.dependente = dep;
    }
	
	 
    public void transformarNomeMaiusculo() {
        this.nome = this.nome.toUpperCase();
    }
    
    
    public String exibirIdNome() {
        return (this.id + " - " + this.nome);
    }
    
    
    public void mudarNome(String novoNome) {
        this.nome = novoNome;
        
    }
    
    
    public String exibirDependente() {
        return ("Nome: " + this.dependente.nome + " - " + "Idade: " + this.dependente.idade);
    }


	
}



