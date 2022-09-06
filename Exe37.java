import java.util.*;

public class Exe37 {
	//37. Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
	       
        int num,t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
        
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
        
        }
        

	        for (i=1; i<=20; i++) {
	        	
	        	//if(i==11) {
	        		 
	        		//System.in.wait();
	        	//}
	           
	            t = num * i;
	            System.out.printf("\n%d X %d = %d", num, i, t);
	        }
	


	}

}
