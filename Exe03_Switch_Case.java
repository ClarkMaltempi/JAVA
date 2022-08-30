package estrutura_decisao;

import java.util.Scanner;


public class Ex10{
	
	
	public static void main (String[] args){
		
		Scanner ler =new Scanner(Ssytem.in);
		
		System.out.println("Entre com um número entre 1 e 4:");
		int num = ler.nextInt();
		
		
		switch (num){
			
		case 1:
			System.out.println("Você escolheu 1");		
		break;	
		case 2:
			System.out.println("Você escolheu 2");
		break;
		case 3:
			System.out.println("Você escolheu 3");
		break;
		case 4:
			System.out.println("Você escolheu 4");
		break;
		default:
			System.out.println("Número Inválido");
		}
	}
	
}