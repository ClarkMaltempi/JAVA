import java.util.*;

//50. Elabore um programa que apresente os números pares maiores que 10 no intervalo fechado [A, B]. 
//Sendo que A e B serão números inteiros escolhidos pelo usuário. Um número é par quando este satisfaz a seguinte condição: (NÚMERO mod 2 = 0)


public class Exe50_ParInterval {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int num=0, numf=0, i=0;
		
		System.out.printf("Digite um numero inicial: ");
		num = ler.nextInt();
		
		do {
		
		System.out.printf("Digite um numero final tem que ser maior que o inicial: ");
		numf = ler.nextInt();
		
		}while(num > numf);
		
		i=num;
		
		while(i != numf) {
			
			if(i%2==0 && i>10) {
				System.out.printf(" %d ", i);
			}
			
			i++;
		}
		

	}

}
