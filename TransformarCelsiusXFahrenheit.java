package CelsiusXFahrenheit;

//5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
//Utilizamos a fórmula TC/5 = (TF – 32)/9, em que TC é temperatura em graus Celsius e TF é temperatura em Fahrenheit.
import java.util.*;

public class CalcCelsiusXFahrenheit {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int TC=0, TF=0, a=5;
		System.out.printf("Digite um valor em Celsius: ");
		TC = ler.nextInt();
		
		TC = TC*9;
		a = 5*32;
		TC = a+TC;
		TF = TC/5;
		
		
		System.out.printf("O valor em Fahrenheit é: %d ", TF);
	}

}
