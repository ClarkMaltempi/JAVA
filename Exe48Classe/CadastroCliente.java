package ExeClasse;
import java.util.*;

public class CadastroCliente {

	public static void main(String[] args) {
		
		
		Cliente[] c = new Cliente[5];
		Scanner ler = new Scanner(System.in);
		
		
		for(int i=0; i<=1;i++) {
			
			Cliente p = new Cliente();
			
			// Popula o objeto (preenche os atributos do objetos)
            System.out.printf("Digite o id do cliente: ");
            p.id = ler.nextInt();
           
            System.out.printf("Digite o nome: ");
            p.nome = ler.next();
            
            System.out.printf("Digite a idade: ");
            p.idade = ler.nextInt();
            
            System.out.printf("Digite o email: ");
            p.email = ler.next();
           
            // Adiciona o objeto no array "listaPessoas"
            c[i] = p;            

		}
		
		for(int i=0; i<=1; i++) {
			
			//System.out.printf("\nPessoa %d criada com sucesso (%s)!", c[i].id, c[i].nome, c[i].idade, c[i].email);
			
			
			if(c[i].idade > 18) {
				
				System.out.printf("%s - %d", c[i].nome, c[i].idade);
				
			}
			
			
		}
		
		
		
		
		

	}

}
