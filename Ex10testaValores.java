import java.util.*;

//10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.

public class Ex10testaValores {

	public static void main(String[] args) {
	
		int num, num2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um primeiro numero: ");
		num = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = ler.nextInt();
		
		if(num>num2){
			
			System.out.printf("Maior Numero Digitado: %d", num);
		}else if(num2 > num) {
			System.out.printf("Maior Numero Digitado: %d", num2);
		}else {
			System.out.printf("os Numeros Digitados são iguais");
		}
		
	}

}
