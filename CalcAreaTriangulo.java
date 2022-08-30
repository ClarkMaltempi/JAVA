package AreaTriangulo;

import java.util.*;

public class Triangulo {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, area;
		
		System.out.printf("Digite o valor da base do Triangulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do Triangulo: ");
		b = ler.nextInt();
		
		area = a*b/2;
		
		System.out.printf("A área do Quadrado é: %.2f ", area);

	}

}
