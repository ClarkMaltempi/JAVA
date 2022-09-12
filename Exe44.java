//44. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de erro, se necessário. Após a digitação, exibir:
//a) O maior valor;
//b) A soma dos valores;
//c) A média aritmética dos valores;

import java.util.*;

public class Exe44 {

	public static void main(String[] args) {
		
		int num, MaiorVal=0, Soma=0,media=0,i=1;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		while(i <= 10) {
			
			System.out.printf("Digite um numero inteiro");
			num = ler.nextInt();
			Soma+=num;
		
			
			if(MaiorVal < num) {
				MaiorVal = num;
			}
				
				
			
			i++;
			
		}
		media = Soma/10;
		System.out.printf("\nMaior valor: %d",MaiorVal);
		System.out.printf("\nSoma dos Valores: %d", Soma);
		System.out.printf("\nMedia: %d", media);
		
		
	}

}
