
public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	PessoaFisica(){}
	
	PessoaFisica(int id, String nome, String idade, String cpf){
		super(id, nome, idade);		
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
