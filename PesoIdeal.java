package pkgPesoIdeal;


//Entrar com o peso e a altura de uma determinada pessoa. 
//Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

import java.util.*;


public class PesoIdeal {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);	
	double peso, altura, pesoideal;
	
	System.out.printf("Digite o seu peso: ");
	peso = ler.nextDouble();

	System.out.printf("Digite o sua altura: ");
	altura = ler.nextDouble();
	
	pesoideal = peso/(Math.pow(altura, 2));
	
	if(peso > pesoideal) {
		
		System.out.printf("Você está acima do peso ");	
	}else {
		
		System.out.printf("Você está com do peso ");	
	}
	
	}

}
