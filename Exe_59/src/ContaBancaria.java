
public class ContaBancaria {
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String agencia;
	private String numero;
	private double saldo;
	
	
	ContaBancaria(){}
	
	ContaBancaria(String agencia,String numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;

	}
	
	
	public void Depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void Sacar(double valorSaque) {
		
		if(this.saldo > valorSaque) {
			this.saldo = this.saldo - valorSaque;
		}else {
			System.out.println("\nSaldo Insuficiente!\n");
		}
	}
	
	public void Transferir(double valorTransf, Cliente destinatario) {
		
		destinatario.getConta().setSaldo(valorTransf);

	}
	
	public double ConsultarSaldo() {
		
		return this.getSaldo();
	}
	
	

}
