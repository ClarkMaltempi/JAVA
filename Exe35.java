import java.util.*;

//35. Entrar via teclado com um valor qualquer. Travar a digitação, 
//no sentido de aceitar somente valores positivos. Após a digitação, 
//exibir a tabuada do valor solicitado, no intervalo de um a dez.

public class Exe35 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	       
        int num, t, i;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
       
        while(num <= 0) {
            System.out.printf("Erro, número negativo! Digite um número positivo: ");
            num = ler.nextInt();
        }
       
        for (i=1; i<=10; i++) {
           
            t = num * i;
            System.out.printf("\n%d X %d = %d", num, i, t);
        }

		

	}

}
