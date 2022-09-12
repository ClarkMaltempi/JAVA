import java.util.*;

//42. Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. 
//O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. 
//Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente.

//Sequencia: 1/2, 2/3, 3/4, 4/5


public class Seqfracao {

	public static void main(String[] args) {
		
		
int N, num=1, den=2,x=0;
float soma=0, somaden=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Entre com o valor menor que 50 positivo, para exibir a soma da sequencia: ");
		N = ler.nextInt();
		
		while(N > 50 || N < 0) {
			System.out.println("ERRO! Digite um numero menor que 50 e positivo");
			N = ler.nextInt();
		}
		
		
		while(x < N){
			
			
			System.out.printf("%d / %d  ,  ", num, den);
			num++;
			den++;
			
			
			
			x++;
			
		}
		
		soma+=num;
		somaden+=den;
		
		System.out.println("\n\nVALOR TOTAL DA SOMA: ");
		System.out.printf("Total = %.0f / %.0f", soma, somaden);
		
		
		


	}

}
