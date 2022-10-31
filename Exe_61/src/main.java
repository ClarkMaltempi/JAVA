
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
	
		ArrayList<Cliente> listaClientes = new ArrayList<>(); 
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		ArrayList<ItemPedido> listaItems = new ArrayList<>(); 
		
		String nome, email;
		int id=0,idade=0, opcao=0, indexCliente=0, indexProduto=0, idCliente=0, idPedido=0, idItem=0;
		double preco=0, estoque=0, quantidade=0;
		Cliente cl;
		Produto p;
	
	
		
		do{
				
			opcao = Imprime();
			
			switch(opcao) {
				
			
			case 1://incluir
					Cliente c = new Cliente(); 
					id = listaClientes.size() + 1;
					c.setId(id);
						
					System.out.println("Digite o nome do cliente: ");
					nome = ler.next();
					c.setNome(nome);
					
					System.out.println("Digite o email do Cliente: ");
					email = ler.next();
					c.setEmail(email);
					
					listaClientes.add(c);
					
					if(!listaClientes.isEmpty()) {
						System.out.println("\n\n Cliente cadastrado com sucesso! ");
						id=0;
					}else {
						System.out.println("\n\n Cadastro invalido! ");
					}
					   
			break;	
			
			case 2:
				
				ExibeLista(listaClientes);
				
				System.out.println("\n\nQual cliente Deseja Atualizar?\n");
				id = ler.nextInt();
				
				indexCliente = -1;
				
				for(Cliente c_: listaClientes) {
	                if (c_.getId() == id) {
	                	indexCliente = listaClientes.indexOf(c_);
	                    break;
	                }
	            }
				
				if(indexCliente != -1) {
					
				cl = listaClientes.get(indexCliente);
				
				System.out.println("Digite novo nome do cliente: ");
				nome = ler.next();
				cl.setNome(nome);
				
				System.out.println("Digite novo email do Cliente: ");
				email = ler.next();
				cl.setEmail(email);
				
		         System.out.println("\n\nCliente atualizado com sucesso!!");
		         
				}else {
					
					System.out.println("\n\nCliente não Encontrado!!");
				}
				
			break;
			
			case 3:
				
				ExibeLista(listaClientes);
				System.out.println("\n\nDigite o ID de Qual cliente Deseja Remover?\n");
				id = ler.nextInt();
				
				indexCliente = -1;
				
				for(Cliente c_: listaClientes) {
	                if (c_.getId() == id) {
	                	indexCliente = listaClientes.indexOf(c_);
	                    break;
	                }
	            }
				
				if(indexCliente != -1) {
					
					cl = listaClientes.remove(indexCliente);
					
					System.out.println("\n\nCliente Removido com sucesso!!!\n");
					
				}else {
					
					System.out.println("\n\nCliente não Encontrado!!");
				}
				
					
			break;
			
			case 4:
				
				if(!listaClientes.isEmpty()) {
					ExibeLista(listaClientes);
				}else {
					System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
				}
				
			break;
			
	
			case 5:
				Produto pd = new Produto();
				
				id = listaProdutos.size() + 1;
				pd.setId(id);
				
				System.out.println("Digite o nome do Produto: ");
				nome = ler.next();
				
				System.out.println("Digite o preco do Produto: ");
				preco = ler.nextDouble();
				
				System.out.println("Digite a Quatidade em estoque: ");
				estoque = ler.nextDouble();
				
				pd.setNome(nome);
				pd.setPreco(preco);
				pd.setEstoque(estoque);
				
				listaProdutos.add(pd);
				
				
				if(!listaProdutos.isEmpty()) {
					System.out.println("\n\n Cadastrado Produto com sucesso! ");
					id=0;
				}else {
					System.out.println("\n\n Cadastro invalido! ");
				}
				
			break;
			
			case 6:
				
				ListarProdutos(listaProdutos);
				
				System.out.println("\n\nQual Produto Deseja Atualizar?\n");
				id = ler.nextInt();
				
				indexProduto = -1;
				
				for(Produto prod: listaProdutos) {
	                if (prod.getId() == id) {
	                    indexProduto = listaProdutos.indexOf(prod);
	                    break;
	                }
	            }
				
				if(indexProduto != -1) {
					
					p = listaProdutos.get(indexProduto);
					
					System.out.println("Digite novo nome do Produto: ");
					nome = ler.next();
					p.setNome(nome);
					
					System.out.println("Digite novo preco: ");
					preco = ler.nextDouble();
					p.setPreco(preco);
					
					System.out.println("Digite a quantidade em Estoque: ");
					estoque = ler.nextDouble();
					p.setEstoque(estoque);
					
			        System.out.println("\n\nProduto atualizado com sucesso!!");
				}else {
					
					System.out.println("\n\nProduto não Encontrado!!");
				}
				
			break;
			
			case 7:
				
				ListarProdutos(listaProdutos);
				System.out.println("\n\nDigite o ID do Produto que Deseja Remover?\n");
				id = ler.nextInt();
				
				indexProduto = -1;
				
				for(Produto c_: listaProdutos) {
	                if (c_.getId() == id) {
	                	indexProduto = listaProdutos.indexOf(c_);
	                    break;
	                }
	            }
				
				if(indexProduto != -1) {
					
					p = listaProdutos.remove(indexProduto);
					
					System.out.println("\n\nProduto Removido com sucesso!!!\n");
					
				}else {
					
					System.out.println("\n\nProduto não Encontrado!!");
				}
				
			break;
			
			case 8:
				
				if(!listaClientes.isEmpty()) {
					ListarProdutos(listaProdutos);
				}else {
					System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
				}
				
			break;
			
			case 9:
				
				ExibeLista(listaClientes);
				System.out.println("Digite o ID do Cliente que fez o Pedido");
				idCliente = ler.nextInt();
				indexCliente = -1;
				
				for(Cliente c_: listaClientes) {
	                if (c_.getId() == idCliente) {
	                	indexCliente = listaClientes.indexOf(c_);
	                    break;
	                    
	                }else{
						
						System.out.println("\n\nCliente não Encontrado!!");
					}
	            }
				
				
				if(indexCliente != -1) {
					
					cl = listaClientes.get(indexCliente);
					
					ListarProdutos(listaProdutos);
					System.out.println("\nDigite o ID do Produto que Deseja fazer o Pedido");
					id = ler.nextInt();
					indexProduto =-1;
					
					for(Produto p_: listaProdutos) {
		                if (p_.getId() == id) {
		                	indexProduto = listaProdutos.indexOf(p_);
		                    break;
		                }
		            }
					
					if(indexProduto != -1) {
						
						p = listaProdutos.get(indexProduto);
						Pedido pedido = new Pedido();
						
						
						
						//Pedido
						idPedido = listaItems.size()+1;
						pedido.setId(idPedido);
						pedido.setCliente(cl);
						
						//Item Pedido
						ItemPedido item = new ItemPedido(); 
						idItem = p.getId();
						
						item.setId(idItem);
						item.setProduto(p);
						
						System.out.println("\nDigite a quantidade do Produto Escolhido");
						quantidade = ler.nextDouble();
		
						if(quantidade > p.getEstoque()) {
							System.out.println("Nao possui Produto em Estoque!");
						}else {
							
							item.setQuantidade(quantidade);
							quantidade = p.getEstoque()-quantidade;
							p.setEstoque(quantidade);
							
							//Pedido
							listaItems.add(item);
							pedido.setLista(listaItems);
						}
						
						
					}else {
						
						System.out.println("\n\nProduto não Encontrado!!\n");
					}
					
				}
				
			break;
			
			case 10:
			
				if(!listaItems.isEmpty()) {
					ListarPedidos(listaItems);
				}else {
					
					System.out.println("\nNenhum Item Pedido!\n");
				}
				
			break;
			
			default:
				System.out.println("\nNumero Inválido!\n");
			break;
			
			case 11:
				System.out.println("\n Você escolheu Sair!!\n");
			break;
		
		
		}
			
		}while(opcao != 11);
		
	 

	}
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("\n\n===> Sistema de Cadastro de Produtos <===\n\n");
         System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n\n1 - Incluir cliente \n" +
                 "2 - Atualizar cliente \n" +
                 "3 - Excluir cliente \n" +
                 "4 - Exibir cliente \n" +
                 "5 - Cadastrar Produtos \n"+
                 "6 - Atualizar Produtos \n"+
                 "7 - Excluir Produtos \n"+
                 "8 - Listar Produtos \n"+
                 "9 - Criar um pedido\n"+
                 "10 - Listar Pedidos realizados\n"+
                 "11 - Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 opcao = ler.nextInt();
		 
		 return opcao;

	}
	
	public static void ExibeLista(ArrayList<Cliente> listaClientes) {
		
		for(Cliente a: listaClientes) {
			
			System.out.printf("\n\nID %d \nNome:%s \nEmail:%s\n",a.getId(), a.getNome(), a.getEmail());
		}
		
	}
	
	public static void ListarProdutos(ArrayList<Produto> listaProdutos) {
		
		for(Produto a: listaProdutos) {
			
			System.out.printf("\n\nID %d \nNome:%s \nPreco:%.2f\nEstoque: %.2f \n",a.getId(), a.getNome(),a.getPreco(), a.getEstoque());
		}
		
	}
	
	public static void ListarPedidos(ArrayList<ItemPedido> Lista) {
		
		for(ItemPedido a: Lista) {
			
			System.out.printf("\n\nID %d \nNome:%s \nQuantidade: %.2f\n",a.getId(), a.getProduto().getNome(), a.getQuantidade());
		}
		
	}
	
	
		
	
}
