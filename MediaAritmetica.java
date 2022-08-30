package CalcMedia;

//4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
import java.util.*;

public class Media {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double media=0, a;
		int i=0;
		
		while(i <= 3) {
			
			System.out.printf("digite 4 Valores - Valor: ["+i+"]\n");
			System.out.printf("Digite um valor: ");
			a = ler.nextInt();
			
			media += a;
			i++;
		}
		
		media = media/4;
		
		System.out.printf("A área do Quadrado é: %.2f ", media);

	}

}
