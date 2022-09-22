import java.util.Scanner;

//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.
public class Exe09_MenorNum {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a, b, NumM;
		
		//Entrar via teclado, com dois valores distintos. Exibir o maior deles.
		System.out.printf("Digite um Numero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro Numero: ");
		b = ler.nextInt();
		
		
		if(a < b) {
			
			System.out.printf("\nEsse eh o Menor Numero: %d", a);
		}else if(b < a) {
			
			System.out.printf("\nEsse eh Menor Numero: %d", b);
		}else {
			System.out.printf("\nNum A e Num B Sao Iguais!!!");
		}
		
		System.out.printf("\n\n");
		
		if(a > b) {
			
			System.out.printf("Maior Numero: %d", a);
		}else if(b > a) {
			System.out.printf("Maior Numero: %d", b);
		}

	}

}
