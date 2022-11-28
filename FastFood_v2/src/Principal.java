
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		
	
		ArrayList<Cliente> listaClientes = new ArrayList<>(); //Armazenando dados do cliente
		ArrayList<Produtos> listaProdutos = new ArrayList<>(); //Armazena dados do Produtos
		ArrayList<ItemPedido> listaItems = new ArrayList<>(); //Itens Pedido
		ArrayList<Pedido> listaPedidos = new ArrayList<>(); // produtos -> item pedido -> pedido <- cliente
		
		
		int opcao, id=0, indexCliente, indexProduto, idCliente, idPedido, idItem, i=0;
		String nome, email;
		Cliente cl;
		Produtos p;
		double preco, estoque, quantidade;
		
		Tela_Inicial(); //Logon da Empresa
		
		//Inicializza Produtos Padrões
		Hamburger h = new Hamburger("Carne", 1, "McTasty", 28, 10);
		listaProdutos.add(h);
		Hamburger h1 = new Hamburger("Frango", 2, "McChicken", 25, 10);
		listaProdutos.add(h1);

		BatataFrita btt = new BatataFrita("Pequena" ,3, "Batata Frita" , 7, 10);
		listaProdutos.add(btt);
		BatataFrita bttM = new BatataFrita("Média" ,4, "Batata Frita" , 9, 10);
		listaProdutos.add(bttM);
		BatataFrita bttG = new BatataFrita("Grande" ,5, "Batata Frita" , 13, 10);
		listaProdutos.add(bttG);

		Refrigerante refriCoca = new Refrigerante("Coca-Cola",6, "Refrigerante" , 10, 10);
		listaProdutos.add(refriCoca);
		Refrigerante refriFanta = new Refrigerante("Fanta Uva",7, "Refrigerante" , 10, 10);
		listaProdutos.add(refriFanta);
		Refrigerante refriDolly = new Refrigerante("Dolly limão",8, "Refrigerante" , 10, 10);
		listaProdutos.add(refriDolly);
		
		Cliente c1 = new Cliente(1, "Clark Maltempi", "clark.maltempi@fatec.sp.gov.br");
		listaClientes.add(c1);
		Cliente c2 = new Cliente(2, "Karine Matos Menezes", "karine.menezes@fatec.sp.gov.br");
		listaClientes.add(c2);
		Cliente c3 = new Cliente(3, "Marilene dos Santos Romão Costa", "marilene.costa01@fatec.sp.gov.br");
		listaClientes.add(c3);
		Cliente c4 = new Cliente(4, "Luiz Augusto Rocha", "luiz.souza101@fatec.sp.gov.br");
		listaClientes.add(c4);
		
		
		do{
			
			opcao = Imprime();
			
			switch(opcao) {
				
			
			case 1://incluir cliente não cadastrado
				
				 try {
					Cliente c = new Cliente(); 
					id = listaClientes.size() + 1;
					c.setId(id);
					
					 try {
						
						ler.nextLine();
						System.out.println("Digite o nome do cliente: ");
						nome = ler.nextLine();
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
					
					 } catch (Exception e) {
							System.out.println("Erro na Entrada de dados!");
						 }
			break;	
			
				 } catch (Exception e) {
						System.out.println("Erro na Entrada de dados!");
					 }
			
			case 2: //Atualiza Clientes
				
				 try {
					
				 
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
					
					ler.nextLine();
					
					System.out.println("\nDigite novo nome do cliente: ");
					nome = ler.nextLine();
					cl.setNome(nome);
					
					System.out.println("\nDigite novo email do Cliente: ");
					email = ler.next();
					cl.setEmail(email);
					
			         System.out.println("\n\nCliente atualizado com sucesso!!");
			         
					}else {
						
						System.out.println("\n\nCliente não Encontrado!!");
					}
				
				 } catch (Exception e) {
						System.out.println("Erro na Entrada de dados!");
					 }
				
				
			break;
			
			case 3: //Excluir Cliente
				
				 try {
					 
				 
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
				
				 } catch (Exception e) {
						System.out.println("Erro na Entrada de dados!");
					 }
				
					
			break;
			
			case 4: //Exibir Cliente
				
				if(!listaClientes.isEmpty()) {
					ExibeLista(listaClientes);
				}else {
					System.out.println("\n\n****Nenhum Cliente Cadastrado!!!****\n\n");
				}
				
			break;
			
	
			case 5:
				
				 try {
					 String descricao;
				
					//Cadastrar Produtos
					System.out.println("Cadastrar o produto: \n[1] Hamburger\n[2] Batata\n[3]Refrigerante");
					int opt = ler.nextInt();
					switch (opt) {
						case 1:						
							id = listaProdutos.size() + 1;
							
							ler.nextLine();//Limpando o Buffer do Teclado
							System.out.println("\nDigite o nome comercial do Hamburger: ");
							nome = ler.nextLine();
							
							System.out.println("\nDigite a tipo de carne do Hamburger: ");
							descricao = ler.nextLine();
							
							System.out.println("\nDigite o preco do Hamburger: ");
							preco = ler.nextDouble();
							
							System.out.println("\nDigite a Quatidade em estoque: ");
							estoque = ler.nextDouble();
							
							Hamburger cadHamburger = new Hamburger(descricao, id, nome, preco, estoque); 

							listaProdutos.add(cadHamburger);

							System.out.println("Hamburer cadastrado com sucesso");
							
							break;
					
							case 2:						
								id = listaProdutos.size() + 1;
								ler.nextLine(); //Limpando o buffer
								System.out.println("\nDigite o nome comercial da Batata: ");
								nome = ler.nextLine();
								
								System.out.println("\nDigite a tamanho da batata: ");
								descricao = ler.nextLine();
								
								System.out.println("\nDigite o preco do Batata: ");
								preco = ler.nextDouble();
								
								System.out.println("\nDigite a Quatidade em estoque: ");
								estoque = ler.nextDouble();
								
								BatataFrita cadBatataFrita = new BatataFrita(descricao, id, nome, preco, estoque); 

								listaProdutos.add(cadBatataFrita);

								System.out.println("Batata Frita cadastrada com sucesso");
							
							break;
							
							case 3:						
								id = listaProdutos.size() + 1;
								nome = "Refrigerante";
								ler.nextLine();//Limpando o Buffer do Teclado
								System.out.println("\nDigite a marca e sabor do refrigerante: ");
								descricao = ler.nextLine();
								
								System.out.println("\nDigite o preco do refrigerante: ");
								preco = ler.nextDouble();
								
								System.out.println("\nDigite a Quatidade em estoque: ");
								estoque = ler.nextDouble();
								
								Refrigerante cadRefri = new Refrigerante(descricao, id, nome, preco, estoque); 

								listaProdutos.add(cadRefri);

								System.out.println("Refrigerante cadastrado com sucesso");
							
							break;
						default:
							System.out.println("\n\n Cadastro invalido! ");
							break;
					} 				
				 } catch (Exception e) {
						System.out.println("Erro na Entrada de dados!");
					 }
				
			break;
			
			case 6:
				 try {
					 
					ListarProdutos(listaProdutos);
					
					System.out.println("\nQual Produto Deseja Atualizar?\n");
					id = ler.nextInt();
					
					indexProduto = -1;
					
					for(Produtos prod: listaProdutos) {
		                if (prod.getId() == id) {
		                    indexProduto = listaProdutos.indexOf(prod);
		                    break;
		                }
		           }
					
					if(indexProduto != -1) {
						
						p = listaProdutos.get(indexProduto);
						ler.nextLine();//Limpa o Buffer do Teclado
						System.out.println("\nDigite novo nome do Produto: ");
						nome = ler.nextLine(); //Insere caracter com espaço
						p.setNome(nome);
						
						System.out.println("\nDigite novo preco: ");
						preco = ler.nextDouble();
						p.setPreco(preco);
						
						System.out.println("\nDigite a quantidade em Estoque: ");
						estoque = ler.nextDouble();
						p.setEstoque(estoque);
						
				        System.out.println("\n\nProduto atualizado com sucesso!!");
					}else {
						
						System.out.println("\n\nProduto não Encontrado!!");
					}
				
				 } catch (Exception e) {
						System.out.println("Erro na Entrada de dados!");
					 }
				
			break;
			
			case 7: //Remover Produto
				
				try {
					 
					ListarProdutos(listaProdutos);
					System.out.println("\n\nDigite o ID do Produto que Deseja Remover?\n");
					id = ler.nextInt();
					
					indexProduto = -1;
					
					for(Produtos c_: listaProdutos) {
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
				
				} catch (Exception e) {
					System.out.println("Erro na Entrada de dados!");
				 }
			break;
			
			case 8:
				
				if(!listaProdutos.isEmpty()) {
					ListarProdutos(listaProdutos);
				}else {
					System.out.println("\n\n****Nenhum Produto Cadastrado!!!****\n\n");
				}
				
			break;
			//Fazer pedido
			case 9:
			   try {
					
					ExibeLista(listaClientes); //Chama a função para listar Clientes
					System.out.println("\nDigite o ID do Cliente que fez o Pedido: ");
					idCliente = ler.nextInt();
					indexCliente = -1; //Inicializa o index
					
					for(Cliente c_: listaClientes) {
		                if (c_.getId() == idCliente) {//compara ID digitado com o id do Cliente
		                	indexCliente = listaClientes.indexOf(c_);//captura a posição no index e armazena na variável "indexCliente"
		                    break;
		                    
		                }else{
							
							System.out.println("\n\nCliente não Encontrado!!");
						}
		            }
					
					int opt = 0;
					if(indexCliente != -1) {
						cl = listaClientes.get(indexCliente);
						
						Pedido pedido = new Pedido();							
						
						//Pedido
						idPedido = listaItems.size()+1;
						pedido.setId(idPedido);
						pedido.setCliente(cl);
						
						do {
							ListarProdutos(listaProdutos); //Produto e a mesma coisa no caso de Cliente
							System.out.println("\nDigite o ID do Produto que Deseja fazer o Pedido: ");
							id = ler.nextInt();
							indexProduto =-1;
							
							for(Produtos p_: listaProdutos) {
								if (p_.getId() == id) {
									indexProduto = listaProdutos.indexOf(p_);
									break;
								}
							}
							p = listaProdutos.get(indexProduto);
							
							if(indexProduto != -1) {
								
								
								//Item Pedido
								ItemPedido item = new ItemPedido(); 
								idItem = p.getId();
								
								item.setId(idItem);
								item.setProduto(p); //Armazena em ItemPedido o Produto Escolhido
								
								System.out.println("\nDigite a quantidade do Produto Escolhido");
								quantidade = ler.nextDouble();
								
								if(quantidade > p.getEstoque()) {//Verifica se a quantidade Existe em Estoque
									System.out.println("\nNao possui Produto em Estoque!");
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
							
							System.out.println("Deseja adicionar mais algum produto? [1] Sim [0] Não");
							opt = ler.nextInt();
						} while (opt != 0);
						listaPedidos.add(pedido);
						
					}
				 } catch (Exception e) {
						System.out.println("Erro na Entrada de dados!");
					 }
				
			break;
			//Listar Pedido
			case 10:
			
				if(!listaItems.isEmpty()) {
					ListarPedidos(listaPedidos);
				}else {
					
					System.out.println("\nNenhum Item Pedido!\n");
				}
				
			break;
			
			case 11:
				System.out.println("\n");
				System.out.println("Esse Projeto final tem como objetivo abordar todos os conceitos");
				System.out.println("abordados na disciplina de POO");
				System.out.println("Ministrado: Joseffe Barroso de Oliveira");
				
				System.out.println("\n");
				System.out.println("-----------------------------------------");
				System.out.println("               INTEGRANTES               ");
				System.out.println("                                         ");
				System.out.println("Clark Maltempi");
				System.out.println("Karine Matos Menezes");
				System.out.println("Luiz Augusto Rocha da Conceicao Souza");
				System.out.println("Marilene dos Santos Romão Costa");
				System.out.println("----------------------------------------");
				
			break;
			
			default:
				System.out.println("\nNumero Inválido!\n");
			break;
			
			case 20:
				System.out.println("\n Você escolheu Sair!!!\n");
			break;
		
		
		}
			
		}while(opcao != 20);
		
	 

	}
	
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.printf("\n======================================================================================================================\n");
        System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n [1] Incluir cliente \n" +
                " [2] Atualizar cliente \n" +
                " [3] Excluir cliente \n" +
                " [4] Exibir cliente \n" +
                " [5] Cadastrar Produtos \n"+
                " [6] Atualizar Produtos \n"+
                " [7] Excluir Produtos \n"+
                " [8] Listar Produtos \n"+
                " [9] Fazer pedido\n"+
             "[10] Listar Pedidos realizados\n"+
             "[11] Sobre\n"+
             "[20] Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 	 
		 try {
			 opcao = ler.nextInt();
		 } catch (Exception e) {
			System.out.println("Erro na Entrada de dados!");
		 }
		 
		 
		 
		 return opcao;
	}
	
	public static void Tela_Inicial() {
		
		
		
		 System.out.printf("\n===================================================================================================================\n");
		 System.out.printf("\n                                                 HUMBURGUERIA                                                \n");
		 System.out.printf("\n===================================================================================================================\n");
		 
         
		 System.out.println("    "
					+ "                         #!#. :#!!!                                            \r\n"
					+ "                     .:!.::..#!!:::#!!#                                         \r\n"
					+ "          .#!!!!. .!#:!:!#!!#:#::::#!!##!                                       \r\n"
					+ "       .    ::!!!#::!#.!:#::#:!:!::!#!::!!#                                     \r\n"
					+ "    .!:!!.###!::#!#::!!::!:!:!::#:!::!#!..#.                                    \r\n"
					+ "      !::!.::!:!!#!#..#:!!:::::!!!!..!#!!::::::::::::::!!!#!:                   \r\n"
					+ "      .!::#..!#:!#::#.:!!##.    .#:::::::::::::::::::::::::.::::!#.             \r\n"
					+ "        ::....           ......#:                                    #!          \r\n"
					+ "         .#...:    ...........#:                                     !#        \r\n"
					+ "          .!....      .........#!#!                                    :!       \r\n"
					+ "            ::..:    ........#:!#@!:!!!!!!!#####!!:!!!!!!!!!!!!!!!!!####:       \r\n"
					+ "             .!..:   ..........#!:#!!########!:!!!#!!!!!!#!!!!#!!#!#####:       \r\n"
					+ "               !....   ........###############!.!!!#!.:::::@#!!!!!!!!##:        \r\n"
					+ "                ::..           :#::::!!!##############################!         \r\n"
					+ "                 :#..    ...::!#!. !##!::::::::::::::::::::::::::::!#.          \r\n"
					+ "                   !!:..                   ..:::!#########!!:::..       "
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ " \n"  );                                          
         
         
 

        System.out.println("Fatec todos os direitos reservados: 28/11/2022 ");
		 
		 

	}
	
	public static void ExibeLista(ArrayList<Cliente> listaClientes) {
		
		for(Cliente a: listaClientes) {
			
			System.out.printf("\n\nID %d \nNome:%s \nEmail:%s\n",a.getId(), a.getNome(), a.getEmail());
		}
		
	}
	
	public static void ListarProdutos(ArrayList<Produtos> listaProdutos) {
		
		for(Produtos a: listaProdutos) {
			System.out.printf("\n\nID %d \nNome:%s \nPreco:%.2f\nEstoque: %.2f \n",a.getId(), a.getDescription(), a.getPreco(), a.getEstoque());
		}
		
	}
	
	public static void ListarPedidos(ArrayList<Pedido> Lista) { //Recebe a lista Pedido
		double soma=0;
		for(Pedido a: Lista) {
			System.out.printf("\nPedido Id: %d\n", a.getId());
			a.getCliente().printDadosCliente(); // Método para exibir dados do Cliente
			System.out.println("------------------------------------------------------------");
			System.out.println("O Pedido possui:\n");
			for (ItemPedido b: a.getLista()) {
				b.printDadosItem();
				soma += b.Calcpreco();//Benefício da Herença, o fato de item Pedido herdar os atributos da classe produto eu consigo
				//chamar o método calcula preço,  
			}
			
			System.out.printf("\n| Valor Total: %.2f |\n", soma);
		
			//Método para capturar data e hora do Sistema
			//Date date = new Date();	
			//System.out.printf("\n\n%s/%s/%s    %s:%s:%s", "28", "Novembro", "2022", date.getHours(), date.getMinutes(), date.getSeconds());
			SimpleDateFormat formatter = new SimpleDateFormat("\n\ndd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    //Date newDate = new Date(date.getTime() - 1000*60*60*3);
		    System.out.println(formatter.format(date));
		}
		
	}
		
	
}