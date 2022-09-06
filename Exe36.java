import java.util.*;

//36. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
//Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), deverá ser maior que o primeiro (A), 
//caso contrário, digitar novamente somente o segundo. Após a validação dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, 
//ou seja, a tabuada de X no intervalo de B para A.


public class Exe36 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	       
        int num, num2, t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
        
        System.out.printf("Digite o número que deseja começar a contagem ");
        num2 = ler.nextInt();
        
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
       
        }
        
      
       
	        for (i=num2; i>=1; i--) {
	           
	            t = num * i;
	            System.out.printf("\n%d X %d = %d", num, i, t);
	        }

        
		
		
		
	}

}
