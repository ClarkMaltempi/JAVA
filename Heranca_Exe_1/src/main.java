import java.util.*;

public class main {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		ArrayList<ContaCorrente> CC = new ArrayList();
		ArrayList<ContaPoupanca> CP = new ArrayList();
		ArrayList<ContaSalario> CS = new ArrayList();
		
		String agencia, numero;
		int id=0,idade=0, opcao=0;
		double saldo, chequeEspecial, saldoPoup, contaSal;

				
		do{
			
			
			opcao = Imprime();
			
			switch(opcao) {
				
			
			case 1://incluir
				 ContaCorrente c = new ContaCorrente(); 
				
			
	        	 System.out.println("Digite a agencia: ");
	     		 agencia = ler.next();
	     		 c.setAgencia(agencia);
	     		 
	     		 System.out.println("Digite o numero da conta: ");
	    		 numero = ler.next();
	    		 c.setNumero(numero);
	    		 
	    		 System.out.println("Digite o saldo da conta: ");
	    		 saldo = ler.nextDouble();
	    		 c.setSaldo(saldo);
	    		 
	    		 System.out.println("Digite o saldo da cheque Especial: ");
	    		 chequeEspecial = ler.nextDouble();
	    		 c.setChequeEspecial(chequeEspecial);
	    		 
	    		 CC.add(c);
	    		 
	    		 System.out.println("\n\nConta Corrente cadastrada com sucesso!!"); 
		         
	    	break;	
		
			case 2:
			
				ContaPoupanca poup = new ContaPoupanca();
				
				 System.out.println("Digite a agencia: ");
	     		 agencia = ler.next();
	     		 poup.setAgencia(agencia);
	     		 
	     		 System.out.println("Digite o numero da conta: ");
	    		 numero = ler.next();
	    		 poup.setNumero(numero);
	    		 
	    		 System.out.println("Digite o saldo da conta: ");
	    		 saldo = ler.nextDouble();
	    		 poup.setSaldo(saldo);
	    		 
	    		 System.out.println("Digite o saldo da Poupanca: ");
	    		 saldoPoup = ler.nextDouble();
	    		 poup.setRentabilidade(saldoPoup);
	    		 
	    		 CP.add(poup);
	    		 
	    		 System.out.println("\n\nConta Poupanca cadastrada com sucesso!!"); 
			

		break;
		
		case 3:
			
			ContaSalario cs = new ContaSalario();
			
			 System.out.println("Digite a agencia: ");
    		 agencia = ler.next();
    		 cs.setAgencia(agencia);
    		 
    		 System.out.println("Digite o numero da conta: ");
    		 numero = ler.next();
    		 cs.setNumero(numero);
   		 
    		 System.out.println("Digite o saldo da conta: ");
    		 saldo = ler.nextDouble();
    		 cs.setSaldo(saldo);
    		
    		 System.out.println("Digite o valor na conta Salario: ");
    		 contaSal = ler.nextDouble();
    		 cs.setContaSalario(contaSal);
    		 
    		 
    		 CS.add(cs);
   		 
    		 System.out.println("\n\nConta Poupanca cadastrada com sucesso!!"); 
			
		break;
		
		case 4:
			
			ExibeLista(CC,CP,CS);
				
		break;
		
			
		default:
			System.out.println("Numero Inválido!");
		break;
		
		case 9:
			System.out.println("\n Você escolheu Sair!!\n");
		break;
		
		}
			
		}while(opcao != 9);
		
	}
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("===> Sistema de Cadastro de Contas <===\n\n");
         System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n\n1 - Conta Corrente \n" +
                 "2 - Conta Poupança \n" +
                 "3 - Conta Salario\n" +
                 "4 - Exibir Contas\n"+
                 "9 - Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 opcao = ler.nextInt();
		 
		 return opcao;

	}
	
	public static void ExibeLista(ArrayList<ContaCorrente> CC, ArrayList<ContaPoupanca> CP, ArrayList<ContaSalario> CS) {
		
		if(!CC.isEmpty()) {
			for(ContaCorrente a: CC) {
				
				System.out.printf("\nAgencia: %s\n Numero: %s\n Saldo:%.2f\n Cheque Especial: %f\n\n ",a.getAgencia(),a.getNumero(),a.getSaldo(),a.getChequeEspecial());
			}
		}else {
					System.out.println("Nenhuma informacao para Conta Corrente");
				
			}
		
		if(!CP.isEmpty()) {
			for(ContaPoupanca b: CP) {
				
				System.out.printf("\nAgencia: %s\n Numero: %s\n Saldo:%.2f\n Rentabilidade: %f\n ",b.getAgencia(),b.getNumero(),b.getSaldo(),b.getRentabilidade());
			}
	}else {
			
			System.out.println("Nenhuma informacao para Poupança");
		}
		
		if(!CS.isEmpty()) {
			for(ContaSalario c: CS) {
				
				System.out.printf("\nAgencia: %s\n Numero: %s\n Saldo:%.2f\n  ",c.getAgencia(),c.getNumero(),c.getSaldo(),c.getContaSalario());
			}
		
		}else {
			
			System.out.println("Nenhuma informacao para Salario");
		}
		
	}
	
}


