
import java.util.*;

public class Exe55_Encapsulamento {
	

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] cadastrar = new Cliente[3];
		
		
		String nome="", email="", agencia="", numero="";
		int id=0,idade=0;
		double saldo=0;
		char possuiConta;
		
		
		
		for(int i=0;i<=2;i++){
			
		Cliente c = new Cliente();
			
		System.out.println("Digite o id do cliente: ");
		id = ler.nextInt();
		c.setId(id);
			
		System.out.println("Digite o nome do cliente: ");
		nome = ler.next();
		c.setNome(nome);
		
		System.out.println("Digite a idade do cliente: ");
		//c.setIdade(ler.nextInt(idade));
		idade = ler.nextInt();
		c.setIdade(idade);
		
		System.out.println("Digite o email do Cliente: ");
		//c.setEmail(ler.next(email));
		email = ler.next();
		c.setEmail(email);
		
		
		 System.out.printf("Possui conta Bancaria? (S/N)");
		 possuiConta = ler.next().charAt(0);
         
         if (possuiConta == 'S') {
        	 
        	 
        	 System.out.println("Digite a agencia: ");
     		 agencia = ler.next();
     		 
     		 
     		 System.out.println("Digite o numero da conta: ");
    		 numero = ler.next();
    		 
    		 System.out.println("Digite o saldo da conta: ");
    		 saldo = ler.nextDouble();
    		 
    		// Instancia conta Bancária
        	 ContaBancaria conta = new ContaBancaria(agencia,numero, saldo);
    		 
        	 c.setConta(conta);
			
		}
      // Adiciona o objeto no array "cadastrar"
         cadastrar[i] = c;
	}
		
		for (int i=0; i<=2; i++) {
			
			
            System.out.printf("\nCliente %d criado com sucesso (%s)!", cadastrar[i].getId(), cadastrar[i].getNome());
         
            
            if (cadastrar[i].getConta() != null) {
            	System.out.printf("\n Dados da Conta: %s", cadastrar[i].exibirDadosConta());
             
            }

	 }
	 


	}
}
