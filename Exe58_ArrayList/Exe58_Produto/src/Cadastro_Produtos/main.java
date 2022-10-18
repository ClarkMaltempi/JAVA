package Cadastro_Produtos;
import java.util.*;



public class main {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
	
		ArrayList<Produto> ListaProdutos = new ArrayList<>(); 
		
		
		String nome, cnome;
		int id, opcao=0, idcat=0;
		double quantidade, preco;
		char cat;
		
		
		
		do{
				
			opcao = Imprime();
			
			switch(opcao) {
				
			
			case 1://incluir
				Produto c = new Produto(); 
				id = ListaProdutos.size() + 1;
				c.setId(id);
					
				System.out.println("Digite o nome do Produto: ");
				nome = ler.next();
				c.setNome(nome);
				
				System.out.println("Digite o preco do Produto: ");
				preco = ler.nextDouble();
				c.setPreco(preco);
				
				System.out.println("Digite a Quantidade do Produto: ");
				quantidade = ler.nextDouble();
				c.setQuantidade(quantidade);
				
				 System.out.printf("Possui uma Categoria? (S/N)");
				 cat = ler.next().charAt(0);
		         
		         if (cat == 'S') {
		        	 
		        	 
		        	 System.out.println("Digite o ID da Categoria: ");
		     		 idcat = ler.nextInt();
		     		
		     		 
		     		 System.out.println("Digite a Categoria: ");
		    		 cnome = ler.next();
		    		
		 
		    		 Categoria ca = new Categoria(idcat,cnome);
		    		 c.setCategoria(ca);
		        	 ListaProdutos.add(c);
		    		  
		         	}else {
		         		
		         		idcat = 0;
		         		cnome = "Nao consta";
		         		Categoria cate = new Categoria(idcat,cnome);
		         		
		         		Produto pd = new Produto (id, nome, preco, quantidade, cate);
		         		c.setCategoria(cate);
		         		ListaProdutos.add(c);
		         		
		         	}
		break;	
		
		case 2:
			
			ExibeLista(ListaProdutos);
			
			System.out.println("\n\nQual Produto Deseja Atualizar?\n");
			id = ler.nextInt();
			
			
			Produto produto = ListaProdutos.get(id-1);
			
			
			produto.setId(id);
				
			System.out.println("Digite o nome do Produto: ");
			nome = ler.next();
			produto.setNome(nome);
			
			System.out.println("Digite o preco do Produto: ");
			preco = ler.nextDouble();
			produto.setPreco(preco);
			
			System.out.println("Digite a Quantidade do Produto: ");
			quantidade = ler.nextDouble();
			produto.setQuantidade(quantidade);
			
			 System.out.printf("Possui uma Categoria? (S/N)");
			 cat = ler.next().charAt(0);
	         
	         if (cat == 'S') {
	        	 
	        	 
	        	 System.out.println("Digite o ID da Categoria: ");
	     		 idcat = ler.nextInt();
	     		
	     		 
	     		 System.out.println("Digite a Categoria: ");
	    		 cnome = ler.next();
	    		
	 
	    		 Categoria ca = new Categoria(idcat,cnome);
	    		 produto.setCategoria(ca);
	        	 ListaProdutos.add(produto);
	    		  
	         	}else {
	         		
	         		idcat = 0;
	         		cnome = "Nao consta";
	         		Categoria cate = new Categoria(idcat,cnome);
	         		
	         		Produto pd = new Produto (id, nome, preco, quantidade, cate);
	         		produto.setCategoria(cate);
	         		ListaProdutos.add(produto);
	         		
	         	}
	         System.out.println("\n\nProduto atualizado com sucesso!!");
			
		break;
		
		case 3:
			
			ExibeLista(ListaProdutos);
			System.out.println("\n\nDigite o ID de Qual cliente Deseja Remover?\n");
			
			id = ler.nextInt();
			
			ListaProdutos.remove(id-1);
			System.out.println("\n\nProduto Removido com sucesso!!!\n");
			
		break;
		
		case 4:
			
			if(!ListaProdutos.isEmpty()) {
				ExibeLista(ListaProdutos);
			}else {
				System.out.println("\n\n****Nenhum Produto Cadastrado!!!****\n\n");
			}
			
		
			
		break;
		
		default:
			System.out.println("Numero Inválido!");
		break;
		
		case 5:
			System.out.println("\n Você escolheu Sair!!\n");
		break;
		
		
		}
			
		}while(opcao != 5);
		
	 

	}
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
         System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n\n1 - Incluir produto \n" +
                 "2 - Atualizar produto \n" +
                 "3 - Excluir produto \n" +
                 "4 - Exibir produto \n" +
                 "5 - Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 opcao = ler.nextInt();
		 
		 return opcao;

	}
	
	public static void ExibeLista(ArrayList<Produto> ListaProdutos) {
		
		for(Produto a: ListaProdutos) {
			
			System.out.printf("ID %d \nNome:%s \nPreco:%f \nQuantidade: %f \nID Categoria: %d \nNome Categoria: %s\n\n",a.getId(), a.getNome(), a.getPreco(), a.getQuantidade(),a.getCategoria().getId(), a.getCategoria().getNome());
		}
		
	}
	
		
	
}
