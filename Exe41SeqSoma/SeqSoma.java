
import java.util.*;


public class SeqSoma {

	public static void main(String[] args) {
		
		
		int N, soma=0, i=0,x=0, NumAnt=2, NumSeq=1;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor menor que 100 para exibir a soma da sequencia: ");
		N = ler.nextInt();
		
		while(N > 100) {
			System.out.println("ERRO! Digite um numero menor que 100");
			N = ler.nextInt();
		}
		
		
		while(x < N){
			
	
			System.out.printf("%d ,", NumAnt);
			soma += NumAnt;
			NumSeq +=2;
			NumAnt += NumSeq;
			
			
			x++;
			
		}
		
		System.out.println("\n\nVALOR TOTAL DA SOMA: ");
		System.out.printf("Total = %d", soma);
		
		
		
		
		

	}

}
