import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		//Cliente[] cadastrar = new Cliente[5];
		ArrayList<Cliente> ListaClientes = new ArrayList<>(); 
		
		
		String nome, email, agencia, numero;
		int id=0,idade=0, opcao=0, idTransf;
		double saldo, valDeposito, valSaque, valTrasnf;
		int indexCliente;
		//char possuiConta;
		
		
		do{
			
			opcao = Imprime();
			
			switch(opcao) {
				
			
		case 1://incluir
				Cliente c = new Cliente(); 
				id = ListaClientes.size() + 1;
				c.setId(id);
					
				System.out.println("Digite o nome do cliente: ");
				nome = ler.next();
				c.setNome(nome);
				
				System.out.println("Digite a idade do cliente: ");
				idade = ler.nextInt();
				c.setIdade(idade);
				
		    		 System.out.println("Digite o saldo da conta: ");
		    		 saldo = ler.nextDouble();
		    		 
		    		// Instancia conta Bancária
		    		 ContaBancaria conta_ = new ContaBancaria();
		          	 c.setConta(conta_);
		        	 
		          	conta_.setNumero("00" + String.valueOf(id));
		        	conta_.setSaldo(saldo);
		        	 
		        	 ListaClientes.add(c);
		    		        
		break;	
		/*
		case 2:
			
			ExibeLista(ListaClientes);
			
			System.out.println("\n\nQual cliente Deseja Atualizar?\n");
			id = ler.nextInt();
			
			
			Cliente cliente = ListaClientes.get(id-1);
			
			
			System.out.println("Digite novo nome do cliente: ");
			nome = ler.next();
			cliente.setNome(nome);
			
			System.out.println("Digite nova idade do cliente: ");
			idade = ler.nextInt();
			cliente.setIdade(idade);
				        	
	    
	    		 System.out.println("Digite novo saldo da conta: ");
	    		 saldo = ler.nextDouble();
	    		 
	    		// Instancia conta Bancária
	        	 ContaBancaria conta = new ContaBancaria();
	          	 cliente.setConta(conta);
	        	 
	          	
	          	conta.setSaldo(saldo); 
	        	 
	        	 ListaClientes.add(cliente);
	    		
	         		
	         	
	         System.out.println("\n\nCliente atualizado com sucesso!!");
			
		break;
		*/
		/*
		case 3:
			
			ExibeLista(ListaClientes);
			System.out.println("\n\nDigite o ID de Qual cliente Deseja Remover?\n");
			
			id = ler.nextInt();
			
			ListaClientes.remove(id-1);
			System.out.println("\n\nCliente Removido com sucesso!!!\n");
			
		break;
		*/
		case 2:
			
			if(!ListaClientes.isEmpty()) {
				ExibeLista(ListaClientes);
			}else {
				System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
			}	
			
		break;
		

		case 3:
			System.out.println("[ Deposito ]");
			
			
			if(!ListaClientes.isEmpty()) {
				ExibeLista(ListaClientes);
				
				
				System.out.println("Digite o ID do Cliente");
				id = ler.nextInt();
				
				System.out.println("Digite novo Deposito");
				valDeposito = ler.nextDouble();
				
				for(Cliente a: ListaClientes) {
					
					if(a.getId() == id) {
						a.getConta().Depositar(valDeposito);
						break;
					}
				}
				
				
				
			}else {
				System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
			}
			
		break;
		
		case 4:
			
			System.out.println("\n[ Saque ]\n");
			
			
			if(!ListaClientes.isEmpty()) {
				ExibeLista(ListaClientes);
				
				
				System.out.println("Digite o ID do Cliente");
				id = ler.nextInt();
				
				System.out.println("Digite o valor para Saque");
				valSaque = ler.nextDouble();
				
				for(Cliente a: ListaClientes) {
					
					if(a.getId() == id) {
						a.getConta().Sacar(valSaque);
						break;
					}
				}
					
			}else {
				System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
			}
			
			
		break;
		
		case 5:
			System.out.println("\n[ Transferencia ]\n");
			
			if(!ListaClientes.isEmpty()) {
				ExibeLista(ListaClientes);
				
				
				System.out.println("Digite ID do Cliente");
				id = ler.nextInt();
				
				System.out.println("Digite o valor para Transf");
				valSaque = ler.nextDouble();
				
				System.out.println("Digite ID do Cliente para Transf");
				idTransf = ler.nextInt();
				
				for(Cliente a: ListaClientes) {
					
					if(a.getId() == id) {
						a.getConta().Sacar(valSaque);
					}
					
					if(a.getId() == idTransf) {
						
						Cliente cc = new Cliente(a.getId(),a.getNome(), a.getIdade(),a.getEmail(),a.getConta());
						a.getConta().Transferir(valSaque, cc);
						
					}
				}
					
			}else {
				System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
			}
			
		break;
		
		case 6:
			System.out.println("[ Consulta de saldo ]");
			
			Cliente cli = new Cliente();
			
			System.out.println("Digite o ID do Cliente");
			id = ler.nextInt();
			
			 indexCliente = -1;
			 
             for(Cliente c_ : ListaClientes) {
                 if (c_.getId() == id) {
                     indexCliente = ListaClientes.indexOf(c_);
                     break;
                 }
             }
             
             if (indexCliente != -1) {
                 cli = ListaClientes.get(indexCliente);
                 
                 System.out.print("Saldo: R$ " + cli.getConta().ConsultarSaldo());
             }
             else {
                 System.out.printf("Cliente n�o encontrado!");
             }
             System.in.read();
         


				
		break;
		
		case 7:
			
			 System.out.print("Digite o ID do cliente que você deseja obter o extrato: ");
             id = ler.nextInt();
             
             indexCliente = -1;
             for(Cliente c_: ListaClientes) {
                 if (c_.getId() == id) {
                     indexCliente = ListaClientes.indexOf(c_);
                     break;
                 }
             }
             
             if (indexCliente != -1) {
                 cli = ListaClientes.get(indexCliente);
             
                 System.out.print(cli.getConta().ConsultarExtrato());
             }
             else {
                 System.out.printf("Cliente não encontrado!");
             }
             System.in.read();

			
		break;
		
		default:
			System.out.println("Numero Inválido!");
		break;
		
		case 10:
			System.out.println("\n Você escolheu Sair!!\n");
		break;
		
		
		}
			
		}while(opcao != 10);
		
	}
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("===> Sistema de Cadastro de Alunos <===\n\n");
         System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n\n1 - Incluir cliente \n" +
                 //"2 - Atualizar cliente \n" +
                // "3 - Excluir cliente \n" +
                 "2 - Exibir cliente \n" +
                 "3 - Deposito \n"+
                 "4 - Saque \n"+
                 "5 - Trasnferencia \n"+
                 "6 - Consultar Saldo \n"+
                 "7 - Extrato\n"+
                 "10 - Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 opcao = ler.nextInt();
		 
		 return opcao;

	}
	
	public static void ExibeLista(ArrayList<Cliente> ListaClientes) {
		
		System.out.println("\nBanco Macgyver\n\n");
		for(Cliente a: ListaClientes) {
			
			System.out.printf("\n\nID %d \nNome:%s \nIdade:%d \nAgencia: %s \nNumero: %s \nSaldo %f\n\n",a.getId(), a.getNome(), a.getIdade(),a.getConta().getAgencia(), a.getConta().getNumero(), a.getConta().getSaldo());
		}
		
	}
	
		
	
}
