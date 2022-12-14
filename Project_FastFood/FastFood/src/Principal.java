

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.lang. *;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner ler = new Scanner(System.in);
		
	
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Produtos> listaProdutos = new ArrayList<>();
		ArrayList<ItemPedido> listaItems = new ArrayList<>(); 
		
		
		int opcao, id=0, indexCliente, indexProduto, idCliente, idPedido, idItem, i=0;
		String nome, email;
		Cliente cl;
		Produtos p;
		double preco, estoque, quantidade;
		
		Tela_Inicial();
		
		//Inicializza Produtos Padrões	
		Produtos p1 = new Produtos(1, "Hamburger de Carne" , 28, 10);
		listaProdutos.add(p1);
		Produtos p2 = new Produtos(2, "Batata Grande" , 20, 10);
		listaProdutos.add(p2);
		Produtos p3 = new Produtos(3, "Refrigerante" , 10, 10);
		listaProdutos.add(p3);
		Produtos p4 = new Produtos(4, "Hamburger de Frango" , 20, 10);
		listaProdutos.add(p4);
		Produtos p5 = new Produtos(5, "Sorvete" , 4, 10);
		listaProdutos.add(p5);
		Produtos p6 = new Produtos(6, "Milkshake" , 16, 10);
		listaProdutos.add(p6);
		
		
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
				//Cadastrar Produtos
				Produtos pd = new Produtos();
				
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
				
				//ListarProdutos(listaProdutos);
				
				System.out.println("\n\nQual Produto Deseja Atualizar?\n");
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
					
					for(Produtos p_: listaProdutos) {
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
			//Listar Pedido
			case 10:
			
				if(!listaItems.isEmpty()) {
					ListarPedidos(listaItems);
				}else {
					
					System.out.println("\nNenhum Item Pedido!\n");
				}
				
			break;
			
			case 11:
				System.out.println("\nIntegrantes\n");
			break;
			
			default:
				System.out.println("\nNumero Inválido!\n");
			break;
			
			case 20:
				System.out.println("\n Você escolheu Sair!!\n");
			break;
		
		
		}
			
		}while(opcao != 20);
		
	 

	}
	
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		
		System.out.printf("\n\n===================================================================================================================================\n\n");
        System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n\n1 - Incluir cliente \n" +
                "2 - Atualizar cliente \n" +
                "3 - Excluir cliente \n" +
                "4 - Exibir cliente \n" +
                "5 - Cadastrar Produtos \n"+
                "6 - Atualizar Produtos \n"+
                "7 - Excluir Produtos \n"+
                "8 - Listar Produtos \n"+
                "9 - Fazer pedido\n"+
                "10 - Listar Pedidos realizados\n"+
                "11 - Sobre\n"+
                "20 - Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 opcao = ler.nextInt();
		 
		 return opcao;
	}
	
	public static void Tela_Inicial() {
		
		
		
		 System.out.printf("\n\n===========================================================================================================\n\n");
		 System.out.printf("\n                                                 HUMBURGUERIA                                                \n\n");
		 System.out.printf("\n\n===========================================================================================================\n\n");
		 
         
System.out.println("    \t\t\t\t\t-+=-\n"+ 
        									"\t\t\t.--==+:     =+:  :=+.  \n"+
											"\t\t\t.--==+:     =+:  :=+. \n"+                                                                  
										   "\t\t\t+..   +-   .# :  .:=- :=++-          :-.\n"+
								 "\t\t:==+=.   +: :=:-.**==.# .-+: -**-.  :+=      -+-:=+=.\n"+                                             
								"\t\t.#:   .=+.=-  :- =+-. .=#:  +  :%=.-. -.#==+- *-    .:*\n" +                                             
								"\t\t-+.----.#-*  .=  #.--.-::*  +  .@=  +-=*:   :+%::---- #\n"+                                              
								"\t\t=-  +   %#.  +  .#  :=  =-  +  .@:  + +::-:--.%-  +   # \n"+                                              
								"\t\t+:  +   %:  =.  +=  =.  #.  +  :@.  + *.  +  :@=  +=+=%. \n"+                                             
						"\t+====+  *:  +  .*  :-  -%..:*- .@-: +  :%  .= #   =  -%=-+-   :=+  .:-=. \n"+                                     
					 "\t.*:  .:-+ *.  +  :+ .*=-.%@+-:.-+**:-++  =+ :+- #  .=  =#==-:---- #:*-:..==. \n"+                                   
			    "\t*-:--+  -+#.  +  :%+-: :+%# =:.:.==   :# *+=:.=+#  .=  =#==-  +   #*::- .:.# \n"+                                   
					"\t.*.  =:  =%.  +  :% -:.::%-  +:. *=.-- #.#.-. :.*- .-  +%-++: +   %*  :+: -= \n"+                                   
					"\t .*.  =.  +-  +  :*  -=.+#  .=  :+ +.  #-=  +-. #. :-  *+-:.-+*   %:  =.  #. \n"+                                   
					    "\t .*.  +.  *: +  =-  =..%:  =.  #. +   #*.  +  .#  -- .* =:.:.+- :*  .=  -+ \n"+                                    
					     "\t  :*   +   *.+  #   + +*  .*. -=  +   %#  .=  =#==-=+*:  +:. #. *.  +   #. \n"+                                    
						  "\t  -+  .=  .*+ :+  :-:%..==:++%:  +   @-  =.  #.-. ..=+ .=  -%.-+  :-  == \n"+                                     
							"\t   ==  :-  -% *:  + #+==.   .+=  +  .%   +  .*  :=: == +   #+.#   +  .# \n"+                                      
							  "\t *:  =.  *=*  .=-%.#:=-.-.-+ .+==+#: --  =*  ::  *.:-  ==:*:  =.  *: \n"+                                      
							"\t.%++++*+++@*==+-#= #  .+  -= #:.   -**:=+--+.=   # :  .# -+  :=  -+ \n"+                                       
							"\t%          ..:%%. #   =  ==.#.----.+@=.   .*+  :*    +-.*   +  .* \n"+                                        
							"\t%  ++==--::.  +*  #  .=  =-:+  -:  #* =::-.==  =+-:::#.*.  =.  *: \n"+                                        
							"\t%.   ..::--=.  #- #  .-  =-=-  =.  %:  +:  #.  *%---===++++*++*= \n"+                                         
							"\t#.             .*=#      +:*:  +  .#  .=  -+  .%:      . .-  .%. \n"+                                         
							"\t#:               +#.     +:#   +  =-  =.  #. =*. .++++++*+=-:=+ \n"+                                          
							"\t*:                .*+.   *:#   .  #   -  :*-*=       .:  -:  %.\n"+                                          
							"\t*-             *:   .+*=.*-*     -=     -**-           :.  :=* \n"+                                           
							"\t+-             .++.    :=**#=-:::#--=+++-.  ..       :.  -  #: \n"+                                           
							"\t+=               .++:       .:----::.     .+*.     :.  -  .=* \n"+                                            
							"\t=+                 .=*+-.              .=*+.         :  .: #: \n"+                                            
							"\t-+                     -=+++==----==+++=:       ..:=::--::-# \n"+                                             
							"\t-*                          ..::::.. .:-=+++++=+===-------==+++++++-.. \n"+                                   
							"\t:#                              .-+*++=:.                         ..-=+==-. \n"+                              
							"\t:#                          .=**=:.                                     .:=**=. \n"+                          
							"\t.%                       .+*+:                                               -+*=. \n"+                       
							"\t.%                     -*+:                                                     :**:\n"+                     
							"\t%                   =#=                                                          .+*:\n"+                   
							"\t%.                :#=                                                              .+*.\n"+                 
							"\t%.               +*.                                                                 :#-\n"+                
							"\t#:             .#-                                                                     *+\n"+               
							"\t#:            .#:                                                                       ++\n"+              
							"\t*-            *=                                                                         %:\n"+             
							"\t*-            *=                                                                         #-\n"+             
							"\t+=            .*+.                                                                     :*+*\n"+             
							"\t=+            ..*@*+-:                                                            .:=+*=.+#:\n"+            
							"\t=+  ..  :   ..+*-+:.:=++++++=---:::....                      ......:::::--==++++++*%*====..*+\n"+           
							"\t-*..  :   : +*:  .-========+##=--===+++++==+++++++++++++++++++=======*%%#*=-::-=+#=  .:-==++#+\n"+          
							"\t:*  :  .: .#+++++++++=--++=-..#   :*=*-                    :-==-.    *....:-=+*%%*+++=-::.   *.\n"+         
							"\t:#:  .:  .-%=--::.  ..:-=+**%%%-  #==-:-=-*===   #+**+=+*##+-:*-=+.  *++*%@#*=-:..:-=++++##*++\n"+          
							"\t.# .:  :.  :.:-#==++++++=--:..:+==%+-.    .==#:  #----::..:===   :+  :%+-:.:=+++++-::.   #====+=:\n"+       
							"\t+++==:  : .-+*#        .:*%*++++=..-+*+=.   #.  -*======-:    :+#+   *=+++=:-*.        :+  -+::+*- \n"+     
							"\t\t.:=++*+#-  *.        *=     .-++*=:.:+*++=   =-        :+*+-:#    ==      .=       .#+.  .#: .*+ \n"+    
							"\t\t-#.  .+*  =     -           .=*#+:.-+++*=     .=**=.:=*#=    +:       .   .: -+.:#=  --  .% \n"+    
							"\t\t*= .+*-:+-+                   ==.=**=:.-+*+++*+:.=**=%:.*:  :*    -      .*=+-    +* .  .#- \n"+    
							"\t\t-%=%+-:..-#+:.      +         :     :=*+-.  .-+*+:   *=  :==-    .+    :+%%*+++++++**  =#: \n"+    
							"\t\t\t:#**::--=+++*#%%#*+==**:..               :=+++-.              ..:=%+*###*+=-:.  ..::-% .@. \n"+     
							"\t\t%:-*++++==-::.  .:-=**##*+====================================+*#**=:..:-=++++++==---:  *= \n"+     
							"\t\t%:      .::-=++++++=-:..:=+*+-.                          .-+*+=:.:=++++=:.     .=++:    :# \n"+     
							"\t\t=*.=+++-    .      .:-++*+-:.:=**=.                  .=**=:.:=+*+-:     .   .::.  .-:  :#= \n"+     
							"\t\t\t-#=.   .=**+**    =      :=+++:.:=*+-.          .-+*=:.-+*+=:        .+: .*+--+#+=-=**=.    \n"+   
							"\t\t\t:=+++*#    =*   :*-...:-.  .-+*+:.:+*+:.   :+*+:.-+*+-.    .:=++=+*+. .%:    %:.:.      \n"+     
							"\t\t\t*.    #-    -===:        .-+*=:.-++++-.:+*+-.             .    .#-    -#       \n"+        
							"\t\t\t-*.   .#=.        -*++++++++-:=*+=--=**=:=:  .=*=+=++-:      :+*:    .%:    \n"+           
							"\t\t\t-#:    -**=---=**=.       .=#:  :--: .=+: :*+:      :-++++++=:     -#:  \n"+              
							"\t\t\t.+*=.    .:::.             .**:      .:=*=.                    :+*=.   \n"+             
							"\t\t\t  :+*+=:                    .=+++++++-.                  .-=**=.       \n"+            
						"\t\t\t\t   :=++++=-:.                                 .:-=+++++-.       \n "+                
							"\t\t\t\t\t.:-=++++++++++============++++++++++++=--:.         \n"+                     
							"\t\t\t\t\t\t\t.....::::.....  \n"  );                                          
							         
         
         
 

        System.out.println("Fatec todos os direitos reservados: 28/11/2022 ");
		 
		 

	}
	
	public static void ExibeLista(ArrayList<Cliente> listaClientes) {
		
		for(Cliente a: listaClientes) {
			
			System.out.printf("\n\nID %d \nNome:%s \nEmail:%s\n",a.getId(), a.getNome(), a.getEmail());
		}
		
	}
	
public static void ListarProdutos(ArrayList<Produtos> listaProdutos) {
		
		for(Produtos a: listaProdutos) {
			
			System.out.printf("\n\nID %d \nNome:%s \nPreco:%.2f\nEstoque: %.2f \n",a.getId(), a.getNome(),a.getPreco(), a.getEstoque());
		}
		
	}
	
	public static void ListarPedidos(ArrayList<ItemPedido> Lista) {
		
		for(ItemPedido a: Lista) {
			
			System.out.printf("\n\nID %d \nNome:%s \nQuantidade: %.2f\n",a.getId(), a.getNome(), a.getQuantidade());
		}
		
	}
	
	
		
	
}
