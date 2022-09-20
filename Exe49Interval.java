import java.util.*;

//49. Crie um programa que solicite que o usuário entre com dois números (inicial e final). 
//Ao final o programa deverá apresentar o valor total da soma de todos os números do intervalo digitado pelo usuário


public class Exe49Interval {

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
			
			
			System.out.printf(" %d ", i);
			
			i++;
		}

	}

}
