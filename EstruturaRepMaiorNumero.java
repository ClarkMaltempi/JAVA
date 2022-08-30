package pkgEstRepeticaoMaiorNum;

import java.util.*;

public class Estrutura_MaiorNum {

	public static void main(String[] args) {
		
		
		int i=1, a=0, b=0, c=0;
		Scanner ler = new Scanner(System.in);
		
		
		while(i <= 3) {
			
			switch(i) {
				
			case 1:
				System.out.printf("Digiteum Numero: ");
				a = ler.nextInt();
			break;
			
			case 2:
				System.out.printf("Digiteum Numero: ");
				b = ler.nextInt();
			break;
			
			case 3:
				System.out.printf("Digiteum Numero: ");
				c = ler.nextInt();
			break;
				
			}
			i++;
		}
		
		if(a > b && a > c) {
			
			System.out.printf("Maior Numero: %d", a);
		}else if(b > a && b > c) {
			System.out.printf("Maior Numero: %d", b);
		}else if(c > a && c > b) {
			System.out.printf("Maior Numero: %d", c);
		}else {
			
			System.out.printf("Existe dois ou mais Numeros iguais e um deles eh menor que a igualdade!");
			
		}

	}

}
