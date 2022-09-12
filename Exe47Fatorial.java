
//47. Calcular o fatorial de um valor que será digitado. Este valor não poderá ser negativo. Enviar mensagem de erro e solicitar o valor novamente, se necessário. Perguntar se o usuário deseja ou não fazer um novo cálculo, consistir a resposta em “S” ou “N”.
//N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1))
//Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120



import java.util.Scanner;


public class Exe47Fatorial {

	public static void main(String[] args) {
		
		char opc = 'S';
		
		Scanner ler = new Scanner(System.in);
		
		int N, i=1, f=0;
		
		while(opc != 'N') {
			
			System.out.println("Quantos Numeros deseja digitar? ");
			N = ler.nextInt();
			
			
			while(N > 20 || N < 0) {
				System.out.println("ERRO! Digite um numero menor que 50 e positivo");
				N = ler.nextInt();
			}
			
			i=N;
			
			
			while(i > 1) {
				
				
				N = N *(i-1); 
				

				i--;
				//System.out.printf("\n%d", N);
				
			}
			
			
			System.out.printf("\nTotal: %d", N);
			
			
			System.out.println("\n\nDeseja continuar digite: 'S' ou 'N' para Sair ");
			opc = ler.next().charAt(0);
			
			
			
		}
			
		
		System.out.println("\n\nFim");

		
	}

}
