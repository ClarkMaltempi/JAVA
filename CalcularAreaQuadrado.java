package AreaQuadrado;


import java.util.*;


public class Quadrado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double a, area;
		
		System.out.printf("Digite o valor de um lado do quadrado: ");
		a = ler.nextInt();
		
		
		area = Math.pow(a, 2);
		
		
		System.out.printf("A área do Quadrado é: %.2f ", area);

	}

}
