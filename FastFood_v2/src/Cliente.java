
public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	
	Cliente(){}
	
	Cliente(int id, String nome, String email){
		this.id = id;
		this.nome = nome;
		this.email =email;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void printDadosCliente() { // Dados para impressão dos dados do Cliente
		System.out.printf("Id do cliente: %d\n", this.id);
		System.out.printf("Nome do cliente: %s\n", this.nome);
		System.out.printf("Email do cliente: %s\n", this.email);
	}
}