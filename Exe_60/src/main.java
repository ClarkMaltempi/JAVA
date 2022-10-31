import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		//Cliente[] cadastrar = new Cliente[5];
		ArrayList<Cliente> listaClientes = new ArrayList<>(); 
		
		
		String nome, email, agencia, numero;
		int id=0,idade=0, opcao=0, idTransf;
		double saldo, valDeposito, valSaque, valTrasnf;
		int indexCliente;
		Cliente cli;
        int id_cliente;
        double valor;
        int indexClienteOrigem;
        int indexClienteDestino;
        int id_cliente_origem;
        int id_cliente_destino;
        Cliente cli_origem;
        Cliente cli_destino;

		
		
		do{
			
			opcao = Imprime();
			
			switch(opcao) {
				
			
		case 1://incluir
			 Cliente cliente = new Cliente();
             
             if(listaClientes.size() > 0) {
                 id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
             }
             else {
                 id_cliente = 1;
             }
             cliente.setId(id_cliente);
             
             System.out.print("Digite o seu nome: ");
             cliente.setNome(ler.next());
             
             System.out.print("Digite a seu idade: ");
             cliente.setIdade(ler.nextInt());
             
             ContaBancaria conta = new ContaBancaria();
                                     
             //System.out.print("Digite a agencia: ");
             //conta.setAgencia(ler.next());
             
             //System.out.print("Digite o numero: ");
             //conta.setNumero(ler.next());
             
             conta.setNumero("00" + String.valueOf(id_cliente));
                         
             cliente.setConta(conta);
             
             listaClientes.add(cliente);
             
             System.out.printf("Cliente e conta cadastrados com sucesso!");
             System.in.read();
		    		        
		break;	
		
		case 2:
			
			if(!listaClientes.isEmpty()) {
				ExibeLista(listaClientes);
			}else {
				System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
			}	
			
		break;
		

		case 3:
			for(Cliente c: listaClientes) {
                System.out.println(c.ExibirDadosClienteConta());
            }
            
            if (listaClientes.size() == 0) {
                System.out.print("Não existem clientes cadastrados!");
                System.in.read();
                continue;
            }
            
            System.out.print("Digite o ID do cliente que voc� deseja realizar um dep�sito: ");
            id = ler.nextInt();
            
            indexCliente = -1;
            for(Cliente c: listaClientes) {
                if (c.getId() == id) {
                    indexCliente = listaClientes.indexOf(c);
                    break;
                }
            }
            
            if (indexCliente != -1) {
                cli = listaClientes.get(indexCliente);
                
                System.out.print("Digite o valor do dep�sito: ");
                valor = ler.nextDouble();
                
                while(valor < 0) {
                    System.out.print("Erro, valor negativo! Digite um novo valor: ");
                    valor = ler.nextDouble();
                }
                
                cli.getConta().Depositar(valor, false);
                                
                System.out.printf("Dep�sito realizado com sucesso!");
            }
            else {
                System.out.printf("Cliente n�o encontrado!");
            }
            
            System.in.read();
        

			
		break;
		
		case 4:
			
			 for(Cliente c: listaClientes) {
                 System.out.println(c.ExibirDadosClienteConta());
             }
             
             System.out.print("Digite o ID do cliente que voc� deseja realizar um saque: ");
             id = ler.nextInt();
             
             indexCliente = -1;
             for(Cliente c: listaClientes) {
                 if (c.getId() == id) {
                     indexCliente = listaClientes.indexOf(c);
                     break;
                 }
             }
             
             if (indexCliente != -1) {
                 cli = listaClientes.get(indexCliente);
                 
                 System.out.print("Digite o valor do saque: ");
                 valor = ler.nextDouble();
                 
                 while(valor < 0) {
                     System.out.print("Erro, valor negativo! Digite um novo valor: ");
                     valor = ler.nextDouble();
                 }
             
                 if (cli.getConta().Sacar(valor, false))
                     System.out.printf("Saque realizado com sucesso!");                      
                 else
                     System.out.printf("Saldo insuficiente para saque!");

             }
             else {
                 System.out.printf("Cliente n�o encontrado!");
             }
             System.in.read();
         

			
			
		break;
		
		case 5:
			for(Cliente c: listaClientes) {
                System.out.println(c.ExibirDadosClienteConta());
            }
            
            System.out.print("Digite o ID do cliente de origem da transfer�ncia: ");
            id_cliente_origem = ler.nextInt();
            
            indexClienteOrigem = -1;
            for(Cliente c: listaClientes) {
                if (c.getId() == id_cliente_origem) {
                    indexClienteOrigem = listaClientes.indexOf(c);
                    break;
                }
            }
            
            System.out.print("Digite o ID do cliente de destino da transfer�ncia: ");
            id_cliente_destino = ler.nextInt();
            
            indexClienteDestino = -1;
            for(Cliente c: listaClientes) {
                if (c.getId() == id_cliente_destino) {
                    indexClienteDestino = listaClientes.indexOf(c);
                    break;
                }
            }
            
            if ( (indexClienteOrigem != -1) && (indexClienteDestino != -1) ) {
                cli_origem = listaClientes.get(indexClienteOrigem);
                cli_destino = listaClientes.get(indexClienteDestino);
                
                if (cli_origem == cli_destino) {
                    System.out.print("Erro! O cliente de origem é o mesmo de destino!");
                }
                else {
                    System.out.print("Digite o valor da transfer�ncia: ");
                    valor = ler.nextDouble();
                    
                    while(valor < 0) {
                        System.out.print("Erro, valor negativo! Digite um novo valor: ");
                        valor = ler.nextDouble();
                    }
                    
                    if (cli_origem.getConta().getSaldo() + cli_origem.getConta().getLimite() >= valor) {
                        cli_origem.getConta().Transferir(valor, cli_destino, cli_origem);
                        System.out.printf("Transfer�ncia realizada com sucesso!");                      
                    }
                    else {
                        System.out.printf("Saldo insuficiente para transferência!");
                    }
                }
            }
            else {
                System.out.printf("Cliente origem ou cliente destino n�o encontrado!");
            }
            System.in.read();

		break;
		
		case 6:
			
			for(Cliente c: listaClientes) {
                System.out.println(c.ExibirDadosClienteConta());
            }
            
            System.out.print("Digite o ID do cliente que voc� deseja obter o saldo: ");
            id = ler.nextInt();
            
            indexCliente = -1;
            for(Cliente c: listaClientes) {
                if (c.getId() == id) {
                    indexCliente = listaClientes.indexOf(c);
                    break;
                }
            }
            
            if (indexCliente != -1) {
                cli = listaClientes.get(indexCliente);
                
                System.out.print("Saldo: R$ " + cli.getConta().ConsultarSaldo());
            }
            else {
                System.out.printf("Cliente n�o encontrado!");
            }
            System.in.read();
        
        if(opcao == 6) {
            for(Cliente c: listaClientes) {
                System.out.println(c.ExibirDadosClienteConta());
            }
            
            System.out.print("Digite o ID do cliente que você deseja obter o extrato: ");
            id = ler.nextInt();
            
            indexCliente = -1;
            for(Cliente c: listaClientes) {
                if (c.getId() == id) {
                    indexCliente = listaClientes.indexOf(c);
                    break;
                }
            }
        }
            if (indexCliente != -1) {
                cli = listaClientes.get(indexCliente);
                
                System.out.print(cli.getConta().ConsultarExtrato());
            }
            else {
                System.out.printf("Cliente não encontrado!");
            }
            System.in.read();

         
		break;
		
		case 7:
			
			 System.out.printf("Digite o ID do cliente que você deseja obter o extrato: ");
             id = ler.nextInt();
             
             indexCliente = -1;
             for(Cliente c_: listaClientes) {
                 if (c_.getId() == id) {
                     indexCliente = listaClientes.indexOf(c_);
                     break;
                 }
             }
             
             if (indexCliente != -1) {
                 cli = listaClientes.get(indexCliente);
             
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
		
		 System.out.printf("===> Banco Macgyver <===\n\n");
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
