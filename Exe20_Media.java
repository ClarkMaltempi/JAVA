import java.util.*;

public class Exe20_Media {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double P1=0, P2=0, MEDIA=0;
		
		System.out.println("Nota da P1");
		P1 = ler.nextDouble();
		
		System.out.println("Nota da P2");
		P2 = ler.nextDouble();
		
		MEDIA = (P1 + 2*P2) / 3;
		
		if(MEDIA < 5) {
			MEDIA = 5-MEDIA;
		}else {
			System.out.println("Aprovado");
		}
		
		
		System.out.printf("Valor restante para passar: %.2f", MEDIA);
		
		
	}

}
