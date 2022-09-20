import java.util.*;

public class Exe25_Par {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero para saber se e par ou impar");
		num = ler.nextInt();
		
		if(num%2 == 0) {
			
			System.out.println("Esse numero e Par");
		}else {
			System.out.println("Esse numero e impar");
		}
		

	}

}
