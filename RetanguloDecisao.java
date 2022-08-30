package arearetangulo;

//Calcular e exibir a área de um retângulo, 
//a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, 
//exibir a mensagem “Terreno grande”.


import java.util.*;

public class retangulo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("Digite o valor da base do retangulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retangulo: ");
		b = ler.nextInt();
		
		area = a * b;
		
		System.out.printf("A área do Retangulo é: %d ", area);
		
		System.out.printf("\n ");
		
		
		if(area > 100) {
			
			System.out.printf("Terreno grande!!!");
		}else{
			
			System.out.printf("Terreno pequeno!!!");
		}

	}

}
