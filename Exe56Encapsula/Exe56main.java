import java.util.*;

public class Exe56main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Produto [] prod = new Produto[5];
		
		int i=0, id,idcat=0;
		String nome, nomecat=" ";
		double quantidade,preco;
		char temp= ' ';
		
		
		
		while(i != 4) {
			Produto p = new Produto();
			
			
			System.out.println("Digite o id");
			id = ler.nextInt();
			p.setId(id);
			
			System.out.println("Digite o nome");
			nome =ler.next();
			p.setNome(nome);
			
			System.out.println("Digite o preco");
			preco = ler.nextDouble();
			p.setPreco(preco);
			
			System.out.println("Digite a quantidade");
			quantidade = ler.nextDouble();
			p.setQuantidade(quantidade);
			
			
			System.out.println("Produto tem Categoria S/N");
			temp = ler.next().charAt(0);
			

			if(temp == 'S') {
				
							
				System.out.println("Digite o id da Categoria");	
				idcat = ler.nextInt();
				
				
				System.out.println("Digite o nome da Categoria");
				nomecat = ler.next();
				
				Categoria cat = new Categoria(idcat,nomecat);
				p.setCategoria(cat);
				
			}
			
			
			

			prod[i] = p;
			
			i++;
		}
		
		i=0;
		while(i != 4) {
			
			System.out.printf("\nID: %d Produto: (%s) \nPreco:(%f) \nQuantidade:(%f)!", prod[i].getId(), prod[i].getNome(), prod[i].getPreco(), prod[i].getQuantidade());
			System.out.printf("\n\nCategoria: Id(%d) \n Nome Categoria:(%s)", prod[i].getCategoria().getId(),prod[i].getCategoria().getNome());
			
			i++;
		}
		
		
	}

}
