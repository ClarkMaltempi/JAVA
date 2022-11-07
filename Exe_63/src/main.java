import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<PessoaFisica> pesFisica = new ArrayList();
		ArrayList<PessoaJuridica> pesJuridica = new ArrayList();
		
		int id=0,opcao=0;
		String nome, cpf, cnpj, idade;
		
do{
				
			opcao = Imprime();
			
			switch(opcao) {
				
		
		case 1:
			
			PessoaFisica pFisica = new PessoaFisica();
			
			id = pesFisica.size() + 1;
			pFisica.setId(id);
		
        	 System.out.println("Digite o nome: ");
     		 nome = ler.next();
     		pFisica.setNome(nome);
     		 
     		 System.out.println("Digite a idade: ");
    		 idade = ler.next();
    		 pFisica.setIdade(idade);
			
			 System.out.println("Digite o CPF: ");
			 cpf = ler.next();
     		 pFisica.setCpf(cpf);
     		 
     		 pesFisica.add(pFisica);
    		 
    		 System.out.println("\n\ncadastrada com sucesso!!"); 
		

		break;
		
		case 2:
			
			PessoaJuridica pJuridica = new PessoaJuridica();
			
			id = pesJuridica.size() + 1;
			pJuridica.setId(id);
		
        	 System.out.println("Digite o nome: ");
     		 nome = ler.next();
     		 pJuridica.setNome(nome);
     		 
     		 System.out.println("Digite a idade: ");
    		 idade = ler.next();
    		 pJuridica.setIdade(idade);
			
			 System.out.println("Digite o CNPJ: ");
    		 cnpj = ler.next();
    		 pJuridica.setCnpj(cnpj);
    		 
    		
    		 pesJuridica.add(pJuridica);
   		 
    		 System.out.println("\n\ncadastrada com sucesso!!"); 
			
		break;
		
		case 3:
			
			ExibeLista(pesFisica,pesJuridica);
				
		break;
		
			
		default:
			System.out.println("Numero Inválido!");
		break;
		
		case 9:
			System.out.println("\n Você escolheu Sair!!\n");
		break;
		
		}
			
		}while(opcao != 9);
		
	}
	
	public static int Imprime() {
		
		int opcao=0;
		Scanner ler = new Scanner(System.in);
		
		 System.out.printf("===> Sistema de Cadastro de Contas <===\n\n");
         System.out.printf("Escolha uma opcao:\n");

		 System.out.printf("\n\n1 - Pessoa Fisica \n" +
                 "2 - Pessoa Juridica \n" +
                 "3 - Exibir Pessoa\n" +
                 "9 - Sair\n\n");
		 System.out.printf("Digite a opcao desejada: ");
		 opcao = ler.nextInt();
		 
		 return opcao;

	}
	
	public static void ExibeLista(ArrayList<PessoaFisica> pFisica, ArrayList<PessoaJuridica> pJuridica) {
		
		
		if(!pFisica.isEmpty()) {
			for(PessoaFisica b: pFisica) {
				
				System.out.println("/n [ Pessoa Física ]\n");
				System.out.printf("\nID: %d\n Nome: %s\n Idade:%s\n CPF: %s\n ",b.getId(), b.getNome(), b.getIdade(), b.getCpf());
			}
		}
		
		if(!pJuridica.isEmpty()) {
			for(PessoaJuridica c: pJuridica) {
				System.out.println("/n [ Pessoa Juridica ]\n");
				System.out.printf("\nID: %d\n Nome: %s\n Idade:%s\n CNPJ: %s\n ",c.getId(), c.getNome(), c.getIdade(), c.getCnpj());
			}
		
		}
		
	}
	
}
