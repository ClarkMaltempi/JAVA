import java.util.*;

public class Exe12RetTerr {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("Digite o valor da base do retangulo: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retangulo: ");
		b = ler.nextInt();
		
		area = a * b;
		
		if(area > 100) {
			System.out.printf("Terreno Grande ");
		}else {
			System.out.printf("Terreno Pequeno ");
		}
		

	}

}
