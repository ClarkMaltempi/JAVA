import java.util.ArrayList;

import java.util.ArrayList;

public class ContaBancaria {
    private String agencia;
    private String numero;
    private double saldo;
    private double limite;
    private ArrayList<String> extrato;
   
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
    public double getLimite() {
        return limite;
    }
    public ArrayList<String> getExtrato() {
        return extrato;
    }
    public void setExtrato(ArrayList<String> extrato) {
        this.extrato = extrato;
    }
   
    public ContaBancaria() {
        this.extrato = new ArrayList<>();
        this.limite = 75.0;
        this.agencia = "4422";
    }
   
    public ContaBancaria(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }
   
    public void Depositar(double valor, Boolean transferencia) {
        double aux;
        if (this.limite < 75) {
            this.limite = this.limite + valor;
            if (this.limite > 75) {
                aux = this.limite - 75.0;
                this.limite = 75.0;
                this.saldo = this.saldo + aux;
            }
        }
        else {
            this.saldo = this.saldo + valor;
        }
 
        if (!transferencia)
            this.extrato.add("+ Depósito $" + valor);
    }
   
    public Boolean Sacar(double valor, Boolean transferencia) {
        double aux;
        if ((this.saldo + this.limite ) >= valor) {
            aux = this.saldo - valor;
            if (aux < 0) {
                this.saldo = 0;
                this.limite = this.limite + aux;
            }
            else {
                this.saldo = this.saldo - valor;
            }
 
            if (!transferencia)
                this.extrato.add("- Saque $" + valor);
           
            return true;
        }
        else {
            return false;
        }
    }
   
    public void Transferir(double valorTransf, Cliente destinatario, Cliente origem) {
        Sacar(valorTransf, true);
        this.extrato.add("- Transferência $" + valorTransf + " para " + destinatario.getNome());
       
        destinatario.getConta().Depositar(valorTransf, true);
        destinatario.getConta().extrato.add("+ Transferência $" + valorTransf + " do(a) " + origem.getNome());
    }
   
    public double ConsultarSaldo() {
        return this.saldo;
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
