
public class Cliente {
	
	int id;
	String nome;
	int idade;
	String email;
	ContaBancaria conta;
	
	Cliente(){}
	
	Cliente(int id,String nome, int idade,String email, ContaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail){
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		return (this.nome + "-"+this.idade);
	} 
	
	public String exibirDadosConta() {
		return ("\nAg: "+this.conta.agencia+"\nC/C: "+this.conta.numero+"\nSaldo: "+this.conta.saldo);
	}
	

}
