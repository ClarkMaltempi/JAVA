package estrutura_decisao;



import java.util.Scanner;


public class Ex08 {

	public static void main (String[] args){
	
		Scanner ler = new Scanner (System.in);
		
		double p1, p2, m;
		
		System.out.printf("Digite a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite a nota da P2: ");
		p2 = ler.nextDouble();
		
		m = (p1 + p2) / 2;
		
		if(m >= 5){
			System.out.printf("A sua média foi %.1f. Portanto você está APROVADO!", m);
	
		}else{
			System.out.printf("A sua média foi %.1f. Portanto você está REPROVADO!", m);
		
		}
		
	
	
	}


}