
import java.util.*;

//53. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para cadastrar 5 alunos em uma lista de alunos. 
//Durante o cadastro do aluno, solicitar para o aluno cadastrar 
//a sigla/iniciais das 6 matérias que ela está cursando no momento. Ao final exibir apenas os alunos do período “noite”.

public class Nota_aluno {
	
	

		public static void main(String[] args) {
	       
			Aluno [] listaAluno = new Aluno[6];
			String temp=" ";
	        
	        Scanner ler = new Scanner (System.in);
	           
	        	for (int i=0; i<6; i++) {
	                
	            Aluno a = new Aluno();
	            
	            System.out.printf("Digite o RA: ");
	            a.ra = ler.next();
	            
	            System.out.printf("Digite o nome: ");
	            a.nome = ler.next();
	            
	           do
	            {
	            	System.out.printf("Digite o periodo (noite | manha | tarde): ");
	            	temp = ler.next();
	            	a.periodo = temp;
	            	
	            	
	            } while (temp == "noite" && temp == "manha" && temp == "tarde" );
	            
	            for (int j=0;j<6;j++)
	          {
	            System.out.printf("Digite as iniciais das materias: ");
	            a.materias = ler.next();
	          }
	            
	            System.out.printf("\n");
	            
	            listaAluno [i] = a;
	            
	            }
	        
	        
	        for (int k=0; k<6; k++)
	        {
	            if(listaAluno[k].periodo .equals("noite"))        
	            {    
	            System.out.printf("\nRA: %s \nNome: %s \nPeriodo: %s", listaAluno[k].ra, listaAluno[k].nome, listaAluno[k].periodo);
	            }    
	        }    
	    }    
	}


