
public class ContaSalario extends Conta {
	
	private double contaSalario;
	
	ContaSalario(){}
	
	ContaSalario(String agencia, String numero, double saldo, double contaSalario){
		super(agencia, numero, saldo);
		this.contaSalario = contaSalario;
	}

	public double getContaSalario() {
		return contaSalario;
	}

	public void setContaSalario(double contaSalario) {
		this.contaSalario = contaSalario;
	}
}
