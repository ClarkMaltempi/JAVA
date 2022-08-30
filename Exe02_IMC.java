package estrutura_decisao;


import java.util.Scanner;


public class Ex09{

	public static void main (String[] args){
	
		Scanner ler = new Scanner (System.in);
		
		double alt, peso, imc;
		
		System.out.printf("Digite a sua altura: ");
		alt = ler.nextDouble();
		
		System.out.printf("Digite a sua peso: ");
		peso = ler.nextDouble();
		
		imc = peso / (alt* alt);
		
		if (imc < 20){
		
			System.out.printf("Abaixo peso");
		}else if (imc < 25){
			System.out.printf("Peso ideal");
		}
		else{
			System.out.printf("Acima do peso");
		}
	
	
	}








}