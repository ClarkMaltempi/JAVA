import java.util.ArrayList;

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
	private double limite;
	private ArrayList<String> extrato;
	
	
	ContaBancaria(){
		 this.extrato = new ArrayList<>();
	     this.limite = 75.0;
	     this.agencia = "4422";
	}
	
	ContaBancaria(String agencia,String numero, double saldo){
		this.agencia = agencia;
		this.numero = numero;
	    this.saldo = saldo;

	}
	
	
	public void Depositar(double valorDeposito) {
		 double aux;
	        if (this.limite < 75) {
	            this.limite = this.limite + valorDeposito;
	            if (this.limite > 75) {
	                aux = this.limite - 75.0;
	                this.limite = 75.0;
	                this.saldo = this.saldo + aux;
	            }

	        }
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
	
	public String ConsultarExtrato() {
		
		 String resultado = "";
	        for(String op: extrato) {
	            resultado = resultado + op + "\n";
	        }
	       
	        if (resultado == "")
	            resultado = "Cliente não possui movimentações na conta!";
	        else
	            resultado = "Extrato: \n" + resultado;
	       
	        return resultado;

		
	}
	
	

}