
public class ContaPoupanca extends Conta {
	
	private double rentabilidade;
	
	public double getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade*0.02;
	}

	ContaPoupanca(){}
	
	ContaPoupanca(String agencia, String numero, double saldo, double rentabilidade){
		super(agencia, numero, saldo);
		this.rentabilidade = rentabilidade;
	}

}
