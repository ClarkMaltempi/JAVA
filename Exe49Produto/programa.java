import java.util.*;



public class programa {

	public static void main(String[] args) {
		
		
		Produto[] c = new Produto[5];
		Scanner ler = new Scanner(System.in);
		
		
		for(int i=0; i<=1;i++) {
			
			Produto p = new Produto();
			
			// Popula o objeto (preenche os atributos do objetos)
            System.out.printf("Digite o id do cliente: ");
            p.id = ler.nextInt();
           
            System.out.printf("Digite a descricao: ");
            p.descricao = ler.next();
            
            System.out.printf("Digite a idade: ");
            p.quantidade = ler.nextInt();
            
            System.out.printf("Digite o email: ");
            p.valor = ler.nextInt();
           
            // Adiciona o objeto no array "listaPessoas"
            c[i] = p;            

		}
		
		for(int i=0; i<=1; i++) {
			
			//System.out.printf("\nPessoa %d criada com sucesso (%s)!", c[i].id, c[i].nome, c[i].idade, c[i].email);
			
			
			if(c[i].valor > 18) {
				
				System.out.printf("%s - %d", c[i].descricao, c[i].valor);
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
