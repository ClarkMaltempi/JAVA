import java.util.Scanner;

public class Exe43SeqSoma {

	public static void main(String[] args) {
		
		
		
		int N, soma=0, i=1,x=0, NumAnt=2, NumSeq=1, den=0, somaden=0, somaAnt=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor menor que 50 positivo, para exibir a soma da sequencia: ");
		N = ler.nextInt();
		
		while(N > 50 || N < 0) {
			System.out.println("ERRO! Digite um numero menor que 50 e positivo");
			N = ler.nextInt();
		}
		
		
		while(x < 1){
			
			
			System.out.printf("%d ,", NumAnt);
			
			
			NumSeq +=2;//3
			NumAnt += NumSeq;//5+3
			
			somaden = NumAnt + NumSeq;
			
			while(i < N) {
				
				System.out.printf("\n %d / %d ,", NumAnt, somaden);
				 
				NumSeq +=2;
				den = NumAnt;
				NumAnt += NumSeq; //10 Numerador
				somaden = den+NumAnt+somaden+i;//denominador
				
				System.out.printf(" \nSoma anterior %d ,", somaAnt);
				

				
				i++;
						
			}
			
			x++;
		}
		
		
		
	}

}
