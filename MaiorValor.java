package MaiorVal;

//8. Entrar via teclado, com dois valores distintos. Exibir o maior deles.
//9. Entrar via teclado, com dois valores distintos. Exibir o menor deles.


import java.util.*;


public class MaiorNum {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		
		int a, b, NumM;
		
		//Entrar via teclado, com dois valores distintos. Exibir o maior deles.
		System.out.printf("Digite um Numero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro Numero: ");
		b = ler.nextInt();
		
		
		if(a > b) {
			
			System.out.printf("Maior Numero: %d", a);
		}else if(b > a) {
			
			System.out.printf("Maior Numero: %d", b);
		}else {
			System.out.printf("Num A e Num B Sao Iguais!!!");
		}
		
		System.out.printf("\n\n");
		
		if(a < b) {
			
			System.out.printf("Esse eh o Menor Numero: %d", a);
		}else if(b < a) {
			System.out.printf("Esse eh o Menor Numero: %d", b);
		}
		
		

	}

}
