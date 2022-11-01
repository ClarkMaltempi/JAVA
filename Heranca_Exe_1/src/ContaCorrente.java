
public class ContaCorrente extends Conta {
	
	double ChequeEspecial;
	
	ContaCorrente(){}
	
	ContaCorrente(String agencia, String numero, double saldo, double chequeEspecial){
		super(agencia, numero, saldo);
		this.ChequeEspecial = chequeEspecial;
		
	}

	public double getChequeEspecial() {
		return ChequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		ChequeEspecial = chequeEspecial;
	}
	

}
