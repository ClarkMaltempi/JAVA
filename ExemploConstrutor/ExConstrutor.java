
import java.util.*;

public class ExConstrutor {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner (System.in);
		
		//Cria um array contendo 3 posições para armazenar objetos
		Pessoa[] listaPessoas = new Pessoa [3];
		
		int id, idadeDep;
		String nome, nomeDep;
		char possuiDependente;
		
		 for (int i=0; i<=2; i++) {
			   
	            Pessoa p;
	           
	            // Popula o objeto (preenche os atributos do objetos)
	            System.out.printf("Digite o id da pessoa: ");
	            id = ler.nextInt();
	           
	            System.out.printf("Digite o nome da pessoa: ");
	            nome = ler.next();
	           
	            System.out.printf("Possui dependente? (S/N)");
	            possuiDependente = ler.next().charAt(0);
	            
	            if (possuiDependente == 'S') {
	                System.out.printf("Digite o nome do dependente: ");
	                nomeDep = ler.next();
	               
	                System.out.printf("Digite a idade do dependente: ");
	                idadeDep = ler.nextInt();
	               
	                // Instancia o dependente
	                Dependente d = new Dependente(nomeDep, idadeDep);
	               
	                // Instancia (cria) o objeto pessoa com o dependente
	                p = new Pessoa(id, nome, d);
	            }
	            else {
	                // Instancia (cria) o objeto pessoa sem o dependente
	                p = new Pessoa(id, nome, null);            
	            }
	           
	            // Adiciona o objeto no array "listaPessoas"
	            listaPessoas[i] = p;            
	            
	            
		 }
		 
		 
		 for (int i=0; i<=2; i++) {
	            System.out.printf("\nPessoa %d criada com sucesso (%s)!", listaPessoas[i].id, listaPessoas[i].nome);
	                   
	            if (listaPessoas[i].dependente != null) {
	                System.out.printf("\n Dependente: %s", listaPessoas[i].exibirDependente());
	            }

		 }
		 
		 
	}

}
