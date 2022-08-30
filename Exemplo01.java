//Programa: Entrar com 2 valores, realizar a soma deles e exibir o resultado

package entrada_saida;

import java.util.Scanner;

public class segundo{
	
	public static void main (String[] args){
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o primeiro valor: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma é: %d ", soma);
	}
	
}
