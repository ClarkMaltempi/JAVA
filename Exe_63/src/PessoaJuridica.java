
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	PessoaJuridica(){}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	PessoaJuridica(int id, String nome, String idade, String cnpj){
		super(id, nome, idade);		
		this.cnpj = cnpj;
		
	}

}
